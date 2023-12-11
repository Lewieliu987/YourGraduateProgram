package User;

import java.util.Scanner;

public class UserInputAdmin implements UserInput {

    @Override
    public void inputUser(User user) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter admin name");
        String name = scanner.next();
        user.setName(name);

        System.out.println("Enter admin password");
        String passwords = scanner.next();
        user.setPassword(passwords);

        // generate ID using Id System and stored in into DatabaseForUser
        scanner.close();
    }
}
