package Database;
import java.util.ArrayList;

import User.User;

public class DatabaseForUser {
    private ArrayList<User> AllUsers;
    private static DatabaseForUser instance = new DatabaseForUser(); // 创建静态实例

    public DatabaseForUser() {
        AllUsers = new ArrayList<User>();
    }

    public static DatabaseForUser getInstance() {
        return instance;
    }

    public User findUser(int id){
        for(int i=0; i<AllUsers.size(); i++){
            if(AllUsers.get(i).getId()==id){
                return AllUsers.get(i);
            }
    }
}

    public void addUser(User user) {
        AllUsers.add(user);
    }
}

    // 以下代码读入excel文件
