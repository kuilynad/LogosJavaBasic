package lesson1h1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//task 1		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int a = sc.nextInt();
		if (a % 2 == 0) {
			System.out.println("����� �����");
		}
		else {
			System.out.println("����� �� �����");
		}

//task 2	
		System.out.println("������ ����� �����");
		int a1 = sc.nextInt();
		System.out.println("������ ����� �����");
		int a2 = sc.nextInt();
		
		if (Math.abs(10 - a1) < Math.abs(10 - a2)) {
			System.out.println("����� ����� ������ �� 10");
		}
		else if (Math.abs(10 - a1) > Math.abs(10 - a2)) {
			System.out.println("����� ����� ������ �� 10");
		}
		else {
			System.out.println("������ ����� �������");
		}
	}

}
