package core.less5h;

public class SteeringWheel {

	private int size;

	private String color;
	
	private boolean buttons;

	public SteeringWheel(int size, String color, boolean buttons) {
		super();
		this.size = size;
		this.color = color;
		this.buttons = buttons;
	}

	public boolean isButtons() {
		return buttons;
	}

	public void setButtons(boolean buttons) {
		this.buttons = buttons;
	}

	public void changeColor(String color){
		this.color = color;
	}
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "SteeringWheel [size=" + size + ", color=" + color + "]";
	}
	
	
}
