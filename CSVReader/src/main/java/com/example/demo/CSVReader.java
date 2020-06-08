package com.example.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CSVReader {
	
	ICSVFilter filter;
	List<Product> listOfProduct = new ArrayList<Product>();
	
	public CSVReader(ICSVFilter filter) {
		this.filter = filter;
	}
	
	public List<Product> readCSV() throws Exception{
		FileReader filereader = new FileReader(new File("csvfile.txt"));
		BufferedReader br = new BufferedReader(filereader);
		String line = br.readLine();
		while(line!=null){
			String[] split = line.split(",");
			String productNumber = split[0];
			String productName = split[1];
			String productPrice = split[2];
			
			Product p = new Product();
			p.setProductName(productName);
			p.setProductNumber(Integer.parseInt(productNumber));
			p.setProductPrice(Double.parseDouble(productPrice));
			
			listOfProduct.add(p);
			line = br.readLine();
			
			
		}
		
		br.close();
		return filter.FilterProducts(listOfProduct);
		
	}

}
