package com.app.service;

import com.app.pojos.Customer;

public interface ICustomerService {
	public Customer saveCustomer(Customer customer);
	public Customer fetchCustomerByEmailId(String email);
	public Customer fetchCustomerByEmailIdAndPassword(String email, String password);
}
