package core.less8h;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import core.less5h.Body;
import core.less5h.Car;
import core.less5h.SteeringWheel;
import core.less5h.Wheel;

public class Main {

	private static final List<Car> list = new ArrayList<>();
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		list.add(new Car("Ferarri", new Body("red", "alum"), new Wheel(4, 21, "summer"),
				new SteeringWheel(5, "black", true)));
		list.add(new Car("Mclaren", new Body("orange", "alum"), new Wheel(4, 20, "summer"),
				new SteeringWheel(4, "gray", true)));
		list.add(new Car("BMW", new Body("yellow", "steel"), new Wheel(4, 18, "summer"),
				new SteeringWheel(5, "black", false)));
		list.add(new Car("Koenisegg", new Body("white", "carbon"), new Wheel(4, 22, "summer"),
				new SteeringWheel(3, "white", true)));
		list.add(new Car("Pagani", new Body("grey", "carbon"), new Wheel(4, 21, "summer"),
				new SteeringWheel(6, "gray", true)));
		list.add(new Car("Porshe", new Body("silver", "alum"), new Wheel(4, 19, "summer"),
				new SteeringWheel(3, "black", false)));
		list.add(new Car("Lamborgini", new Body("purple", "alum"), new Wheel(4, 20, "summer"),
				new SteeringWheel(4, "white", true)));
		list.add(new Car("Mersedes", new Body("black", "alum"), new Wheel(4, 18, "summer"),
				new SteeringWheel(3, "brown", false)));
		list.add(new Car("Nissan", new Body("blue", "steel"), new Wheel(4, 17, "summer"),
				new SteeringWheel(2, "black", true)));
		list.add(new Car("Mitsubishi", new Body("green", "steel"), new Wheel(4, 16, "summer"),
				new SteeringWheel(5, "black", false)));

		while (true) {
			System.out.println("Enter 1 to find car by body");
			System.out.println("Enter 2 to delete by color");
			System.out.println("Enter 3 to change tires type");
			System.out.println("Enter 4 to delete by body material and size swheel");
			System.out.println("Enter 5 to remember index");
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
			case "4":
				task4();
				break;
			case "5":
				task5();
				break;
			default:
				sc.close();
				return;
			}
		}
	}

	static void task1() {
		System.out.println("Enter body material(alum, steel, carbon): ");
		String bmat = sc.next();
		for (Car car : list) {
			if (car.getBody().getMaterial().toLowerCase().contains(bmat.toLowerCase())) {
				System.out.println(car);
			}
		}
	}

	static void task2() {
		System.out.println("Enter color to delete: ");
		String col = sc.next();
		Iterator<Car> iter = list.iterator();
		while (iter.hasNext()) {
			Car car = iter.next();
			if (car.getBody().getColor().toLowerCase().contains(col)) {
				iter.remove();
			}
		}
		list.forEach(System.out::println);
	}

	static void task3() {
		System.out.println("Enter min wheel diameter: ");
		int min = sc.nextInt();
		System.out.println("Enter max wheel diameter: ");
		int max = sc.nextInt();
		Iterator<Car> iter = list.iterator();
		while (iter.hasNext()) {
			Car car = iter.next();
			if (car.getWheel().getDiameter() > min && car.getWheel().getDiameter() < max) {
				car.getWheel().setSeason("winter");
			}
		}
		list.forEach(System.out::println);
	}

	static void task4() {
		System.out.println("Enter body material: ");
		String bmat = sc.next();
		System.out.println("Enter min steering wheel size: ");
		int smin = sc.nextInt();
		System.out.println("Enter max steering wheel size: ");
		int smax = sc.nextInt();
		Iterator<Car> iter = list.iterator();
		while (iter.hasNext()) {
			Car car = iter.next();
			if ((car.getBody().getMaterial().toLowerCase().contains(bmat)) && (car.getSteeringWheel().getSize() > smin)
					&& (car.getSteeringWheel().getSize() < smax)) {
				iter.remove();
			}
		}
		list.forEach(System.out::println);
	}

	static void task5() {
		System.out.println("Enter body material");
		String bmat = sc.next();
		Iterator<Car> iter = list.iterator();
		if (!list.isEmpty()) {
			while (true) {
				Car car = iter.next();
				if (car.getBody().getMaterial().equals(bmat)) {
					System.out.println(list.indexOf(car) + 1);
				}
			}
		}
	}
}