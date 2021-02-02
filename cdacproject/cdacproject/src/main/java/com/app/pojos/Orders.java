package com.app.pojos;

import javax.persistence.*;

@Entity
@Table(name="Order_details")
public class Orders {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Orderid",length=60)
	private int orderId;
	
	@ManyToOne
	@JoinColumn(name="Customer_id",nullable = false)
	private  Customer customer;
	
	@ManyToOne
	@JoinColumn(name="Cake_id",nullable = false)
	private  Cake cake;
	
	@Column(name="Quantity",length=60)
	private int quantity;
	
	@Column(name="Price",length=60)
	private double price;
	
	@Column(name="Totalbill",length=60)
	private double totalbill;
	
	public Orders() {
		System.out.println("In the Orders Pojo Details");
	}

	public Orders(int orderId, Customer customer, Cake cake, int quantity, double price, double totalbill) {
		super();
		this.orderId = orderId;
		this.customer = customer;
		this.cake = cake;
		this.quantity = quantity;
		this.price = price;
		this.totalbill = totalbill;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTotalbill() {
		return totalbill;
	}

	public void setTotalbill(double totalbill) {
		this.totalbill = totalbill;
	}

	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", customer=" + customer + ", cake=" + cake + ", quantity=" + quantity
				+ ", price=" + price + ", totalbill=" + totalbill + "]";
	}

	
    
}