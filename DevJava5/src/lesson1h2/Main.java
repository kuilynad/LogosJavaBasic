package lesson1h2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
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
