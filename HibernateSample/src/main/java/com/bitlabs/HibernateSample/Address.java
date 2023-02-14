package com.bitlabs.HibernateSample;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
 
@Entity
@Table(name="student_address")
public class Address {
 
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="address_id")
    private int id;
    @Column(name="street_name")
    private String street;
    @Column(name="student_city")
    private String city;
    @Column(name="is_open")
    private boolean open;
    @Transient
    private double x;
    @Column(name="added_date")
    @Temporal(TemporalType.DATE)
    private Date addedDate;
    
    public Address(String street, String city, boolean open, double x, Date addedDate, byte[] image) {
		super();
		this.street = street;
		this.city = city;
		this.open = open;
		this.x = x;
		this.addedDate = addedDate;
		this.image = image;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Lob
    private byte[] image;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}
}

