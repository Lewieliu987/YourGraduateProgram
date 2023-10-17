public abstract class User {
    private int id;
    private String name;
    private String password;
    private boolean isAdmin;

    // Constructor
    public User(String name, String password, boolean isAdmin)
    {
        IdSystem ids = IdSystem.getInstance();
        this.id = ids.generateUserId();
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public int getId()
    {
        return id;
    }

    public boolean getIdentity()
    {
        return isAdmin;
    }

    public void resetPassword(String newPassword)
    {
        this.password = newPassword;
        //需要print“完成”
    }

    public void resetName(String newName)
    {
        this.name = newName;
    }
}