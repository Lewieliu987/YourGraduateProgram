package User;
import java.util.Scanner;

public class UserInputAdmin implements UserInput {

    @Override
    public void inputUser(User user) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter admin name");
        String name = scanner.next();
        user.setName(name);

        System.out.println("Design admin password");
        String passwords = scanner.next();
        user.setPassword(passwords);

        // 用IdSystem生成id，然后存入DatabaseForUser数据库

        scanner.close();
    }
}
