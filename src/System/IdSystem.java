package System;

import java.util.ArrayList;

public class IdSystem {
    private ArrayList<Integer> AllStudentId;
    private ArrayList<Integer> AllAdminId;
    private int numberOfStudent;
    private int numberOfAdmin;
    private static IdSystem instance = new IdSystem(); // 创建静态实例

    public IdSystem() {
        AllStudentId = new ArrayList<Integer>();
        AllAdminId = new ArrayList<Integer>();
        numberOfStudent = 0;
        numberOfAdmin = 0;
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
}
