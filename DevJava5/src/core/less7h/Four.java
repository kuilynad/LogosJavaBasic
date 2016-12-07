package core.less7h;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;

import core.less7h.Body; 
import core.less7h.SteeringWheel; 
import core.less7h.Wheel; 
import core.less7h.Car.*; 

import java.util.List;

import core.less6h.Univercity;
import static core.less7h.Body.*;
import static core.less7h.Car.*;
import static core.less7h.Wheel.*;
import static core.less7h.SteeringWheel.*;

public class Four {
		
		public static void cars4() {
		
			Car car1 = new Car("Ferrari", new Body("Red"), new SteeringWheel(16, false), new Wheel(16, 4)); 
			Car car2 = new Car("BMW", new Body("Red"), new SteeringWheel(16, false), new Wheel(16, 4)); 
			Car car3 = new Car("Ford", new Body("Red"), new SteeringWheel(16, false), new Wheel(16, 5)); 
			Car car4 = new Car("BMW", new Body("Black"), new SteeringWheel(16, false), new Wheel(15, 4)); 
			Car car5 = new Car("Ford", new Body("Black"), new SteeringWheel(16, true), new Wheel(15, 4)); 
			Car car6 = new Car("Ferrari", new Body("Black"), new SteeringWheel(15, true), new Wheel(15 ,4)); 
			Car car7 = new Car("BMW", new Body("Green"), new SteeringWheel(15, true), new Wheel(15 ,5)); 
			Car car8 = new Car("Ford", new Body("Green"), new SteeringWheel(15, true), new Wheel(17 ,5)); 
			
			Car def = new Car("Drof", new Body("Blue"), new SteeringWheel(99, true), new Wheel(35 ,12));
			
			List<Car> list = new ArrayList<>(); 
			
			list.add(car1); 
			list.add(car2); 
			list.add(car3); 
			list.add(car4); 
			list.add(car5); 
			list.add(car6); 
			list.add(car7); 
			list.add(car8); 

			
			
			//list.forEach(System.out::println); 
			Scanner sc = new Scanner(System.in);
			
//				if(list.contains("Red"));
//			System.out.println(list);
//					}
//			
//			 {
			
			

			for (Car car : list) {
				if(car.getSteeringWheel().isHaveButtons()==true){
					car.getWheel().setDiameter(car.getWheel().getDiameter()*2);
			System.out.println(car);
				}
			}
			
			System.out.println(); 
			
			
		
	}

}
