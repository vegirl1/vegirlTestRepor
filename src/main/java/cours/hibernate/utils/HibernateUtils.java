package cours.hibernate.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class HibernateUtils {
	
	private static SessionFactory sessionFactory = null;
	
	public static SessionFactory buildSessionFactory() throws FileNotFoundException, IOException{
		
		java.util.Properties properties = new Properties();
		properties.load(SessionFactory.class.getClassLoader().getResourceAsStream("hibernate-environment.properties"));
		
		Configuration configuration = new Configuration().configure().addProperties(properties);
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
		return sessionFactory;
	}
	
	public static Session getCurrentSession(){
		return getSessionFactory().getCurrentSession();
	}
	
	public static void closeSessionFactory(){
		sessionFactory.close();
	}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
}