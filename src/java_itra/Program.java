package java_itra;

import Hiberante.HibernateUtilites;
import Managers.UserManager;
import Models.User;
import org.hibernate.Session;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("12312321");
		User user= new User();
		user.setUsername("new_name");
		user.setPassword("pass");
		user.setEnabled(true);
		UserManager manager = new UserManager();
		manager.Create(user);
		manager.Create(user);
		manager.Create(user);
		manager.Create(user);
		manager.Create(user);
		manager.editUserName(7,"7");

	}

}
