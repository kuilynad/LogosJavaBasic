package core.less12h;

import java.util.Scanner;

public class Methods {

	private static final Scanner sc = new Scanner(System.in);
	private static int b;
	private static int a;

	public static void main(String[] args) throws Throwable {
		System.out.println("Input A: ");
		int a = sc.nextInt();
		System.out.println("Input B: ");
		int b = sc.nextInt();
		
		if (a < 0 && b < 0) {
			throw new IllegalArgumentException("IArE Wrong input");
		} else if (a==0 && b!=0) {
			throw new ArithmeticException("AE Wrong input");
		} else if (a!=0 && b==0) {
			throw new ArithmeticException("AE Wrong input");
		} else if (a==0 && b==0) {
			throw new IllegalAccessException("IAcE Wrong input");
		} else if (a > 0 && b > 0) {
			throw new MyException();
		}
		else {
			
		while (true) {
			System.out.println("1 Addition");
			System.out.println("2 Subtraction");
			System.out.println("3 Multiplication");
			System.out.println("4 Division");
			switch (sc.next()) {
			case "1":
				addition();
				break;
			case "2":
				subtraction();
				break;
			case "3":
				multiplication();
				break;
			case "4":
				division();
				break;
			default:
				sc.close();
				break;
			}
		}
	}
	}

	static void addition() {
		System.out.println(a+b); 
	}

	static int subtraction() {
		return a-b;
	}

	static int multiplication() {
		return a*b;
	}

	static int division() {
		return a/b;
	}
}
