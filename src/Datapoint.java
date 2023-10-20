// each object represents one single row of datapoints database

public class Datapoint {
    int tier_admission_university;
    int tier_background_university;

    double CGPA;
    double MGPA;

    // Number of Recommendation Letter
    int num_LoR;

    // Number of Internship
    int num_intern;

    // Number of International publication
    int num_paper;

    public Datapoint(int tier1, int tier2, double gpa1, double gpa2, int num1, int num2, int num3){
        tier_admission_university = tier1;
        tier_background_university = tier2;
        CGPA = gpa1;
        MGPA = gpa2;
        num_LoR = num1;
        num_intern = num2;
        num_paper = num3;
    }
}
