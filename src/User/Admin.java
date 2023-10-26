package User;

import Algorithm.Trainer;

public class Admin extends User {
    public Admin(String name, String password) {
        super(name, password, "true");
    }

    // 添加Admin的其他方法
    public void trainParameters() {
        Trainer t = new Trainer();
        t.trainParameters();
        t.updateParameters();
    }

    public void addDatapoints() {

    }
}
