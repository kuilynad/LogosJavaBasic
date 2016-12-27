package core.less16h;

import java.util.Scanner;

public class MyThread extends Thread {

	private static final Scanner sc = new Scanner(System.in);

	public MyThread() {
		start();
	}

	@Override
	public void run() {
		fibonacci();
	}

	public void fibonacci() {
		synchronized (MyThread.class) {
			System.out.println("Enter count of fibonacci nums(forward): ");
			int n = sc.nextInt();
			int a = 1;
			int b = 1;
			System.out.println(a + " " + b);
			int fib = 2;
			int i = 2;
			while (i < n) {
				fib = a + b;
				a = b;
				b = fib;
				try {
					Thread.sleep(1000);
					System.out.println(" " + fib);
					i++;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
