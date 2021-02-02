package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Customer_id",length=60)
	private int custId;
	
	@Column(name="Email_id",length=60,unique=true)
	private String emailId;
	
	@Column(name="Password",length=60)
	private String password;
	
	@Column(name="Customer_name",length=60)
	private String custName;
	
	@Column(name="Location",length=60)
	private String location;
	
	@Column(name="Phone_number",length=60,unique=true)
	private long phoneNumber;
	
	public Customer() {
		System.out.println("In the Customer Pojo Details");
	}
	public Customer(int custId, String emailId, String password, String custName, String location, 
		 long phoneNumber) {
			
		super();
		this.custId = custId;
		this.emailId = emailId;
		this.password = password;
		this.custName = custName;
		this.location = location;
		this.phoneNumber = phoneNumber;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
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

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", emailId=" + emailId + ", custName=" + custName + ", location="
				+ location + ", phoneNumber=" + phoneNumber + "]";
	}



	


	
}
