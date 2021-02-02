package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cake_details")
public class Cake {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Cake_id",length=20)
	private int cakeId;
	
	@Column(name="Flavour",length=20)
	private String flavour;
	
	@Column(name="Shape",length=20)
	private String shape;
	
	@Column(name="Size",length=20)
	private int size;
	
	@Column(name="Price", length=20)
	private double price;
	
	@Column(name="No_of_cakes", length=20)
	private int noOfCakes;
	
	public Cake() {
		System.out.println("In the Cake Details Pojo");
	}

	public Cake(int cakeId, String flavour, String shape, int size, double price, int noOfCakes) {
			
		super();
		this.cakeId = cakeId;
		this.flavour = flavour;
		this.shape = shape;
		this.size = size;
		this.price = price;
		this.noOfCakes = noOfCakes;
	}

	public int getCakeId() {
		return cakeId;
	}

	public void setCakeId(int cakeId) {
		this.cakeId = cakeId;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNoOfCakes() {
		return noOfCakes;
	}

	public void setNoOfCakes(int noOfCakes) {
		this.noOfCakes = noOfCakes;
	}

	@Override
	public String toString() {
		return "CakeDetails [cakeId=" + cakeId + ", flavour=" + flavour + ", shape=" + shape + ", size=" + size
				+ ", price=" + price + ", noOfCakes=" + noOfCakes + "]";
	}

	
	
}
