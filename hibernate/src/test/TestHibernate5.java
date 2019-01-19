package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import pojo.Product;

// 乐观锁处理脏数据
public class TestHibernate5 {
	
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Session session2 = sessionFactory.openSession();
		session.beginTransaction();
		session2.beginTransaction();
		
		Product product = (Product) session.get(Product.class, 12);
		System.out.println("产品原本价格是: " + product.getPrice());
		product.setPrice(product.getPrice() + 1000L);
		
		Product product2 = (Product) session2.get(Product.class, 12);
		product2.setPrice(product2.getPrice() + 1000L);
		
		session.update(product);
		session2.update(product2);
		session.getTransaction().commit();
		session2.getTransaction().commit();
		session.close();
		session2.close();
		sessionFactory.close();
		// 用乐观锁后，尽管第二次修改会抛出异常，但第一次修改仍然有效
  	}
}
