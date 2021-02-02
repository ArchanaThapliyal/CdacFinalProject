package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ICakeDao;
import com.app.dao.ICartItemDao;
import com.app.dao.ICustomerDao;
import com.app.pojos.Cake;
import com.app.pojos.CartItem;
import com.app.pojos.Customer;

@Service
public class ShoppingCartServices {
	@Autowired
	private ICartItemDao cartDao;
	
	@Autowired
	private ICakeDao cakeDao;
	 
	@Autowired
	private ICustomerDao customerDao;
	
	public List<CartItem> listcartItems(Customer customer){
		return cartDao.findByCustomer(customer);
	}
	
	public Integer addCake(Integer cakeId, Integer quantity, Integer custId) {
		Integer addedQuantity = quantity;
		Cake cake = cakeDao.findById(cakeId).get();
		Customer customer = customerDao.findById(custId).get();
		CartItem cartItem = cartDao.findByCustomerAndCake(customer, cake);
		if(cartItem != null)
		{
			addedQuantity = cartItem.getQuantity() + quantity;
			cartItem.setQuantity(addedQuantity);
		}
		else {
			cartItem = new CartItem();
			cartItem.setQuantity(quantity);
			cartItem.setCustomer(customer);
			cartItem.setCake(cake);
		}
		cartDao.save(cartItem);
		return addedQuantity;
	}
	
}
