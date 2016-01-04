package com.learnandpush.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.learnandpush.dao.*;
import com.learnandpush.model.*;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// access customer dao bean here how?
		ApplicationContext context = new ClassPathXmlApplicationContext("/MyServlet-security.xml");
		CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDAO");
		Customer customer = new Customer(1, "shubh", 28);
		customerDAO.insert(customer);

		Customer customer1 = customerDAO.findByCustomerId(1);
		System.out.println(customer1);

	}

}
