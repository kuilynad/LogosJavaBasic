package core.less5h;

public class Main {

	public static void main(String[] args) {
		
//		Body body = new Body("Red", "Steel");
//		SteeringWheel steeringWheel = new SteeringWheel(10, "Black");
//		Wheel wheel = new Wheel(4, 17);
//		Car car = new Car("Jeep", body, wheel, steeringWheel);
//		System.out.println(car);
		Car car = new Car("Koenisegg", new Body("purple", "carbon"), new Wheel(4, 20), new SteeringWheel(5, "black", true));
		System.out.println(car);
		car.changeColor("red");
		System.out.println(car);
		car.getBody().setMaterial("Steel");
		System.out.println(car);
	}

}
