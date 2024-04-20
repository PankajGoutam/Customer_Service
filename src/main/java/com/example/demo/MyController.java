package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyController {
@Autowired
public RestTemplate template;
@Autowired
public CustomerService service;
@CrossOrigin
@GetMapping("/customer")
public List<Customer> getInfo()
{
	List<Customer> data=this.service.show();
	int cn=35;
	for(Customer c:data)
	{
		c.setProduct(this.template.getForObject("https://mejevo.pythonanywhere.com/product/"+cn, Product.class));
		cn++;
	}
	return data;
}
}
