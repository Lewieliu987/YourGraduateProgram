package User;

import System.IdSystem;

public class Admin extends User {
    public Admin(String name, String password) {
        super(name, password, true);
    }
    // 添加Admin的其他方法
}
