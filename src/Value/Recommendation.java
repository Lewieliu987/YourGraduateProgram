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
<<<<<<< HEAD
    // 需要遍历函数
    
    public ArrayList<EveryRecommendation> getRecommendations() {
    	return recommendations;
    }
=======
>>>>>>> branch 'main' of git@github.com:Lewieliu987/YourGraduateProgram.git

    // 需要遍历函数
    public int get_number_of_recommendations() {
        return recommendations.size();
    }
}
