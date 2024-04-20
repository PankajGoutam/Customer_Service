package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {
public List<Customer> data;

public CustomerService() {
	data=new ArrayList<Customer>();
	Customer c1=new Customer(101,"aaa","indore");
	Customer c2=new Customer(102,"bbb","ujjain");
	Customer c3=new Customer(103,"ccc","bhopal");
	data.add(c1);
	data.add(c2);
	data.add(c3);
}

public List<Customer> show()
{
	return data;
}
}
