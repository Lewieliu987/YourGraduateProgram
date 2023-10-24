package Value;
public class LanguageScore{
    private double ielts;
    private double tofel;
    private double gre;
    
    public LanguageScore(){}

    public LanguageScore(double ielts, double tofel, double gre)
    {
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
