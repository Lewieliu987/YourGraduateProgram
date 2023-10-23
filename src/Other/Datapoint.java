// each object represents one single row of datapoints database
package Other;
public class Datapoint {
    private int tier_admission_university;
    private int tier_background_university;

    private double CGPA;
    private double MGPA;

    // Number of Recommendation Letter
    private int num_LoR;

    // Number of Internship
    private int num_intern;

    // Number of International publication
    private int num_paper;

    public Datapoint(int tier1, int tier2, double gpa1, double gpa2, int num1, int num2, int num3){
        tier_admission_university = tier1;
        tier_background_university = tier2;
        CGPA = gpa1;
        MGPA = gpa2;
        num_LoR = num1;
        num_intern = num2;
        num_paper = num3;
    }

    public int getTierAdmission(){
        return tier_admission_university;
    }

    public int getTierBackground(){
        return tier_background_university;
    }

    public double getCGPA(){
        return CGPA;
    }

    public double getMGPA(){
        return MGPA;
    }

    public int getNumLor(){
        return num_LoR;
    }

    public int getNumIntern(){
        return num_intern;
    }

    public int getNumPaper(){
        return num_paper;
    }
}
