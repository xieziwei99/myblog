package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//import pojo.Category;
import pojo.Product;

/** test 事务; 属性延迟加载; 关系延迟加载; 级联 */
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
		
		// 属性延迟加载
//		Product product = (Product) session.load(Product.class, 3);
//		System.out.println("log1");
//		System.out.println(product.getName());
//		System.out.println("log2");
		
		// 关系延迟加载
//		Category category = (Category) session.get(Category.class, 1);
//		System.out.println("log1");
//		System.out.println(category.getProducts().toString());
//		System.out.println("log2");
		
		// 级联
//		Category category = new Category();
//		category.setName("c2");
//		session.save(category);
//		Product product = (Product) session.get(Product.class, 9);
//		product.setCategory(category);
//		session.update(product);
//		Category category = (Category) session.get(Category.class, 4);
//		session.delete(category);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
}
