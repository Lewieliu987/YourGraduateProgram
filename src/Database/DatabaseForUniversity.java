package Database;

import java.util.ArrayList;

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

    public void addUniversity(University university) {
        if (findUniversity(university.getName()) == null) {
            AllUniversities.add(university);
        } // 若找到大学，需添加exception(duplicate)
    }

    public University findUniversity(String name) {
        for (int i = 0; i < AllUniversities.size(); i++) {
            if (AllUniversities.get(i).getName() == name) {
                return AllUniversities.get(i);
            }
        }
        return null;
    }
}