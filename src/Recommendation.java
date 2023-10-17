import java.util.ArrayList;

public class Recommendation extends Value{
    private ArrayList<EveryRecommendation> recommendations;
    public Recommendation(ArrayList<EveryRecommendation> recommendations)
    {
        // 需要具体权重
        super();
        this.recommendations = recommendations;
    }
    public double calculateWeightedValue()
    {
        // 需要具体公式
        double result;
        return result;
    }
}
