package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pojo.Product;
import service.ProductService;

@Controller
public class ProductController {

	@Autowired
	ProductService productService;
	
	@RequestMapping("listProduct")
	public ModelAndView listProduct() {
		ModelAndView modelAndView = new ModelAndView();
		List<Product> products = productService.list();
		
		modelAndView.addObject("products", products);
		modelAndView.setViewName("listProduct");
		return modelAndView;
	}
}
