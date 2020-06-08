package com.example.demo;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;
@Component
public class CSVFilterImpl implements ICSVFilter{
	
	/*
	 * filter 
	 */

	@Override
	public List<Product> FilterProducts(List<Product> productsList) {
		// TODO Auto-generated method stub
		return productsList.stream().filter(p->p.getProductPrice()>5000.00).collect(Collectors.toList());
	
	}
}
