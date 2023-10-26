package University;

import Value.Major;

public class Program {
    private String id;
    private String name;
    // 不同的项目有不同的major
    private Major major;
    private String degree_type;
    private double acceptance_rate;

    public Program(String id, String name, String degree_type, double acceptance_rate, String majorName) {
        // id在University里面创建
        this.id = id;
        this.name = name;
        this.major.setMajorName(majorName);
        this.degree_type = degree_type;
        this.acceptance_rate = acceptance_rate;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDegreeType() {
        return degree_type;
    }

    public double getAcceptanceRate() {
        return acceptance_rate;
    }

    public String getMajorName() {
        return major.getMajorName();
    }
}
