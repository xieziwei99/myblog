package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import pojo.Product;

/** insertion & selection & deletion & update */
public class TestHibernate1 {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
//		// insertion
//		for (int i = 0; i < 10; i++) {
//			Product product = new Product();
//			product.setName("iphone" + i);
//			product.setPrice(i * 1000);
//			session.save(product);
//		}
		
//		// selection where id=1
//		Product product = (Product) session.get(Product.class, 2);
//		System.out.println(product.toString());
		
//		// deletion first get, then delete
//		Product product = (Product) session.get(Product.class, 1);
//		session.delete(product);
		
		// update first get, then update
		Product product = (Product) session.get(Product.class, 6);
		product.setName("iphone6666");
		session.update(product);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
}
