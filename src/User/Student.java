package User;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import Algorithm.Predictor;
import System.UniversityFilter;
import Value.EveryInternship;
import Value.EveryPublication;
import Value.EveryRecommendation;
import Value.Gpa;
import Value.Internship;
import Value.LanguageScore;
import Value.Major;
import Value.Publication;
import Value.Recommendation;

public class Student extends User {
    // personal info
    private Major my_Major;
    private int homeSchoolRank;
    // filter condition
    private int applicationType;
    private String preferRegion;
    private double preferTuitionFee;
    // value
    private Gpa my_Gpa;
    private LanguageScore my_LanguageScore;
    private Recommendation my_Recommendation;
    private Internship my_Internship;
    private Publication my_Publication;
    private int expected_tier;

    public Student(String name, String password) {
        super(name, password, "false");
        my_Internship = new Internship();
        my_Publication = new Publication();
        my_Recommendation = new Recommendation();
    }

    // Setter method for my_Major
    public void setMyMajor(Major major) {
        this.my_Major = major;
    }

    // Setter method for perferRegion
    public void setMyPreferRegion(int regionCode) {
        switch (regionCode) {
            case 1:
                this.preferRegion = "USA";
                break;
            case 2:
                this.preferRegion = "UK";
                break;
            case 3:
                this.preferRegion = "Europe";
                break;
            case 4:
                this.preferRegion = "Japan";
                break;
            case 5:
                this.preferRegion = "Singapore";
                break;
            case 6:
                this.preferRegion = "China Mainland";
                break;
        }
        ;
    }

    // Setter method for preferTuitionFee
    public void setMyPreferTuitionFee(double tuitionFee) {
        this.preferTuitionFee = tuitionFee;
    }

    public void setMyHomeSchoolRank(int rank) {
        this.homeSchoolRank = rank;
    }

    // Setter method for my_Gpa
    public void setMyGpa(Gpa gpa) {
        this.my_Gpa = gpa;
    }

    // Setter method for my_LanguageScore
    public void setMyLanguageScore(LanguageScore languageScore) {
        this.my_LanguageScore = languageScore;
    }

    // Setter method for my_Recommendation
    public void setMyRecommendation(int prof_level, int quality) {
        this.my_Recommendation.addRecommendation(new EveryRecommendation(prof_level, quality));
    }

    public void setMyInternship(int company_level, double duration) {
        this.my_Internship.addInternship(new EveryInternship(company_level, duration));
    }

    public void setMyPublication(int level) {
        this.my_Publication.addPublication(new EveryPublication(level));
    }

    public void setMyApplicationType(String applicationType) {
        switch (applicationType) {
            case "Master":
                this.applicationType = 1;
            case "PhD":
                this.applicationType = 2;
        }
    }

    public void getMyAdmission() {
        //
        Predictor p = new Predictor();
        this.expected_tier = p.getMaxProb(this.homeSchoolRank, this.my_Gpa.getCgpa(), this.my_Gpa.getMajor_gpa(),
                this.my_Recommendation.get_number_of_recommendations(),
                this.my_Internship.getNumInternships(), this.my_Internship.getNumInternships());
        // Map<Integer, String> universityMap =
        // loadUniversities("./file/universities.csv");
        Map<Integer, String> universityMap = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("./file/universities.csv"))) {
            String line;
            int id = 1; // Or however you generate IDs
            while ((line = reader.readLine()) != null) {
                // Store the complete line in the map
                universityMap.put(id++, line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        /*
         * for (Map.Entry<Integer, String> entry : universityMap.entrySet()) {
         * System.out.println("Key: " + entry.getKey() + ", Value: " +
         * entry.getValue());
         * }
         */
        // Print the university name
        UniversityFilter.printUniversitiesByTier(universityMap, expected_tier, preferRegion);
    }

    private Map<Integer, String> loadUniversities(String filename) {
        Map<Integer, String> universityMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                // Assuming the tier is at the third position and the university name at the
                // first position in the csv file
                int tier = Integer.parseInt(values[2]);
                String university = values[0];
                universityMap.put(tier, university);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return universityMap;
    }

    public int getTier() {
        return this.expected_tier;
    }
}
