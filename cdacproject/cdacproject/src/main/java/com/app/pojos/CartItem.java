package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="Cart_item")
public class CartItem {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id",length=20)
	private int id;
	
	@ManyToOne
	@JoinColumn(name="Customer_id",nullable = false)
	private  Customer customer;
	
	@ManyToOne
	@JoinColumn(name="Cake_id",nullable = false)
	private  Cake cake;
	
	@Column(name="Quantity",length=60)
	private int quantity;
	
	public CartItem() {
		System.out.println("In the Cart Pojo Details");
	}

	public CartItem(Integer id, Customer customer, Cake cake, int quantity) {
		super();
		this.id = id;
		this.customer = customer;
		this.cake = cake;
		this.quantity = quantity;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Cake getCake() {
		return cake;
	}

	public void setCake(Cake cake) {
		this.cake = cake;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "CartItems [id=" + id + ", customer=" + customer + ", cake=" + cake + ", quantity=" + quantity
				+ "]";
	}
	@Transient
	public double getSubtotal() {
	  return this.cake.getPrice()*quantity;
	}
}
