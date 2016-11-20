package zTest;

public class Main {

	public static void main(String[] args) {

	}
	
	public class Rectangle
	{
	    int h,w;
	    void set(int x,int y)
	    {
	        h=x;
	        w=y;
	    }
	    int AreaOfRect()
	    {
	        int area=w*h;
	        return area;
	    }
	    int PerOfRect()
	    {
	        int per=(2*w)+(2*h);
	        return per;
	    }
	    void disp()
	    {
	        int area=AreaOfRect();
	        System.out.println("area of rectangle"+area);
	        int per=PerOfRect();
	        System.out.println("area of rectangle"+per);
	    }
	}
}
