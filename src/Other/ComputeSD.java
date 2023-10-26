package Other;

public class ComputeSD {
    private double[] ds;

    public ComputeSD(double[] ds) {
        this.ds = ds;
    }

    public double getMean() {
        double mean = 0;
        double sum = 0;
        for (int i = 0; i < ds.length; i++)
            sum = sum + ds[i];
        mean = sum / ds.length;
        return mean;
    }

    public double getSD() {
        double variance = 0;
        for (int i = 0; i < ds.length; i++) {
            variance = variance + (Math.pow((ds[i] - this.getMean()), 2));
        }
        variance = variance / (ds.length - 1);

        double std_dev;
        std_dev = Math.sqrt(variance);
        return std_dev;
    }
}
