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

    public void addUser(User user) {
        if(findUser(user.getId())==null)
        {
            AllUsers.add(user);
        }// 若找到用户，需添加exception(duplicate)
        
    }

    public User findUser(int id){
        for(int i=0; i<AllUsers.size(); i++){
            if(AllUsers.get(i).getId()==id){
                return AllUsers.get(i);
            }
    }
        return null;
}
    public void deleteUser(int idToDelete) {
        if(findUser(idToDelete) != null){
            AllUsers.remove(findUser(idToDelete));
        }// 若没找到用户，需添加exception
    }
        //以下代码读/写入csv
}

