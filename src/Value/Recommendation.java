package Value;

import java.util.ArrayList;

public class Recommendation {
    private ArrayList<EveryRecommendation> recommendations;

    public Recommendation(ArrayList<EveryRecommendation> recommendations) {
        this.recommendations = recommendations;
    }

    public void addRecommendation(EveryRecommendation recommendation) {
        recommendations.add(recommendation);
    }
    // 需要遍历函数

}
