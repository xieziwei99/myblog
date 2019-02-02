package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.CategoryMapper;
import pojo.Category;
import service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	CategoryMapper categoryMapper;

	@Override
	public List<Category> list() {
		return categoryMapper.list();
	}

	@Override
	public int add(Category category) {
		categoryMapper.add(category);
		return 1;
	}

	@Override
	public void delete(int id) {
		categoryMapper.delete(id);
	}

	@Override
	public int update(Category category) {
		categoryMapper.update(category);
		return 1;
	}

	@Override
	public Category get(int id) {
		return categoryMapper.get(id);
	}

//	@Override
//	public int total() {
//		return categoryMapper.total();
//	}
//
//	@Override
//	public List<Category> list(Page page) {
//		return categoryMapper.list(page);
//	}

}
