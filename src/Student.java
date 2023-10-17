public class Student extends User{
    // filter condition
    private String perferRegion;
    private double preferTutionFee;
    // value
    private Major my_Major;
    private Gpa my_Gpa;
    private LanguageScore my_LanguageScore;
    private Recommendation my_Recommendation;
    private Internship my_Internship;
    private Publication my_Publication;

    public Student(String name, String password)
    {
        super(name, password, false);
    }

    // 添加Student的其他方法
    public void getAdmission()
    {

    }

}
