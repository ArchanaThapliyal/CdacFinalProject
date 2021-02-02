package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Cake;
import com.app.service.ICakeService;

@RestController 
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/admin")
public class CakeController {
	
	@Autowired
	private ICakeService service;

	public CakeController() {
		System.out.println("in ctor of " + getClass().getName());
	}
	
	@GetMapping("/list")
	@CrossOrigin(origins="http://localhost:4200")
	public ResponseEntity<?> listAllCake() {
		System.out.println("in list all Cake");
		List<Cake> cakes = service.getAllCakes();
		if (cakes.isEmpty())
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<>(cakes, HttpStatus.OK);
	}
	
		@PostMapping("/addcake")
		@CrossOrigin(origins="http://localhost:4200")
		public ResponseEntity<?> addNewProduct(@RequestBody Cake c) {
			System.out.println("in add new cake " + c);
			return ResponseEntity.ok(service.addCakeDetails(c));
		}

		@PutMapping("/editcake")
		@CrossOrigin(origins="http://localhost:4200")
		public ResponseEntity<?> updateCakeDetails(@RequestBody Cake c) {
			System.out.println("in update cake " + c);
			try {
				return ResponseEntity.ok(service.updateCakeDetails(c));
			} catch (RuntimeException e) {
				System.out.println("err in controller " + e);
			}
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		 @DeleteMapping("/deletecake/{cakeId}")
		 @CrossOrigin(origins="http://localhost:4200")
			public void deleteCakeDetails(@PathVariable int cakeId) {
				System.out.println("in del cake dtls " + cakeId);
				try {
					service.deleteCakeDetails(cakeId);
				} catch (RuntimeException e) {
					System.out.println("err in controller " + e);
				}
		 }
}
