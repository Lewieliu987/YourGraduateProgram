package System;

import java.util.Scanner;

import Algorithm.Trainer;
import Database.DatabaseForUser;
import User.Admin;
import User.Student;
import User.User;
import University.University;
import User.UserInputStudent;

public class Main {
    public static void main(String[] args) {
        Trainer t = new Trainer();
        t.trainParameters();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to CityU YGP System, log in or register?");
        String answer = scanner.next();// 选择登录还是注册

        User user;
        DatabaseForUser dfu = DatabaseForUser.getInstance();

        if (answer == "log in") {// search user in DatabaseForUser using id & password
            System.out.println("Please enter your id and password to log in:");
            int id = scanner.nextInt();

            // 找到id对应的user
            user = dfu.findUser(id);
            // 要写exception， 如果找不到id

            testPasswordLoop: while (true) {
                String password = scanner.next();
                if (password.equals(user.getPassword())) {
                    if (!user.getPermission()) {
                        // 对于该user，用while循环，执行指令直到exit
                        // studentServiceLoop:
                        while (true) {
                            // 1. 更改基本信息 2. 更改申请信息 3. 查看录取概率 4. 退出
                            System.out.println("Welcome, " + user.getUsername() + "\n"
                                    + "Please enter one of the following number to use services:" + "\n" +
                                    "1. Modify my account information" + "\n" + "2. Modify my applicaiton information"
                                    + "\n" +
                                    "3. Check my admission probability" + "\n" + "4. Exit");
                            String choice = scanner.next();
                            switch (choice) {
                                case "1":
                                    System.out.println("Please enter your new name and password");
                                    user.setName(scanner.next());
                                    user.setPassword(scanner.next());
                                    System.out.println("Your information has been updated successfully!");
                                    System.out.println("Press c to continue");
                                    char continueOrNot = scanner.next().charAt(0);
                                    if (continueOrNot == 'c') {
                                        continue;
                                    } else {
                                        break;
                                    }
                                case "2":
                                    UserInputStudent inputStudent = new UserInputStudent();
                                    inputStudent.inputUser(user);
                                    System.out.println("Your information has been updated successfully!");
                                    System.out.println();
                                case "3":
                                    Student student = (Student) user;
                                    student.getMyAdmission();
                                case "4":
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
                                    "1. Modify my account information" + "\n" + "2. Modify Database for users" + "\n" +
                                    "3. Modify Database for universities" + "\n" + "Retrain naive bayes model" + "\n"
                                    + "5. Exit");
                            String choice = scanner.next();
                            switch (choice) {
                                case "1":
                                    System.out.println("Please enter your new name and password");
                                    user.setName(scanner.next());
                                    user.setPassword(scanner.next());
                                    System.out.println("Your information has been updated successfully!");
                                    System.out.println();
                                case "2":
                                    databaseForUserLoop: while (true) {
                                        // 1. 增加用户 2. 删除用户 3. 修改用户 4. 查找用户 5. 退出
                                        System.out.println("Please enter the operation code: " + '\n'
                                                + "1. Add user" + '\n' + "2. Delete user" + '\n'
                                                + "3. Modify user" + '\n' + "4. Search user" + '\n' + "5. Exit");
                                        String operationCode = scanner.next();
                                        switch (operationCode) {
                                            case "1":
                                                System.out.println(
                                                        "Please enter the user's name, password and role (Student/Admin):");
                                                String n = scanner.next(); // user name
                                                String p = scanner.next(); // user password
                                                while (true) {
                                                    String r = scanner.next(); // user role
                                                    User newUser;
                                                    if (r == "Admin") {
                                                        newUser = new Admin(n, p);
                                                    } else if (r == "Student") {
                                                        newUser = new Student(n, p);
                                                    } else {
                                                        System.out.println("Wrong role, please try again!");
                                                        continue;
                                                    }
                                                    dfu.addUser(newUser);
                                                    System.out.println("User added successfully!");
                                                    break;
                                                }
                                            case "2":
                                                while (true) {
                                                    System.out.println("Please enter the user's id:");
                                                    int idToDelete = scanner.nextInt();
                                                    dfu.deleteUser(idToDelete); // Exception
                                                    System.out.println("User deleted successfully!");
                                                    System.out.println("Press c to continue");
                                                    char continueOrNot = scanner.next().charAt(0);
                                                    if (continueOrNot == 'c') {
                                                        continue;
                                                    } else {
                                                        break;
                                                    }
                                                } // 有一个问题，user deleted之后，id还是存在
                                            case "3":
                                                while (true) {
                                                    System.out.println("Please enter the user's id:");
                                                    int idToModify = scanner.nextInt();
                                                    User userToModify = dfu.findUser(idToModify);
                                                    if (userToModify == null) {
                                                        System.out.println("User not found!");
                                                        break;
                                                    }
                                                    System.out
                                                            .println("Please enter the user's new name and password:");
                                                    userToModify.setName(scanner.next());
                                                    userToModify.setPassword(scanner.next());
                                                    System.out.println("User modified successfully!");
                                                    System.out.println("Press c to continue");
                                                    char continueOrNot = scanner.next().charAt(0);
                                                    if (continueOrNot == 'c') {
                                                        continue;
                                                    } else {
                                                        break;
                                                    }
                                                }
                                            case "4":
                                                while (true) {
                                                    System.out.println("Please enter the user's id:");
                                                    int idToSearch = scanner.nextInt();
                                                    User userToSearch = dfu.findUser(idToSearch);
                                                    if (userToSearch == null) {
                                                        System.out.println("User not found!");
                                                        break;
                                                    }
                                                    System.out.println("User found!");
                                                    System.out.println("User's id: " + userToSearch.getId()
                                                            + "User's name: " + userToSearch.getUsername()
                                                            + "User's password: " + userToSearch.getPassword()
                                                            + "User's role: " + userToSearch.getRole());
                                                    System.out.println("Press c to continue");
                                                    char continueOrNot = scanner.next().charAt(0);
                                                    if (continueOrNot == 'c') {
                                                        continue;
                                                    } else {
                                                        break;
                                                    }
                                                }
                                            case "5":
                                                System.out.println("System exited successfully!");
                                                break databaseForUserLoop;
                                        }
                                    }

                                case "3":
                                    // 1. 增加大学 2. 修改大学信息 3. 查找大学 4. 退出
                                    while (true) {
                                        System.out.println("Please enter the operatifon code: " + '\n'
                                                + "1. Add university" + '\n' + "2. Modify university information" + '\n'
                                                + "3. Search university" + '\n' + "4. Exit");
                                        String operationCode = scanner.next();
                                        switch(operationCode){
                                            case "1":
                                               
                                            case "2":
                                                while (true) {
                                                    System.out.println("Please enter the university's name:");
                                                    String nameToModify = scanner.next();
                                                    University universityToModify = dfu.findUniversity(nameToModify);
                                                    if (universityToModify == null){
                                                        System.out.println();
                                                    }
                                                }
                                    }

                                case "4":
                                case "5":
                                    System.out.println("System exited successfully!");
                                    break testPasswordLoop;
                            }
                        }
                    }
                } else {
                    System.out.println("Wrong password, please try again!");
                }
            }

        } else if (answer == "Register") {// input name, password, generate user;
            System.out.println("Please enter your role");
            String role = scanner.next();
            System.out.println("Please enter your name");
            String name = scanner.next();
            System.out.println("Please set your password");
            String password = scanner.next();
            // 用IdSystem生成id，然后存入DatabaseForUser数据库
            if (role == "admin") {
                user = new Admin(name, password);
            } else if (role == "student") {
                user = new Student(name, password);
            }
            System.out.println("Register successfully, please restart the system!");
        }

        scanner.close();
    }
}