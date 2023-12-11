package Value;

import java.util.ArrayList;

public class Recommendation {
    private ArrayList<EveryRecommendation> recommendations;

    public Recommendation() {
        this.recommendations = new ArrayList<EveryRecommendation>();
    }

    public void addRecommendation(EveryRecommendation recommendation) {
        recommendations.add(recommendation);
    }

    // 需要遍历函数
    public int get_number_of_recommendations() {
        return recommendations.size();
    }

    //testing purposes
    public ArrayList<EveryRecommendation> getRecommendations() {
    	return recommendations;
    }
}
