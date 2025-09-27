package com.eazybyte.bean;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	
}
