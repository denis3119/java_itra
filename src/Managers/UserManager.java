package Managers;

import Hiberante.HibernateUtilites;
import Models.User;
import org.hibernate.Session;

/**
 * Created by denik on 29.01.2015.
 */
public class UserManager extends Manager<User> {

    public void editUserName(int userId,String name)
    {
        User newUser=getEntity(userId);
        newUser.setUsername(name);
        Update(newUser);
    }
}
