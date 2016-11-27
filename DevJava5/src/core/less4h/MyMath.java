package core.less4h;

public class MyMath {

	public static void main(String[] args) {
		final int a = 3;
		final int b = 4;
		
		adding(a, b);
		division(a, b);
		multiplication(a, b);
	}
	static void adding(int a, int b){
			int d = a+b;
		System.out.println(d);
	}
	static void division(int a, int c){
		int d = c/a;
	System.out.println(d);
	}
	static void multiplication(int a, int b){
		int d = a*b;
	System.out.println(d);
	}
}
