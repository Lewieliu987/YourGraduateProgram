package Other;
public class ComputeMean {
    private double[] ds;

    public ComputeMean(double[] ds){
        this.ds = ds;
    }

    public double getMean(){
        double mean = 0;
        double sum = 0;
        for (int i = 0; i < ds.length; i++)
            sum = sum + ds[i];
        mean = sum/ ds.length;
        return mean;
    }
}