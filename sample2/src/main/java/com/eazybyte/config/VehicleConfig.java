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
	Vehicle vehicle2() {
		var veh = new Vehicle();
		veh.setName("Farari");
		return veh;
	}
	
	
	@Bean
	Vehicle vehicle3() {
		var veh = new Vehicle();
		veh.setName("GT Mustang");
		return veh;
	}
}
