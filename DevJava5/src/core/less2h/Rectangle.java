package core.less2h;

public class Rectangle {
	
	int length = 3;
	int width = 4;
	
	public void rectangle(){
		this.length = length;
		this.width = width;
	}
	
	public int square(){
		return length * width;
	}
	
	public int perimeter(){
		return (length + width) * 2;
	}
	
}
