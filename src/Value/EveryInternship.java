package Value;

public class EveryInternship {
    // 每一段实习
    private int company_level;
    private double time_interval;

    public EveryInternship(int company_level, double time_interval) {
        this.company_level = company_level;
        this.time_interval = time_interval;
    }

    public int getCompanyLevel() {
        return company_level;
    }

    public double getTimeInterval() {
        return time_interval;
    }
}
