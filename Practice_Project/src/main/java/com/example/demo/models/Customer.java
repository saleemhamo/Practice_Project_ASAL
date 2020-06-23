package com.example.demo.models;

import javax.persistence.Entity;

@Entity
public class Customer extends Person{
	
	private int cId;

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}
	

}
