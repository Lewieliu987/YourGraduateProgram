public class Gpa extends Value{
    private double cgpa;
    private double major_gpa;
    public Gpa(double cgpa, double major_gpa)
    {
        //需要具体权重
        super();
        this.cgpa = cgpa;
        this.major_gpa = major_gpa;
    }
    public double calculateWeightedValue()
    {
        //需要具体公式
        double result;
        return result;
    }
}
