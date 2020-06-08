package com.example.demo;

import java.util.Iterator;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;



@SpringBootApplication
public class CsvReaderApplication {

	public static void main(String[] args) throws Exception{
		ConfigurableApplicationContext ctx = SpringApplication.run(CsvReaderApplication.class, args);
		CSVReader reader = ctx.getBean(CSVReader.class); 
		System.out.println("HEllo");
		List<Product> filteredProducts = reader.readCSV();
		System.out.println("HEllo22");
		
		/*
		 * Iterator<Product> it = filteredProducts.iterator();
		 * while(it.hasNext()) { System.out.println("item "+it.next()); }
		 */
			filteredProducts.forEach(System.out::println);
		
		
	}

}
