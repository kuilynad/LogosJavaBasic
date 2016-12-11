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
		return "SteeringWheel [size=" + size + ", color=" + color + ", buttons=" + buttons + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (buttons ? 1231 : 1237);
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + size;
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
		SteeringWheel other = (SteeringWheel) obj;
		if (buttons != other.buttons)
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (size != other.size)
			return false;
		return true;
	}
	
	
}
