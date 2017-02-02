package core.less16h;

import java.util.Scanner;

public class RunnableThread implements Runnable {

	private static final Scanner sc = new Scanner(System.in);

	@Override
	public void run() {
		fibonacci();

	}

	public void fibonacci() {
		synchronized (RunnableThread.class) {
			System.out.println("Enter count of fibonacci nums(reward): ");
			int n = sc.nextInt();
			int[] fibonacci = new int[n];
			int a = 1;
			int b = 1;
			int i = 2;
			fibonacci[0] = 0;
			fibonacci[1] = 1;
			while (i < n) {
				fibonacci[i] = a + b;
				a = b;
				b = fibonacci[i];
				i++;
			}
			for (int j = fibonacci.length - 1; j >= 0; j--) {
				System.out.println(fibonacci[j] + " ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}