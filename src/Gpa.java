public class Gpa extends Value{
    private double cgpa;
    private double major_gpa;
    
    public Gpa(double cgpa, double major_gpa)
    {

        this.cgpa = cgpa;
        this.major_gpa = major_gpa;
    }
    public double calculateWeightedValue()
    {
        double result = weightForC*cgpa + (1-weightForC)*major_gpa;
        return result;
    }
}
