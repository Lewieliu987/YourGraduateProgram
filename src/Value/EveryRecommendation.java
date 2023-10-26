package Value;

public class EveryRecommendation {
    // 每一封推荐信
    private int professor_level;
    private int quality;

    public EveryRecommendation(int professor_level, int quality) {
        this.professor_level = professor_level;
        this.quality = quality;
    }

    public int getProfessorLevel() {
        return professor_level;
    }

    public int getQuality() {
        return quality;
    }
}