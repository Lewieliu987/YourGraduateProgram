package Other;
public class WeightedOthers {

    private int num_LoR;
    private int num_intern;
    private int num_paper;

    private double weightForl = 0.4;
    private double weightFori = 0.3;
    private double weightForp = 0.3;

    public WeightedOthers(int l, int i, int p){
        num_intern = i;
        num_LoR = l;
        num_paper = p;
    }
    public int getNumIntern(){
        return num_intern;
    }

    public int getNumLor(){
        return num_LoR;
    }

    public int getNumPaper(){
        return num_paper;
    }

    public double getWeighted(){
        return num_intern*weightFori + num_LoR*weightForl + num_paper*weightForp;
    }
}
