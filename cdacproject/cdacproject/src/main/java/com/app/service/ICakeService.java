package com.app.service;

import java.util.List;

import com.app.pojos.Cake;

public interface ICakeService {
	
	// list all Cake
	List<Cake> getAllCakes();
	
	// add new Cake details
	Cake addCakeDetails(Cake c);

	// update existing Cake details
	Cake updateCakeDetails(Cake c);

	//delete product details
	public void deleteCakeDetails(int cakeId);
	
}
