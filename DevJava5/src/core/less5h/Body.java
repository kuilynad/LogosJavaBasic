package core.less5h;

public class Body {

	private String color;
	
	private String material;

	public Body(String color, String material) {
		super();
		this.color = color;
		this.material = material;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Body [color=" + color + ", material=" + material + "]";
	}
	
	
}
