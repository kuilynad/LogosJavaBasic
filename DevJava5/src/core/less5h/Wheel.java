package core.less5h;

public class Wheel {

	private int count;
	
	private double diameter;
	
	private String season;

	public Wheel(int count, double diameter, String season) {
		super();
		this.count = count;
		this.diameter = diameter;
		this.season = season;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
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
		return "Wheel [count=" + count + ", diameter=" + diameter + ", season=" + season + "]";
	}
	
	
}
