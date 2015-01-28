package java_itra;

import org.hibernate.HibernateException;
import org.hibernate.Session;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("12312321");
		Session session = HibernateUtilites.getSessionFactory().openSession();
		session.close();
	}

}
