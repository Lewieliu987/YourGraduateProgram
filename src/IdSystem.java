import java.util.ArrayList;

public class IdSystem {
    private ArrayList<Integer> AllUserId;
    private ArrayList<Integer> AllUniversityId;
    private int numberOfUser;
    private int numberOfUniversity;
    private static IdSystem instance = new IdSystem(); // 创建静态实例

    public IdSystem()
    {
        AllUserId = new ArrayList<Integer>();
        AllUniversityId = new ArrayList<Integer>();
        numberOfUser = 0;
        numberOfUniversity = 0;
    }

    public static IdSystem getInstance()
    {
        return instance;
    }

    public int generateUserId()
    {
        int newId = 241000 + numberOfUser;
        numberOfUser++;
        AllUserId.add(newId);
        return newId;
    }

    public int generateUniversityId()
    {
        int newId = 666000 + numberOfUniversity;
        numberOfUniversity++;
        AllUniversityId.add(newId);
        return newId;
    }

    // 不同学校会有相同的项目编码规则吗？
    // 取项目名称的所有大写字母
    public String generateProgramId()
    {
        String newId = "";
        return newId;
    }
}
