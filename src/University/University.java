package University;

import java.util.ArrayList;

public class University {
    private String name;
    private String region;
    private String tier;
    private ArrayList<Program> programList;

    public University(String name, String region, String tier) {// university不需id
        this.name = name;
        this.region = region;
        this.tier = tier;
        this.programList = new ArrayList<Program>();

    }

    public void addProgram(String pName, String pType, double pRate, String pMajorName) {
        // 名称，类型，录取率需从外部读入
        // pId由项目的每个大写字母构成
        StringBuilder pIdBuilder = new StringBuilder();
        for (int i = 0; i < pName.length(); i++) {
            char c = pName.charAt(i);
            if (Character.isUpperCase(c)) {
                pIdBuilder.append(c);
            }
        }
        String pId = pIdBuilder.toString();
        Program newProgram = new Program(pId, pName, pType, pRate, pMajorName);
        programList.add(newProgram);
    }

    public Program findProgram(String pId) {
        for (int i = 0; i < programList.size(); i++) {
            if (programList.get(i).getId() == pId) {
                return programList.get(i);
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Program> getProgramList() {
        return programList;
    }

    public String getRegion() {
        return region;
    }

    public String getTier() {
        return tier;
    }

    public void showAllProgram() {
        for (int i = 0; i < programList.size(); i++) {
            Program program = programList.get(i);
            System.out.println(program.getId() + ", " + program.getName() + ", Degree Type: " + program.getDegreeType()
                    + ", Acceptance Rate: " + program.getAcceptanceRate() + ", Only for Major: "
                    + program.getMajorName());
        }
    }
}
