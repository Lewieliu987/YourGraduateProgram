package System;

import java.util.Scanner;

import Algorithm.Trainer;
import Database.DatabaseForUser;
import Exceptions.DuplicateUniversityException;
import Exceptions.DuplicateUserException;
import Exceptions.UserNotFoundException;
import Database.DatabaseForUniversity;
import User.Admin;
import User.Student;
import User.User;
import University.University;
import User.UserInputStudent;

public class Main {
    public static void main(String[] args) {
        Trainer t = new Trainer();
        t.trainParameters();
        t.updateParameters();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to CityU YGP System, Log in, Register?");
        // 选择登录还是注册
        User user = null;
        DatabaseForUser dfu = DatabaseForUser.getInstance();
        dfu.readUsersFromCSV();
        DatabaseForUniversity dfuu = DatabaseForUniversity.getInstance();
        dfuu.readUniversitiesFromCSV();
        String answer = "";
        while (!(answer.equals("Log in") || answer.equals("Register"))) {
            answer = scanner.nextLine();
            if (!(answer.equals("Log in") || answer.equals("Register"))) {
                System.out.println("Invalid input. Please enter 'Log in' or 'Register'.");
            }
        }
        if (answer.equals("Log in")) {// search user in DatabaseForUser using id & password
            System.out.println("Please enter your id:");
            int id = scanner.nextInt();
            // 找到id对应的user
            try {
                user = dfu.findUser(id);
                if (user == null) {
                    throw new UserNotFoundException("User with id " + id + " not found.");
                }
                System.out.println("Id found! Please enter your password to log in: ");
                // Continue with password handling...

            } catch (UserNotFoundException e) {
                System.out.println("User not found! Please check your input and try again.");
            }
            // 要写exception， 如果找不到id

            testPasswordLoop: while (true) {
                String password = scanner.next();
                System.out.println(user.getPassword());
                if (password.equals(user.getPassword())) {
                    System.out.println("PASSWORD: " + user.getPassword() + " CORRECT");
                    if (!user.getPermission()) {
                        // for user，use while loop，until exit
                        // studentServiceLoop:
                        while (true) {// to calculate the probability
                            // 1. 更改基本信息 2. 更改申请信息 3. 查看录取概率 4. 退出
                            System.out.println("Welcome, " + user.getUsername() + "\n"
                                    + "Please enter one of the following number to use services:" + "\n" +
                                    "1. Modify my account information" + "\n" +
                                    "2. Check my admission probability" + "\n" + "3. Exit");
                            String choice = scanner.next();
                            switch (choice) {
                                case "1":
                                    System.out.println("Please enter your new name and password");
                                    scanner.nextLine();
                                    System.out.print("New name: ");
                                    user.resetName(scanner.nextLine());
                                    System.out.print("New password: ");
                                    user.resetPassword(scanner.nextLine());
                                    dfu.writeUsersToCSV();
                                    System.out.println(
                                            "Your information has been updated successfully! Press c to use other services or other characters to quit this service");
                                    char continueOrNot = scanner.next().charAt(0);
                                    if (continueOrNot == 'c') {
                                        continue;
                                    } else {
                                        break;
                                    }
                                case "2":
                                    Student student = (Student) user;
                                    UserInputStudent inputstudent = new UserInputStudent();
                                    inputstudent.inputUser(student);
                                    student.getMyAdmission();
                                    System.out.println(student.getTier());
                                    System.out.println(
                                            "Press c to use other services or other characters to quit this service");
                                    char continueOrnot = scanner.next().charAt(0);
                                    if (continueOrnot == 'c') {
                                        continue;
                                    } else {
                                        break;
                                    }
                                case "3":
                                    System.out.println("System exited successfully!");
                                    break testPasswordLoop;
                            }
                        }
                    } else {
                        // adminServiceLoop:
                        while (true) {
                            // 1. 更改基本信息 2. 更改User数据库 3. 更改University数据库 4. 重新训练模型 5. 退出
                            System.out.println("Welcome, " + user.getUsername() + "\n"
                                    + "Please enter one of the following number to use services:" + "\n" +
                                    "1. Modify my account information" + "\n" + "2. Modify Database for users"
                                    + "\n" +
                                    "3. Modify Database for universities" + "\n"
                                    + "4. Exit");
                            String choice = scanner.next();
                            scanner.nextLine();
                            switch (choice) {
                                case "1":
                                    System.out.println("Please enter your new name and password");
                                    System.out.println("New name:");
                                    user.resetName(scanner.nextLine());
                                    System.out.println("New password:");
                                    user.resetPassword(scanner.nextLine());
                                    System.out.println(
                                            "Your information has been updated successfully! Press c to use other services");
                                    char continueOrNot = scanner.next().charAt(0);
                                    scanner.nextLine();
                                    if (continueOrNot == 'c') {
                                        continue;
                                    } else {
                                        break;
                                    }
                                case "2":
                                    databaseForUserLoop: while (true) {
                                        // 1. add new user 2. delete user 3. search user 5. exit
                                        System.out.println("Please enter the operation code: " + '\n'
                                                + "1. Add user" + '\n' + "2. Delete user" + '\n' + "3. Search user"
                                                + '\n' + "4. Exit");
                                        String operationCode = scanner.nextLine();
                                        switch (operationCode) {
                                            case "1":
                                                while (true) {
                                                    System.out.println(
                                                            "Please enter the user's name, password and role (Student/Admin):");
                                                    String n = scanner.nextLine().trim(); // user name
                                                    String p = scanner.nextLine().trim(); // user password

                                                    String r = scanner.nextLine().trim(); // user role
                                                    User newUser;
                                                    if (r.equals("Admin")) {
                                                        newUser = new Admin(n, p);
                                                    } else if (r.equals("Student")) {
                                                        newUser = new Student(n, p);
                                                    } else {
                                                        System.out.println("Wrong role, please try again!");
                                                        continue;
                                                    }
                                                    dfu.addUser(newUser);
                                                    System.out.println("User added successfully!");
                                                    // break;
                                                    System.out.println(
                                                            "Press c to continue or other characters to quit this service");
                                                    char continueorNot = scanner.nextLine().charAt(0);
                                                    if (continueorNot == 'c') {
                                                        continue;
                                                    } else {
                                                        break;
                                                    }
                                                }
                                                break;
                                            case "2":
                                                while (true) {
                                                    System.out.println("Please enter the user's id:");
                                                    int idToDelete = scanner.nextInt();
                                                    scanner.nextLine();
                                                    try {
                                                        dfu.deleteUser(idToDelete);
                                                    } catch (UserNotFoundException e) {
                                                        System.out.println(e.getMessage());
                                                    } // Exception
                                                    System.out.println("User deleted successfully!");
                                                    System.out.println(
                                                            "Press c to continue or other characters to quit this service");
                                                    char continueorNnot = scanner.nextLine().charAt(0);
                                                    if (continueorNnot == 'c') {
                                                        continue;
                                                    } else {
                                                        break;
                                                    }
                                                } // there is a problem that after user being deleted，the id still
                                                  // exists
                                                break;
                                            case "3":
                                                while (true) {
                                                    System.out.println("Please enter the user's id:");
                                                    int idToSearch = scanner.nextInt();
                                                    scanner.nextLine();
                                                    User userToSearch = dfu.findUser(idToSearch);
                                                    if (userToSearch == null) {
                                                        System.out.println("User not found!");
                                                        break;
                                                    }
                                                    System.out.println("User found!");
                                                    System.out.println("User's id: " + userToSearch.getId()
                                                            + " User's name: " + userToSearch.getUsername()
                                                            + " User's password: " + userToSearch.getPassword()
                                                            + " User's role: " + userToSearch.getRole());
                                                    System.out.println(
                                                            "Press c to continue or other characters to quit this service");
                                                    char continueornot = scanner.nextLine().charAt(0);
                                                    if (continueornot == 'c') {
                                                        continue;
                                                    } else {
                                                        break;
                                                    }
                                                }
                                                break;
                                            case "4":
                                                System.out.println("User Modify System exited successfully!");
                                                break databaseForUserLoop;
                                        }
                                    }
                                case "3":
                                    while (true) {
                                        System.out.println("Please enter the operatifon code: " + '\n'
                                                + "1. Add a new university to the system" + '\n' + "2. Exit");
                                        String operationCode = scanner.next();
                                        switch (operationCode) {
                                            case "1":
                                                scanner.nextLine();
                                                System.out.println("Please enter the name for the University");
                                                String name = scanner.nextLine();
                                                System.out.println("Please enter the region of the University");
                                                String region = scanner.nextLine();
                                                System.out.println(
                                                        "Please enter the tier of the university(1 for 1st to 10th, 2 for 11th to 30th, 3 for 31th to 50th, 4 for 50th to 70th, 5 for 71th to 100th )");
                                                String tier = scanner.next();
                                                scanner.nextLine();
                                                University university = new University(name, region, tier);
                                                try {
                                                    dfuu.addUniversity(university);
                                                    System.out.println(
                                                            name + " added successfully");
                                                } catch (DuplicateUniversityException e) {
                                                    System.out.println(e.getMessage());
                                                }
                                                System.out.println(
                                                        "Press c to continue or other characters to quit this service");
                                                String input = scanner.nextLine();
                                                char continueorNot = (input.length() > 0) ? input.charAt(0) : 'x';
                                                if (continueorNot == 'c') {
                                                    continue;
                                                } else {
                                                    break;
                                                }
                                            case "2":
                                                System.out.println("System exited successfully!");
                                                break testPasswordLoop;
                                        }
                                    }

                            }
                        }
                    }
                } else {
                    System.out.println("Wrong password, please try again!");
                }
            }

        } else if (answer.equals("Register")) {// input name, password, generate user;
            System.out.println("Please enter your name");
            String name = scanner.nextLine();
            System.out.println("Please set your password");
            String password = scanner.next();
            while (true) {
                System.out.println("Please enter your role (Student/Admin):");
                String role = scanner.next();
                // 用IdSystem生成id，然后存入DatabaseForUser数据库
                if (role.equals("Admin")) {
                    user = new Admin(name, password);
                    dfu.addUser(user);
                    break;
                } else if (role.equals("Student")) {
                    user = new Student(name, password);
                    dfu.addUser(user);
                    break;
                } else {
                    System.out.println("Wrong role, please try again!");
                    continue;
                }
            }
            dfu.writeUsersToCSV();
<<<<<<< HEAD
            // dfuu.writeUniversitiesToCSV();
=======
            //dfuu.writeUniversitiesToCSV();
>>>>>>> branch 'for_test_cases_2' of git@github.com:Lewieliu987/YourGraduateProgram.git
            System.out.println("Register successfully, you id is " + user.getId() + ", please restart the system!");
        }
        scanner.close();
    }
}