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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((body == null) ? 0 : body.hashCode());
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((steeringWheel == null) ? 0 : steeringWheel.hashCode());
		result = prime * result + ((wheel == null) ? 0 : wheel.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (body == null) {
			if (other.body != null)
				return false;
		} else if (!body.equals(other.body))
			return false;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (steeringWheel == null) {
			if (other.steeringWheel != null)
				return false;
		} else if (!steeringWheel.equals(other.steeringWheel))
			return false;
		if (wheel == null) {
			if (other.wheel != null)
				return false;
		} else if (!wheel.equals(other.wheel))
			return false;
		return true;
	}
	
	
}
