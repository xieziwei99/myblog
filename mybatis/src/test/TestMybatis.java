package test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import mapper.ProductMapper;
import pojo.Product;

public class TestMybatis {

	public static void main(String[] args) throws IOException {
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
	
		// insertion
//		Category c = new Category();
//		c.setName("c3");
//		sqlSession.insert("addCategory", c);
		
		// deleteion
//		Category c = new Category();
//		c.setId(5);
//		sqlSession.delete("deleteCategory", c);
		
		// select one and update
//		Category c = sqlSession.selectOne("getCategory", 7);
//		c.setName("updated name");
//		sqlSession.update("updateCategory", c);
		
//		Map<String, Object> params = new HashMap<>();
//		params.put("id", 8);
//		params.put("name", "c");
//		List<Category> categories = sqlSession.selectList("listCategoryByIdAndName", params);
//		for (Category category : categories) {
//			System.out.println(category);
//		}
		
		// one to many
//		List<Category> categories = sqlSession.selectList("listCategory");
//		for (Category category : categories) {
//			System.out.println(category);
//			List<Product> products = category.getProducts();
//			for (Product product : products) {
//				System.out.println("\t" + product);
//			}
//		}
		
		// many to one
//		List<Product> products = sqlSession.selectList("listProduct");
//		for (Product product : products) {
//			System.out.println(product + " -> " + product.getCategory());
//		}
		
		// if & where
//		System.out.println("select * from product");
//		List<Product> products = sqlSession.selectList("listProduct");
//		for (Product product : products) {
//			System.out.println(product);
//		}
		
//		Map<String, Object> params = new HashMap<>();
//		params.put("name", "iphone");
//		params.put("price", 4000);
//		List<Product> products2 = sqlSession.selectList("listProduct", params);
//		for (Product product : products2) {
//			System.out.println(product);
//		}
		
//		Product product = new Product();
//		product.setId(6);
//		product.setName("iphone6");
//		product.setPrice(6000L);
//		sqlSession.update("updateProduct", product);
		
//		CategoryMapper mapper = sqlSession.getMapper(CategoryMapper.class);
//		Category category = mapper.get(7);
//		category.setName("c4");
//		mapper.update(category);
		
//		CategoryMapper mapper = sqlSession.getMapper(CategoryMapper.class);
//		List<Category> categories = mapper.listCategoryWithProduct();
//		for (Category category : categories) {
//			System.out.println(category);
//			List<Product> products = category.getProducts();
//			for (Product product : products) {
//				System.out.println("\t" + product);
//			}
//		}
		
		ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);
		List<Product> products = mapper.listProductWithCategory();
		for (Product product : products) {
			System.out.println(product + " -> " + product.getCategory());
		}
		
		sqlSession.commit();
		sqlSession.close();
	}
}
