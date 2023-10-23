import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Log in or Register?");
        String answer = scanner.next();// 选择登录还是注册

        User user;
        UserInput input;// 输入方法对象
        if (answer == "log in") {
            System.out.println("Please enter your id and password");
            int id = scanner.nextInt();
            String password = scanner.next();
            // 找到id对应的user
            // 对于该user，用while循环，执行指令直到exit
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
