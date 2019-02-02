package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import pojo.Category;
import service.CategoryService;
import util.Page;

@Controller
public class CategoryController {

	@Autowired
	CategoryService categoryService;
	
	@RequestMapping("listCategory")
	public ModelAndView listCategory(Page page) {
		ModelAndView modelAndView = new ModelAndView();
		PageHelper.offsetPage(page.getStart(), page.getCount());
		List<Category> categories = categoryService.list();
		int total = (int) new PageInfo<>(categories).getTotal();
		page.calculateLast(total);
		
		modelAndView.addObject("cs", categories);
		modelAndView.setViewName("listCategory");
		return modelAndView;
	}
	
	@RequestMapping("addCategory")
	public ModelAndView addCategory(Category category) {
		categoryService.add(category);
		ModelAndView modelAndView = new ModelAndView("redirect:/listCategory");
		return modelAndView;
	}
	
	@RequestMapping("deleteCategory")
	public ModelAndView deleteCategory(int id) {
		categoryService.delete(id);
		ModelAndView modelAndView = new ModelAndView("redirect:/listCategory");
		return modelAndView;
	}
	
	@RequestMapping("editCategory")
	public ModelAndView editCategory(Category category) {
		Category c = categoryService.get(category.getId());
		ModelAndView modelAndView = new ModelAndView("editCategory");
		modelAndView.addObject("c", c);
		return modelAndView;
	}
	
	@RequestMapping("updateCategory")
	public ModelAndView updateCategory(Category category){
		categoryService.update(category);
		ModelAndView mav = new ModelAndView("redirect:/listCategory");
		return mav;
	}
	
}
