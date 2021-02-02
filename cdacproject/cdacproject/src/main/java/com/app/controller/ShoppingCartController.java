package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Cake;
import com.app.pojos.Customer;
import com.app.service.ICustomerService;
import com.app.service.ShoppingCartServices;

@RestController
public class ShoppingCartController {
	
	@Autowired 
	private ShoppingCartServices cartService;
	
	public ShoppingCartController() {
		System.out.println("in ctor of " + getClass().getName());
	} 
	@PostMapping("/cart/add/{cakeId}/{quantity}/{custId}")
	public String addCakeToCart(@PathVariable("cakeId") Integer cakeId,@PathVariable("quantity") int quantity,
			@PathVariable("custId") Integer custId) {
		System.out.println("in cart contr "+cakeId+""+quantity+""+custId);
		
		Integer addedQuantity = cartService.addCake(cakeId, quantity, custId);
		return addedQuantity+" item of were added";
	}
}
