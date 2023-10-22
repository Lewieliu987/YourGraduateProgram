public abstract class User {
    private int id;
    private String name;
    private String password;
    private boolean isAdmin;

    public User() {

    }

    // Constructor for registration
    public User(String name, String password, boolean isAdmin) {
        IdSystem ids = IdSystem.getInstance();
        this.id = ids.generateUserId();
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {

    }

    public int getId() {
        return id;
    }

    public boolean getIdentity() {
        return isAdmin;
    }

    public void resetPassword(String newPassword) {
        this.password = newPassword;
        // 需要print“完成”
    }

    public void resetName(String newName) {
        this.name = newName;
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