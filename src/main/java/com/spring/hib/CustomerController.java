package com.spring.hib;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.hib.dao.CustomerDAO;
import com.spring.hib.model.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerDAO customerDAO;
	
	@RequestMapping(value="/list")
	public String listCustomers(Model model){
		
		List<Customer> customers = customerDAO.getCustomers();
		model.addAttribute("customers", customers);
		
		return "list-customers";
	}
}
