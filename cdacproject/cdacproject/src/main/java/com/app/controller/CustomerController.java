package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Customer;
import com.app.service.ICustomerService;

@RestController

public class CustomerController {
	
	@Autowired
	private ICustomerService service;
	
	public CustomerController() {
		System.out.println("in ctor of " + getClass().getName());
	}
	
	@PostMapping("/register")
	@CrossOrigin(origins="http://localhost:4200")
      public Customer registerCustomer(@RequestBody Customer customer) throws Exception {
		  
		  String tempEmailId=customer.getEmailId();
		  //validate email
		  if(tempEmailId !=null && !"".equals(tempEmailId)){
			  Customer custObj= service.fetchCustomerByEmailId(tempEmailId);
			  if(custObj != null) {
				  throw new Exception("Customer with this "+tempEmailId+" is already exist");
			  }
		   }
    	   Customer custObj = null;
    	   custObj  = service.saveCustomer(customer);
    	   return custObj;
      }
	  
	  @PostMapping("/login")
	  @CrossOrigin(origins="http://localhost:4200")
	  public Customer loginCustomer(@RequestBody Customer customer)throws Exception {
		  String tempEmailId = customer.getEmailId();
		  String tempPass = customer.getPassword();
		  
		  Customer custObj = null;
		  if(tempEmailId !=null && tempPass !=null){
			   custObj = service.fetchCustomerByEmailIdAndPassword(tempEmailId, tempPass);
		  }
		  //if user does not exist
		  if(custObj == null) {
			  throw new Exception("Customer doesn't exist");
		  }
		  return custObj;
	  }
}