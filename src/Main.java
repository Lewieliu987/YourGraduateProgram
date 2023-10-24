import java.util.ArrayList;
import java.util.Scanner;

import Database.DatabaseForUser;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Log in or Register?");
        String answer = scanner.next();// 选择登录还是注册

        User user;
        UserInput input;// 输入方法对象
        DatabaseForUser dfu = DatabaseForUser.getInstance();
        if (answer == "log in") {
            System.out.println("Please enter your id and password");
            int id = scanner.nextInt();
            String password = scanner.next();
            // 找到id对应的user
            user = dfu.findUser(id);
            // 要写exception， 如果找不到id
            // 对于该user，用while循环，执行指令直到exit
            while (true) {
                if (password.equals(user.getPassword())) {
                    // 1.更改基本信息 2.更改申请信息 3.查看录取概率 4.退出
                    System.out.print("Welcome, " + user.getUsername() + "\n" + "Please indicate your choice:" + "\n" +
                            "1.Modify my account information" + "\n" + "2.Modify my applicaiton information" + "\n" +
                            "3.Check my admission probability" + "\n" + "4.Exit");
                    String choice = scanner.next();
                    switch (choice) {
                        case "1":
                            user.setName(scanner.next());
                            user.setPassword(scanner.next());
                            // 引导语没写
                        case "2":
                            UserInputStudent inputStudent = new UserInputStudent();
                            inputStudent.inputUser(user);
                        case "3":
                            Student student = (Student) user;
                            student.getMyAdmission();
                        case "4":
                            break;
                    }
                } else {
                    break;
                }
            }
        } else if (answer == "Register") {// input name, password, return id;
            System.out.println("Please enter your role");
            String role = scanner.next();
            System.out.println("Please enter your name");
            String name = scanner.next();
            System.out.println("Please set your password");
            String password = scanner.next();
            if (role == "admin") {
                user = new Admin(name, password);
            } else if (role == "student") {
                user = new Student(name, password);
            }
            // 用IdSystem生成id，然后存入DatabaseForUser数据库
        }
        user = new Student();// just for java syntax requirements
        input = new UserInputStudent();// just for java syntax requirements
        input.inputUser(user);// 开始输入

        // assume the weight has been calculated already
        user.calculate();
    }
}
