public class Student extends User {
    // personal info
    private Major my_Major;
    // filter condition
    private String perferRegion;
    private double preferTuitionFee;
    // value
    private int homeSchoolRank;
    private Gpa my_Gpa;
    private LanguageScore my_LanguageScore;
    private Recommendation my_Recommendation;
    private Internship my_Internship;
    private Publication my_Publication;

    public Student(String name, String password) {
        super(name, password, false);
    }

    public Student() {
    }

    // Setter method for my_Major
    public void setMyMajor(Major major) {
        this.my_Major = major;
    }

    public void getMyAdmission() {
        // 等王子轩
    }

    // Setter method for perferRegion
    public void setPerferRegion(String region) {
        this.perferRegion = region;
    }

    // Setter method for preferTuitionFee
    public void setPreferTuitionFee(double tuitionFee) {
        this.preferTuitionFee = tuitionFee;
    }

    public void setHomeSchoolRank(int rank) {
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
    public void setMyRecommendation(Recommendation recommendation) {
        this.my_Recommendation = recommendation;
    }
}
