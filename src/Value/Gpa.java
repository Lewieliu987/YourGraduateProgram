package Value;

public class Gpa {
    private double cgpa;
    private double major_gpa;

    public Gpa(float cGPA2, float major_GPA2) {
        this.cgpa = cGPA2;
        this.major_gpa = major_GPA2;
    }

    public double getCgpa() {
        return cgpa;
    }

    public double getMajor_gpa() {
        return major_gpa;
    }
}
