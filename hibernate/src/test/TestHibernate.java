package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import pojo.Product;

/** Hello Hibernate */
public class TestHibernate {
	
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Product product = new Product();
		product.setName("iphone7");
		product.setPrice(7000);
		System.out.println("此时product是瞬时状态");
		
		session.save(product);
		System.out.println("此时product是持久状态");
		
		session.getTransaction().commit();
		session.close();
		System.out.println("此时product是脱管状态");
		sessionFactory.close();
	}
}
