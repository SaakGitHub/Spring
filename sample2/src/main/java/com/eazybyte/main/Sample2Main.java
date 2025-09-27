package com.eazybyte.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.eazybyte.bean.Vehicle;
import com.eazybyte.config.VehicleConfig;

public class Sample2Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(VehicleConfig.class);
		
		Vehicle vehicle = context.getBean("vehicle3",Vehicle.class);
		System.out.println("Vehicle is : "+vehicle);
	}
}
