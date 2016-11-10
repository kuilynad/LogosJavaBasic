package lesson1h1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//task 1		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int a = sc.nextInt();
		if (a % 2 == 0) {
			System.out.println("Число парне");
		}
		else {
			System.out.println("Число НЕ парне");
		}

//task 2	
		System.out.println("Введіть перше число");
		int a1 = sc.nextInt();
		System.out.println("Введіть друге число");
		int a2 = sc.nextInt();
		
		if (Math.abs(10 - a1) < Math.abs(10 - a2)) {
			System.out.println("Перше число ближче до 10");
		}
		else if (Math.abs(10 - a1) > Math.abs(10 - a2)) {
			System.out.println("Друге число ближче до 10");
		}
		else {
			System.out.println("Введені числа однакові");
		}
	}

}
