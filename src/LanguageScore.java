public class LanguageScore extends Value{
    private double ielts;
    private double tofel;
    private double gre;
    public LanguageScore(double ielts, double tofel, double gre)
    {
        //需要具体权重
        super();
        this.ielts = ielts;
        this.tofel = tofel;
        this.gre = gre;
    }
    public double calculateWeightedValue()
    {
        //需要具体公式
        double result;
        return result;
    }

}
