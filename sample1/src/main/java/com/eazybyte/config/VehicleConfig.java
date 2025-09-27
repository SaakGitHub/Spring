package com.eazybyte.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.eazybyte.bean.Vehicle;

@Configuration
public class VehicleConfig {

	@Bean
	Vehicle vehicle1() {
		var veh = new Vehicle();
		veh.setName("Toyoto Supra");
		return veh;
	}
	
	@Bean
	String sayHello() {
		return "Hello";
	}
	
	@Bean
	Integer printNUmber() {
		return 64;
	}
}
