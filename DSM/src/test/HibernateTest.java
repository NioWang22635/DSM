package test;

import org.hibernate.SessionFactory;
import org.junit.Test;

import com.hitrust.dsm.util.HibernateUtil;

public class HibernateTest {
	
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		System.out.println(sessionFactory);
		sessionFactory.close();
	}
	
	@Test
	public void testMain() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		System.out.println("Hi");
		
		System.out.println(sessionFactory);
	}
	
}
