import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.eazybyte.bean.Vehicle;
import com.eazybyte.config.VehicleConfig;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var context = new AnnotationConfigApplicationContext(VehicleConfig.class);
		Vehicle vehicle = context.getBean(Vehicle.class);
		System.out.println("Veicle Name is : "+vehicle);
		
		String hello = context.getBean(String.class);
		System.out.println(hello);
		
		Integer number = context.getBean(Integer.class);
		System.out.println(number);
	}

}


