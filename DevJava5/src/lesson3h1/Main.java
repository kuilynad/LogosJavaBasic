package lesson3h1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Inpun nymber one");
		double a = sc.nextDouble();
		System.out.println("Inpun nymber two");
		double b = sc.nextDouble();
		System.out.print("Calculate number is: ");
		String op = sc.nextLine();
		System.out.print(calculate(a, b, '*'));

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

//calculator
	
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
}
