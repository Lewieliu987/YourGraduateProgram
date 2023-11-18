package Algorithm;

import Other.ComputerGuassian;
import Other.WeightedGPA;
import Other.WeightedOthers;

public class Predictor extends NaiveBayes {
    private double[] posterior;
    private int tier_background_university;

    private double CGPA;
    private double MGPA;

    // Number of Recommendation Letter
    private int num_LoR;

    // Number of Internship
    private int num_intern;

    // Number of International publication
    private int num_paper;

    private WeightedGPA wgpa;

    private WeightedOthers wothers;

    public Predictor() {
        // load parameters storded in database
        super();
        posterior = new double[5];
        for(int i=0;i<5;i++){
            posterior[i] = this.getps().get(i).getPrior();
        }
    }

    // interface to read
    public void read(int tier, double cgpa, double mgpa, int num1,
                    int num2, int num3){
        tier_background_university = tier;
        CGPA = cgpa;
        MGPA = mgpa;
        num_LoR = num1;
        num_intern = num2;
        num_paper = num3;

        wgpa = new WeightedGPA(CGPA, MGPA);
        wothers = new WeightedOthers(num_LoR, num_intern, num_paper);
        
    }

    public void update_prob(){
        // update the prob for 5 tiers

        // evidence: background_tier
        for (int i =0; i<5;i++){
            // tier
            if(tier_background_university == 1){
                posterior[i] *= this.getps().get(i).getP1();
            }
            else if(tier_background_university == 2){
                posterior[i] *= this.getps().get(i).getP2();
            }
            else if(tier_background_university == 3){
                posterior[i] *= this.getps().get(i).getP3();
            }
            else if(tier_background_university == 4){
                posterior[i] *= this.getps().get(i).getP4();
            }
            else if(tier_background_university == 5){
                posterior[i] *= this.getps().get(i).getP5();
            }
            
        }

        // evidence: Weighted GPA
        for (int i = 0;i<5;i++){
            ComputerGuassian g = new ComputerGuassian();
            posterior[i] *= g.getP(this.getps().get(i).getmeanGPA(), 
                                   this.getps().get(i).getsdGPA(), 
                                   wgpa.getWeighted());
        }

        // evidence: Weighted Others
        for (int i = 0;i<5;i++){
            ComputerGuassian g = new ComputerGuassian();
            posterior[i] *= g.getP(this.getps().get(i).getmeanOthers(), 
                                   this.getps().get(i).getsdOthers(), 
                                   wothers.getWeighted());
        }


    }

    // return the index of tier with the largest posterior
    // pass the paramters
    public int getMaxProb(int tier, double cgpa, double mgpa, int num1,
                    int num2, int num3){
        this.read(tier, cgpa, mgpa, num1, num2, num3);

        this.update_prob();

        int index = 0;
        for(int i =0;i<5;i++){
            if(posterior[i]>posterior[index]){
                index = i;
            }
        }

        return index+1;
    }
}
