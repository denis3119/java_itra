package java_itra;

import org.hibernate.Session;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("12312321");
		Session session = HibernateUtilites.getSessionFactory().openSession();
		session.beginTransaction();

		User user= new User();
		user.setUsername("name2");
		user.setPassword("pass");
		user.setEnabled(true);
		session.save(user);

		session.getTransaction().commit();
		session.beginTransaction();
		user= (User) session.load(User.class,3);
		System.out.println(user.getUsername());
		user.setUsername("11235");



		session.getTransaction().commit();
		session.close();
		HibernateUtilites.getSessionFactory().close();
	}

}
