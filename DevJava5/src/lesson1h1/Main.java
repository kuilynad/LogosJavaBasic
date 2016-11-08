package lesson1h1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int a = sc.nextInt();
		if (a % 2 == 0) {
			System.out.println("Число парне");
		}
		else {
			System.out.println("Число НЕ парне");
		}
	}

}
