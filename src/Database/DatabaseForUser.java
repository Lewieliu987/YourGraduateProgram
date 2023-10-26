package Database;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import User.Admin;
import User.Student;
import User.User;

public class DatabaseForUser extends Database {
    private ArrayList<User> AllUsers;
    private static DatabaseForUser instance = new DatabaseForUser(); // 创建静态实例

    public DatabaseForUser() {
        AllUsers = new ArrayList<User>();
    }

    public static DatabaseForUser getInstance() {
        return instance;
    }

    public void addUser(User user) {
        if (findUser(user.getId()) == null) {
            AllUsers.add(user);
        } // 若找到用户，需添加exception(duplicate)
    }

    public User findUser(int id) {
        for (int i = 0; i < AllUsers.size(); i++) {
            if (AllUsers.get(i).getId() == id) {
                return AllUsers.get(i);
            }
        }
        return null;
    }

    public void deleteUser(int idToDelete) {
        if (findUser(idToDelete) != null) {
            AllUsers.remove(findUser(idToDelete));
        } // 若没找到用户，需添加exception
    }

    public void readUsersFromCSV(String filename) {
        // 从CSV文件中读取用户信息, 并写入AllUsers
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (values[2].equals("true")) {
                    AllUsers.add(new Admin(values[0], values[1]));
                }
                else{
                    AllUsers.add(new Student(values[0], values[1]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeUsersToCSV(String filename) {
        // 将用户信息写入CSV文件（覆盖）
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename, false))) {
            for (User user : AllUsers) {
                writer.println(user.getUsername() + "," + user.getPassword() + "," + user.getRole());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
