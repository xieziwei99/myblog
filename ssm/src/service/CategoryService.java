package service;

import java.util.List;

import pojo.Category;

public interface CategoryService {

	public List<Category> list();
	
//	public int total();
//	
//	public List<Category> list(Page page);
	
	public int add(Category category);
	
	public void delete(int id);
	
	public int update(Category category);
	
	public Category get(int id);
}
