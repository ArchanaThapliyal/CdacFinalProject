package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IAdminDao;
import com.app.pojos.Admin;


@Service
public class AdminServiceImpl implements IAdminService {

	@Autowired
	private IAdminDao dao;
	
	public Admin fetchAdminByEmailIdAndPassword(String email, String password) {
		return dao.findByEmailIdAndPassword(email,password);
	}

}
