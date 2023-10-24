import java.util.ArrayList;

public class IdSystem {
    private ArrayList<Integer> AllStudentId;
    private ArrayList<Integer> AllAdminId;
    private ArrayList<Integer> AllUniversityId;
    private int numberOfStudent;
    private int numberOfAdmin;
    private int numberOfUniversity;
    private static IdSystem instance = new IdSystem(); // 创建静态实例

    public IdSystem() {
        AllStudentId = new ArrayList<Integer>();
        AllAdminId = new ArrayList<Integer>();
        AllUniversityId = new ArrayList<Integer>();
        numberOfStudent = 0;
        numberOfAdmin = 0;
        numberOfUniversity = 0;
    }

    public static IdSystem getInstance() {
        return instance;
    }

    public int generateUserId(boolean isAdmin) {
        if (isAdmin) {
            int newId = 341000 + numberOfAdmin;
            numberOfStudent++;
            AllAdminId.add(newId);
            return newId;
        } else {
            int newId = 241000 + numberOfStudent;
            numberOfStudent++;
            AllStudentId.add(newId);
            return newId;
        }
    }

    // 在user这个数据库里面， 应该有entry：id，isAdmin
    public int generateUniversityId() {
        int newId = 666000 + numberOfUniversity;
        numberOfUniversity++;
        AllUniversityId.add(newId);
        return newId;
    }

    // 不同学校会有相同的项目编码规则吗？
    // 取项目名称的所有大写字母
    public String generateProgramId() {
        String newId = "";
        return newId;
    }
}
