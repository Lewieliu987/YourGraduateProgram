import java.util.ArrayList;

public class Publication extends Value{
    private ArrayList<EveryPublication> publications;
    public Publication(ArrayList<EveryPublication> publications)
    {
        //需要具体权重
        super();
        this.publications = publications;
    }
    public double calculateWeightedValue()
    {
        //需要具体公式
        double result;
        return result;
    }
}
