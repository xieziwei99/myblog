package test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//import pojo.Category;
import pojo.Product;
import pojo.User;

/** test many2one; one2many; many2many */
public class TestHibernate3 {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
//		Category category = new Category();
//		category.setName("c1");
//		session.save(category);
		
//		Category category = (Category) session.get(Category.class, 1);
//		Product product = (Product) session.get(Product.class, 7);
//		product.setCategory(category);
//		session.update(product);
		
//		Category category = (Category) session.get(Category.class, 1);
//		Set<Product> products = category.getProducts();
//		for (Product product : products) {
//			System.out.println(product);
//		}
		
//		Set<User> users = new HashSet<>();
//		for (int i = 1; i <= 3; i++) {
//			User user = new User();
//			user.setName("user" + i);
//			session.save(user);
//			users.add(user);
//		}
//		Product product = (Product) session.get(Product.class, 3);
//		product.setUsers(users);
//		session.save(product);
		
		Set<Product> products = new HashSet<>();
		Product product = (Product) session.get(Product.class, 4);
		products.add(product);
		product = (Product) session.get(Product.class, 5);
		products.add(product);
		User user = (User) session.get(User.class, 4);
		user.setProducts(products);
		session.save(user);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
}
