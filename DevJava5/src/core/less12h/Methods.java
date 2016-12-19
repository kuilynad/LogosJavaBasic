package core.less12h;

import java.util.Scanner;

public class Methods {

	private static final Scanner sc = new Scanner(System.in);
	// private static final int a = sc.nextInt();
	// private static final int b = sc.nextInt();

	public static void main(String[] args) {

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

	static void addition() {
		System.out.println("Input A: ");
		int a = sc.nextInt();
		System.out.println("Input B: ");
		int b = sc.nextInt();
		if (a < 0 && b < 0) {
			try {

			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
			try {

			} catch (ArithmeticException e) {
				e.printStackTrace();
			}
		}

		System.out.println(a + b);
	}

	static void subtraction() {
		System.out.println("Input A: ");
		int a = sc.nextInt();
		System.out.println("Input B: ");
		int b = sc.nextInt();
		System.out.println(a - b);
	}

	static void multiplication() {
		System.out.println("Input A: ");
		int a = sc.nextInt();
		System.out.println("Input B: ");
		int b = sc.nextInt();
		System.out.println(a * b);
	}

	static void division() {
		System.out.println("Input A: ");
		int a = sc.nextInt();
		System.out.println("Input B: ");
		int b = sc.nextInt();
		System.out.println(a / b);
	}
}
