package core.less9h;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

import core.less5h.Body;
import core.less5h.Car;
import core.less5h.SteeringWheel;
import core.less5h.Wheel;

public class Main {

	private static final LinkedHashSet<Car> set = new LinkedHashSet<>();
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		set.add(new Car("Ferarri", new Body("red", "alum"), new Wheel(4, 21, "summer"),
				new SteeringWheel(5, "black", true)));
		set.add(new Car("Mclaren", new Body("orange", "alum"), new Wheel(4, 20, "summer"),
				new SteeringWheel(4, "gray", true)));
		set.add(new Car("BMW", new Body("yellow", "steel"), new Wheel(4, 18, "summer"),
				new SteeringWheel(5, "black", false)));
		set.add(new Car("Koenisegg", new Body("white", "carbon"), new Wheel(4, 22, "summer"),
				new SteeringWheel(3, "white", true)));
		set.add(new Car("Pagani", new Body("grey", "carbon"), new Wheel(4, 21, "summer"),
				new SteeringWheel(6, "gray", true)));
		set.add(new Car("Porshe", new Body("silver", "alum"), new Wheel(4, 19, "summer"),
				new SteeringWheel(3, "black", false)));
		set.add(new Car("Lamborgini", new Body("purple", "alum"), new Wheel(4, 20, "summer"),
				new SteeringWheel(4, "white", true)));
		set.add(new Car("Mersedes", new Body("black", "alum"), new Wheel(4, 18, "summer"),
				new SteeringWheel(3, "brown", false)));
		set.add(new Car("Nissan", new Body("blue", "steel"), new Wheel(4, 17, "winter"),
				new SteeringWheel(2, "black", true)));
		set.add(new Car("Mitsubishi", new Body("green", "steel"), new Wheel(4, 16, "winter"),
				new SteeringWheel(5, "black", false)));

		while (true) {
			System.out.println("Enter 1 to change tires type, by diam and body color");
			System.out.println("Enter 2 to delete by wheel diameter");
			System.out.println("Enter 3 to find car by tires type and diameter");
			switch (sc.next()) {
			case "1":
				task1();
				break;
			case "2":
				task2();
				break;
			case "3":
				task3();
				break;

			default:
				sc.close();
				return;
			}
		}
	}

	static void task1() {
		System.out.println("Enter body color");
		String col = sc.next();
		System.out.println("Enter min wheel diameter: ");
		int min = sc.nextInt();
		System.out.println("Enter max wheel diameter: ");
		int max = sc.nextInt();
		Iterator<Car> iter = set.iterator();
		if (!set.isEmpty()) {
			while (iter.hasNext()) {
				Car car = iter.next();
				if ((car.getBody().getColor().toLowerCase().equals(col.toLowerCase()))
						&& (car.getWheel().getDiameter() > min) && (car.getWheel().getDiameter() < max)) {
					car.getWheel().setSeason("winter");
				}
			}
			set.forEach(System.out::println);
		}

	}

	static void task2() {
		System.out.println("Enter min wheel diameter: ");
		int min = sc.nextInt();
		System.out.println("Enter max wheel diameter: ");
		int max = sc.nextInt();
		Iterator<Car> iter = set.iterator();
		if (!set.isEmpty()) {
			while (iter.hasNext()) {
				Car car = iter.next();
				if (car.getWheel().getDiameter() > min && car.getWheel().getDiameter() < max) {
					iter.remove();
				}
			}
			set.forEach(System.out::println);
		}
	}

	static void task3() {
		System.out.println("Enter tire type/season: ");
		String tire = sc.next();
		System.out.println("Enter min wheel diameter: ");
		int min = sc.nextInt();
		System.out.println("Enter max wheel diameter: ");
		int max = sc.nextInt();
		Iterator<Car> iter = set.iterator();
		if (!set.isEmpty()) {
			while (iter.hasNext()) {
				Car car = iter.next();
				if ((car.getWheel().getDiameter() > min && car.getWheel().getDiameter() < max)
						&& (car.getWheel().getSeason().toLowerCase().equals(tire.toLowerCase()))) {
					System.out.println(car);
				}
			}
		}
	}
}
