package Database;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import Exceptions.DuplicateUniversityException;
import University.University;

public class DatabaseForUniversity extends Database {
    private ArrayList<University> AllUniversities;
    private static DatabaseForUniversity instance = new DatabaseForUniversity();

    public DatabaseForUniversity() {
        AllUniversities = new ArrayList<University>();
    }

    public static DatabaseForUniversity getInstance() {
        return instance;
    }

    public void addUniversity(University university) throws DuplicateUniversityException {
        if (findUniversity(university.getName()) == null) {
            AllUniversities.add(university);
            instance.writeUniversitiesToCSV();
        } // 若找到大学，需添加exception(duplicate)
        else {
            throw new DuplicateUniversityException("University already exists: " + university.getName());
        }
    }

    public University findUniversity(String name) {
        for (int i = 0; i < AllUniversities.size(); i++) {
            if (AllUniversities.get(i).getName().equals(name)) {
                System.out.println(AllUniversities.get(i).getName() + " found!");
                System.out.println("");
                return AllUniversities.get(i);
            }
        }
        return null;
    }

    public void readUniversitiesFromCSV() {
        // 从CSV文件中读取大学信息, 并写入AllUniversities
        try (BufferedReader br = new BufferedReader(new FileReader("./file/universities.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                AllUniversities.add(new University(values[0], values[1], values[2]));
                AllUniversities.add(new University(values[0], values[1], values[2]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
     * public void writeUniversitiesToCSV() {
     * // 将AllUniversities中的大学信息写入CSV文件
     * try (PrintWriter writer = new PrintWriter(new
     * FileWriter("./file/universities.csv", false))) {
     * for (University university : AllUniversities) {
     * writer.println(university.getName() + "," + university.getRegion() + "," +
     * university.getTier());
     * }
     * } catch (IOException e) {
     * e.printStackTrace();
     * }
     * }
     */

    public void writeUniversitiesToCSV() {
        // 将AllUniversities中的大学信息写入CSV文件
        try (PrintWriter writer = new PrintWriter(new FileWriter("./file/universities.csv", false))) {
            Set<String> writtenUniversities = new HashSet<>();
            for (University university : AllUniversities) {
                // Only write the university to the file if it hasn't been written yet
                if (!writtenUniversities.contains(university.getName())) {
                    writer.println(university.getName() + "," + university.getRegion() + "," + university.getTier());
                    writtenUniversities.add(university.getName());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}