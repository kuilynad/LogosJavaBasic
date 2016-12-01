package core.less5h;

public class Wheel {

	private int count;
	
	private double diameter;

	public Wheel(int count, double diameter) {
		super();
		this.count = count;
		this.diameter = diameter;
	}

	public void changeDiameter(){
		diameter +=1;
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	@Override
	public String toString() {
		return "Wheel [count=" + count + ", diameter=" + diameter + "]";
	}
	
	
}
