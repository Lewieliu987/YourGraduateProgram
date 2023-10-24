package Value;
public class LanguageScore{
    private double ielts;
    private double tofel;
    private double gre;
    public LanguageScore(double ielts, double tofel, double gre)
    {
        //需要具体权重
        this.ielts = ielts;
        this.tofel = tofel;
        this.gre = gre;
    }

    public double getIelts() {
        return ielts;
    }

    public double getTofel() {
        return tofel;
    }

    public double getGre() {
        return gre;
    }
}
