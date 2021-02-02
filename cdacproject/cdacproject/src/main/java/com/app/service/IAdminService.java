package com.app.service;

import com.app.pojos.Admin;

public interface IAdminService {
	public Admin fetchAdminByEmailIdAndPassword(String email, String password);
}
