package core.less5h;

public class Car {

	private String brand;
	
	private Body body;
	
	private Wheel wheel;
	
	private SteeringWheel steeringWheel;

	public Car(String brand, Body body, Wheel wheel, SteeringWheel steeringWheel) {
		super();
		this.brand = brand;
		this.body = body;
		this.wheel = wheel;
		this.steeringWheel = steeringWheel;
	}
	
	
	public Car(String brand, String color, String material, int count, double diameter, String season, int size, String color1, boolean buttons) {
		super();
		this.brand = brand;
		this.body = new Body(color1, material);
		this.wheel = new Wheel(count, diameter, season);
		this.steeringWheel = new SteeringWheel(size, color1, buttons);
	}


	public void changeDiameter() {
		wheel.changeDiameter();
	}


	public void changeColor(String color) {
		steeringWheel.changeColor(color);
	}


	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public SteeringWheel getSteeringWheel() {
		return steeringWheel;
	}

	public void setSteeringWheel(SteeringWheel steeringWheel) {
		this.steeringWheel = steeringWheel;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", body=" + body + ", wheel=" + wheel + ", steeringWheel=" + steeringWheel + "]";
	}
	
	
}
