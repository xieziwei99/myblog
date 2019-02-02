package mapper;

import java.util.List;

import pojo.Product;

public interface ProductMapper {

	public List<Product> list();
	
	public int add(Product product);
	
	public void delete(int id);
	
	public int update(Product product);
	
	public Product get(int id); 
}
