package service;

import org.springframework.stereotype.Component;

@Component("s")
public class ProductService {

	public void doService() {
		System.out.println("do some service");
	}
	
	public int doService2(int a) {
		System.out.println(a);
		return a + 1;
	}
}
