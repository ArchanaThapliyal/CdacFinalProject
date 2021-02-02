package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Admin;
import com.app.service.IAdminService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private IAdminService service;
     
	public AdminController() {
		System.out.println("in ctor of " + getClass().getName());
	}
	
	 @PostMapping("/login")
	
	  public Admin loginAdmin(@RequestBody Admin admin)throws Exception {
	
		String tempEmailId = admin.getEmailId();
		  String tempPass = admin.getPassword();
		  
		  Admin adminObj = null;
		  if(tempEmailId !=null && tempPass !=null){
			  System.out.println(adminObj);
			   adminObj = service.fetchAdminByEmailIdAndPassword(tempEmailId, tempPass);
		  }
		  //if user does not exist
		  if(adminObj == null) {
			  throw new Exception("Admin doesn't exist");
		  }
		  return adminObj;
	  }
}