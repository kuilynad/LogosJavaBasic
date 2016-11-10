package lesson2h1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//		task1();
		
//		task2();
		
//		task3();
		
//		task4();
		
//		task5();
		
//		task6();
		
//		task7();
		
		task8();
	}
	
	static int task1() {
		for (int i = 1000; i <= 10000; i += 3) {
			System.out.println(i);
		}
		return 0;
	}
	
	static int task2() {
		for (int i = 1, j = 1; i <= 55; j += 2, i++) {
			System.out.println(j);
		}
		return 0;
	}
	
	static int task3() {
		for (int i = 90; i > 0; i -= 5) {
			System.out.println(i);
		}
		return 0;
	}
	
	static long task4() {
		for (long i = 0, j = 2; i < 20; j *= 2, i++) {
			System.out.println(j);
		}
		return 0;
	}
	
	static int task5() {
		for (int a = 2; a < 10000; a = a * 2-1) {
			System.out.println(a);
		}
		return 0;
	}
	
	static int task6() {
		for (int a = -166; a < 100; a = a*2 + 200) {
			if (a/100 == 0) {
				System.out.println(a);
			}
		}
		return 0;
	}
	
	static int task7() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input num for n!: ");
		int n = scan.nextInt();;
		for (int i = 1, j = 1; i <= n; i++) {
			j = j * i;
			System.out.println(j);
		}
		return 0;
	}
	
	static int task8() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input num: ");
		int n = scan.nextInt();
		for (int i=1; i<=n; i++) {
			if (n%i == 0) {
				System.out.println(i);
			}
		}
		return 0;
	}
}
