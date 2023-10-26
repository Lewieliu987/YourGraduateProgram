package Database;

import java.util.ArrayList;

import Exceptions.DuplicateUserException;
import Exceptions.UserNotFoundException;

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

    public void addUser(User user) throws DuplicateUserException {
        if (findUser(user.getId()) == null) {
            AllUsers.add(user);
        } // 若找到用户，需添加exception(duplicate)
        else {
            throw new DuplicateUserException("User with id " + user.getId() + " already exists.");
        }
    }

    public User findUser(int id) {
        for (int i = 0; i < AllUsers.size(); i++) {
            if (AllUsers.get(i).getId() == id) {
                return AllUsers.get(i);
            }
        }
        return null;
    }

    public void deleteUser(int idToDelete) throws UserNotFoundException {
        if (findUser(idToDelete) != null) {
            AllUsers.remove(findUser(idToDelete));
        } // 若没找到用户，需添加exception
        else {
            throw new UserNotFoundException("User with id " + idToDelete + " not found.");
        }
    }

    public void readUsersFromCSV() {
        // 从CSV文件中读取用户信息, 并写入AllUsers
        try (BufferedReader br = new BufferedReader(new FileReader("./file/users.csv"))) {
            String line;
            while (!(line = br.readLine()).equals(null)) {
                String[] values = line.split(",");
                if (values[2].equals("true")) {
                    AllUsers.add(new Admin(values[1], values[2]));
                } else {
                    AllUsers.add(new Student(values[1], values[2]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeUsersToCSV() {
        // 将用户信息写入CSV文件（覆盖）
        try (PrintWriter writer = new PrintWriter(new FileWriter("./file/users.csv", false))) {
            for (User user : AllUsers) {
                writer.println(
                        user.getId() + "," + user.getUsername() + "," + user.getPassword() + "," + user.getRole());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } // 对DatabaseForUser执行任何更改之后，最后需要调用此函数
    }
}
