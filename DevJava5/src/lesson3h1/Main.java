package lesson3h1;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

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

}
