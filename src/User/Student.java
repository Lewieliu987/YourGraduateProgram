package User;

import Algorithm.Predictor;
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
                this.preferRegion = "Hong Kong & Singapore";
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
        int final_tier = p.getMaxProb(int background_tier, double cgpa, double mgpa, int num_letter,
                    int num_intern, int num_paper);
    }

}
