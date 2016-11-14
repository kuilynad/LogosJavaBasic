package lesson3h1;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		
		hello();
		
		Scanner sc = new Scanner(System.in);
		//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    
	    	System.out.println("Inpun first num");
	    	//double a = Double.parseDouble(reader.readLine());
		double a = sc.nextDouble();
		
		System.out.println("Operator");
		String op = sc.next();
		//String op = reader.readLine();
		
		System.out.println("Inpun second num");
		double b = sc.nextDouble();
		//double b = Double.parseDouble(reader.readline());
		
		System.out.print("Calculate number is: ");

		if (op.equals("*")) {
			System.out.print(calculate(a, b, '*') + " Dude, ");
		} else if (op.equals("/")) {
			System.out.print(calculate(a, b, '/') + " Dude, ");
		} else if (op.equals("+")) {
			System.out.print(calculate(a, b, '+') + " Dude, ");
		} else if (op.equals("-")) {
			System.out.print(calculate(a, b, '-') + " Dude, ");
		} else {
			System.out.print("Wrong input!");
		}
		
		probably();
		
		triangle1();
		
		square1();
		
		triangle2();

	}

	static double add(double a, double b) {
		return a + b;
	}

	static double sub(double a, double b) {
		return a - b;
	}

	static double mult(double a, double b) {
		return a * b;
	}

	static double div(double a, double b) {
		return a / b;
	}

	// calc

	static double calculate(double a, double b, char operator) {
		switch (operator) {
		case '+':
			return add(a, b);
		case '-':
			return sub(a, b);
		case '*':
			return mult(a, b);
		case '/':
			return div(a, b);
		default:
			calculate(a, b, operator);
			return 0;
		}
	}

	//joke
	
	public static void probably() {
		int i = (int)(Math.random()*101);
		System.out.println("it's probably true on "+i+"%.");
	}
	
	public static void triangle1() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}
	
	public static void square1() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}

	public static void triangle2() {
		for (int i = 0; i < 10; i++) {
			for (int j = 10; j > i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public static void hello() {
		System.out.println("Hello my friends! This is my calculator.");
	}
	
	public static void emptyClass1() {
		
	}

	public static void emptyClass2() {
		
	}

	public static void emptyClass3() {
		
	}

	public static void emptyClass4() {
		
	}

	public static void emptyClass5() {
		
	}

	public static void emptyClass6() {
		
	}

	public static void emptyClass7() {
		
	}

	public static void emptyClass8() {
		
	}

	public static void emptyClass9() {
		
	}
}
