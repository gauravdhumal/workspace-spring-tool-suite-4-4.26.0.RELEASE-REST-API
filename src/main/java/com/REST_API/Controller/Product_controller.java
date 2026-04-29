package com.REST_API.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.REST_API.Model.Product;
import com.REST_API.Repository.Product_repo;

@RestController
public class Product_controller {
	
	@Autowired
	Product_repo repo1;
	@GetMapping("/Product")
	public List<Product> findAllBg(){
		List<Product> list = repo1.findAll();
		return list;
	}

}
