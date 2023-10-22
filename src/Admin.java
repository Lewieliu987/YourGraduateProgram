public class Admin extends User {
    public Admin(String name, String password) {
        super(name, password, false);
        // 利用IdSystem生成id，然后存入DatabaseForUser数据库
    }

    public Admin() {
    }
    // 添加Admin的其他方法
}
