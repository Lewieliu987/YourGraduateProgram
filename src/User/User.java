package User;

import System.IdSystem;

public abstract class User {
    private int id;
    private String name;
    private String password;
    private boolean isAdmin;

    // Constructor for registration
    public User(String name, String password, String isAdmin) {
        IdSystem ids = IdSystem.getInstance();
        this.id = ids.generateUserId(isAdmin.equals("true"));
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin.equals("true");

    }

    public User(int id, String name, String password, String isAdmin) {
        // 如果提供了ID
        this.id = id;
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin.equals("true");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return this.name;
    }

    public String getPassword() {
        return this.password;
    }

    public int getId() {
        return id;
    }

    public boolean getRole() {
        return isAdmin;
    }

    public void resetPassword(String newPassword) {
        this.password = newPassword;
    }

    public void resetName(String newName) {
        this.name = newName;
    }

    public boolean getPermission() {
        return isAdmin;
    }

    public void calculate() {
    }
}

// UserInput.java: student/admin?
// 1. id 666/888
// 2. isAdmin false/true

// Database record User id
// 一开始只有simple
// Register 创建了一个实例
// name password -> id isAdmin
// id/name + password

// Login: id + password 去找 -> liuzihan 查找这个实例