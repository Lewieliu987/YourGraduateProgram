package Value;
public class Gpa{
    private double cgpa;
    private double major_gpa;
    
    public Gpa(double cgpa, double major_gpa)
    {

        this.cgpa = cgpa;
        this.major_gpa = major_gpa;
    }

    public double getCgpa() {
        return cgpa;
    }

    public double getMajor_gpa() {
        return major_gpa;
    }
}
