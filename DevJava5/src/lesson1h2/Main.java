package lesson1h2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("¬вед≥ть перше число");
		int a1 = sc.nextInt();
		System.out.println("¬вед≥ть друге число");
		int a2 = sc.nextInt();
		
		if (Math.abs(10 - a1) < Math.abs(10 - a2)) {
			System.out.println("ѕерше число ближче до 10");
		}
		else if (Math.abs(10 - a1) > Math.abs(10 - a2)) {
			System.out.println("ƒруге число ближче до 10");
		}
		else {
			System.out.println("¬веден≥ числа однаков≥");
		}
	}

}
