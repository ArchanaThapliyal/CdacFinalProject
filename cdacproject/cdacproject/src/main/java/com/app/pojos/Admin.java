package com.app.pojos;

import javax.persistence.*;

@Entity
@Table(name = "Admin")
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Admin_Id",length=20)
	private int adminId;
	
	@Column(name = "Email_Id", length = 50, unique = true)
	private String emailId;
	
	@Column(name = "Password", length = 20)
	private String password;

	public Admin() {
		System.out.println("in the admin pojo Details..");
	}
    
	public Admin(int adminId, String emailId, String password) {
		super();
		this.adminId = adminId;
		this.emailId = emailId;
		this.password = password;
	}

	public int getAdminId() {
		return adminId;
	}
	
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", emailId=" + emailId + "]";
	}

	
}
