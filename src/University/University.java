package University;
import java.util.ArrayList;

import System.IdSystem;
public class University {
    private int id;
    private String name;
    private String region;
    private ArrayList<Program> programList;
    // University 应维护变量numberOfProgram
    private int numberOfProgram;

    public University(String name, String region)
    {
        IdSystem ids = IdSystem.getInstance();
        this.id = ids.generateUniversityId();
        this.name = name;
        this.region = region;
    }

    public void addProgram(){
        // 名称，类型，录取率需从外部读入
        String pName;
        String pType;
        double pRate;
        String pId;
        IdSystem ids = IdSystem.getInstance();
        pId = ids.generateProgramId();
        Program newProgram = new Program(pId, pName, pType, pRate);
        programList.add(newProgram);
        numberOfProgram++;
    }
    
    public void showAllProgram()
    {
        // 显示所有项目的名称和代码
    }
}
