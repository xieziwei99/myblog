package test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import mapper.CategoryMapper;
import pojo.Category;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MybatisTest {

	@Autowired 
	private CategoryMapper categoryMapper;
	
//	@Test
	public void testAdd() {
		for (int i = 1; i <= 100; i++) {
			Category category = new Category();
			category.setName("category" + i);
			categoryMapper.add(category);
		}
	}
	
//	@Test
//	public void testTotal() {
//		System.out.println(categoryMapper.total());
//	}
	
}
