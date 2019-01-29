package mapper;

import java.util.List;

import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;

import pojo.Category;

public interface CategoryMapper {

//	@Insert("insert into category_ ( name ) values (#{name})")
//	public int add(Category category);
//	
//	@Delete("delete from category_ where id= #{id}")
//	public void delete(int id);
//	
//	@Select("select * from category_ where id= #{id}")
//	public Category get(int id);
//	
//	@Update("update category_ set name= #{name} where id = #{id}")
//	public int update(Category category);
//	
//	@Select("select * from category_")
//	public List<Category> listAll();
	
	@InsertProvider(type=CategoryDynaSqlProvider.class, method="add")
	public int add(Category category);
	
	@DeleteProvider(type=CategoryDynaSqlProvider.class,method="delete")
    public void delete(int id); 
        
    @SelectProvider(type=CategoryDynaSqlProvider.class,method="get") 
    public Category get(int id); 
      
    @UpdateProvider(type=CategoryDynaSqlProvider.class,method="update") 
    public int update(Category category);  
        
    @SelectProvider(type=CategoryDynaSqlProvider.class,method="listAll")     
    public List<Category> listAll();
	
	@Select("select * from category_")
	@Results({
		@Result(property = "id", column = "id"),
		@Result(property = "products", javaType = List.class, column = "id", many = @Many(select = "mapper.ProductMapper.listByCategory"))
	})
	public List<Category> listCategoryWithProduct();
	
	@Select(" select * from category_ limit #{start},#{count}")
    public List<Category> listByPage(@Param("start") int start, @Param("count")int count);
}
