public class User {
    private int id;
    private String name;
    private String password;
    private Gpa user_Gpa;
    private LanguageScore user_Score;
    private Recommendation recommendation;
    private Internship internship;
    private String region;
    private String major;

    // 需要为每个字段提供 getter 和 setter 方法
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Gpa getUser_Gpa() {
        return user_Gpa;
    }

    public void setUser_Gpa(Gpa user_Gpa) {
        this.user_Gpa = user_Gpa;
    }

    public LanguageScore getUser_Score() {
        return user_Score;
    }

    public void setUser_Score(LanguageScore user_Score) {
        this.user_Score = user_Score;
    }

    public Recommendation getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(Recommendation recommendation) {
        this.recommendation = recommendation;
    }

    public Internship getInternship() {
        return internship;
    }

    public void setInternship(Internship internship) {
        this.internship = internship;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}