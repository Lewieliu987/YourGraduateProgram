package Other;

public class WeightedGPA {
    private double CGPA;
    private double MGPA;
    private double weightForC = 0.5;

    public WeightedGPA(double c, double m) {
        CGPA = c;
        MGPA = m;
    }

    public double getCGPA() {
        return CGPA;
    }

    public double getMGPA() {
        return MGPA;
    }

    public double getWeighted() {
        return CGPA * weightForC + MGPA * (1 - weightForC);
    }
}
