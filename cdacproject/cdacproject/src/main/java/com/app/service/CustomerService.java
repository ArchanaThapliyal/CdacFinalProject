package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ICustomerDao;
import com.app.pojos.Customer;

@Service
public class CustomerService implements ICustomerService {
	
	@Autowired
	private ICustomerDao dao;
	
     public Customer saveCustomer(Customer customer) {
    	return  dao.save(customer);//called inbuilt method of jparepository
     } 
     
     public Customer fetchCustomerByEmailId(String email) {
    	 return dao.findByEmailId(email);
     }
     
     public Customer fetchCustomerByEmailIdAndPassword(String email, String password) {
    	 return dao.findByEmailIdAndPassword(email,password);
     }
     
}
 