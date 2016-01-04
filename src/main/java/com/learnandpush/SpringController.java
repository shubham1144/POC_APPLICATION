package com.learnandpush;
//create a controller that will intercept the request that is obtained by the servlet by 

//using servlet mapping in the web.xml file and then take the necessary action based on requestmapping

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.learnandpush.dao.CustomerDAO;
import com.learnandpush.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.context.SecurityContextHolder;

//mention this controller annotation otherwise the system framework will b=not be able to register the controller !!and without registration we will not be able to use the controller
@Controller
public class SpringController {
	// using autowired inorder to access custom bean from the mvc
	// controller(again,this is one of the ways of injecting a bean into a .java
	// file )
	@Autowired
	private CustomerDAO customerDAO;

	@RequestMapping(value = "/loggedin")
	public String loginSuccess(Model model) {
		System.out.println("executing this function  incase of authentication success");

		/*
		 * implemented this module to connect to database and perform crud
		 * operations , implementation of sql server starts here
		 */

		// CustomerDAO customerDAO = (CustomerDAO)
		// context.getBean("customerDAO");
		// Customer customer = new Customer(2, "shubham", 22);
		// customerDAO.insert(customer);
		// trying to fetch details of the authenticated user from here using
		// security context object
		System.out.println("the details of the user are : " +  SecurityContextHolder.getContext().getAuthentication());
		System.out.println("the details of the user are : " +  SecurityContextHolder.getContext().getAuthentication());
		System.out.println("the details of the user are : " +  SecurityContextHolder.getContext().getAuthentication().getDetails());
		System.out.println("the details of the user are : " +  SecurityContextHolder.getContext().getAuthentication().getCredentials());

     	 //add the details to be displayed on the screen
		model.addAttribute("data",SecurityContextHolder.getContext().getAuthentication());
		Customer customer1 = customerDAO.findByCustomerId(2);
		System.out.println("the customer details are " + customer1.getName());

		/* implementation of sql server ends here */
		return "Success";
	}

}
