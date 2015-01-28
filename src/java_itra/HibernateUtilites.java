package java_itra;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtilites {

	private static SessionFactory sessionFactory;
	private static ServiceRegistry serviceRegistry;
	
	static 
	{
		
		try 
		{
			Configuration conf = new Configuration().configure();
			serviceRegistry  = new ServiceRegistryBuilder().applySettings( conf.getProperties()).buildServiceRegistry();
			sessionFactory = conf.buildSessionFactory(serviceRegistry);
		}
		catch(HibernateException exception){
			System.out.println("error create sessionFactory");
		}
	}

	public static SessionFactory getSessionFactory()
	{
		return sessionFactory;
	}
}
