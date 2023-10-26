package University;

import java.util.ArrayList;

import System.IdSystem;

public class University {
    private String name;
    private String region;
    private ArrayList<Program> programList;
    // University 应维护变量numberOfProgram
    private int numberOfProgram;

    public University(String name, String region) {// university不需id
        this.name = name;
        this.region = region;
    }

    public void addProgram(String pName, String pType, double pRate) {
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
        Program newProgram = new Program(pId, pName, pType, pRate);
        programList.add(newProgram);
        numberOfProgram++;
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

    public void showAllProgram() {
        // 显示所有项目的名称和代码
    }
}
