import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Log in or Register?");
        String answer = scanner.next();// 选择登录还是注册
        int id = scanner.nextInt();// 选择角色

        User user;
        UserInput input;// 输入方法对象
        if (answer == "log in") {
            if (role == "admin") {
                user = new Admin();
            } else if (role == "student") {
                user = new Student();
            }
        } else if (answer == "Register") {
            if (role == "admin") {
                user = new Admin();
                input = new UserInputAdmin();
            } else if (role == "student") {
                user = new Student();
                input = new UserInputStudent();
            }
        }
        user = new Student();// just for java syntax requirements
        input = new UserInputStudent();// just for java syntax requirements
        input.inputUser(user);// 开始输入

        // assume the weight has been calculated already
        user.calculate();
    }
}
