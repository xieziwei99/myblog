package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import pojo.Product;

/** test 事务 */
public class TestHibernate4 {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		// test 事务
		Product product = (Product) session.get(Product.class, 3);
		session.delete(product);
		
		product = (Product) session.get(Product.class, 4);
		product.setName("alalalalalalalalalalalalalalalalalallalalalalalalalalalalalalalalalalala");
		session.update(product);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
}
