package test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import pojo.Product;

//import pojo.Product;

/** 查询：HQL; Criteria; Standard SQL; */
public class TestHibernate2 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		// HQL
//		Query query = session.createQuery("from Product p where p.name like ?");
//		query.setString(0, "%iphone%");		// Query start from 0
//		List<Product> products = query.list();
//		for (Product product : products) {
//			System.out.println(product);
//		}
		
		// Criteria 分页查询 
		Criteria criteria = session.createCriteria(Product.class);
		criteria.add(Restrictions.like("name", "%iphone%"));
		criteria.setFirstResult(2);		// 从第三条数据开始
		criteria.setMaxResults(5);		// 查询五条数据
		List<Product> products = criteria.list();
		for (Product product : products) {
			System.out.println(product);
		}
		
		// Standard SQL
//		Query query = session.createSQLQuery
//				("select * from product_ p where p.name like '%iphone%'");
//		List<Object[]> list = query.list();
//		for (Object[] objects : list) {
//			for (Object object : objects) {
//				System.out.print(object + "\t");
//			}
//			System.out.println();
//		}
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
}
