package lesson4h1;

public class Main {

	public static void main(String[] args) {

		// task1();
		// task2();
		// task3();
		// task4();
		// task5();
		// task6();
		// task7();
		// task8();
		// task9();
		task10();
	}

	public static void task1() {
		int[] array = new int[10];
		for (int i = 0, n = 2; i < array.length; n = n + 2, i++) {
			array[i] = n;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static void task2() {
		int[] array = new int[50];
		for (int i = 0, n = 1; i < array.length; n += 2, i++) {
			array[i] = n;
			System.out.print(array[i] + " ");
		}
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
	}

	public static void task3() {
		int[] array = new int[15];
		int j = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10);
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				j++;
			}
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println(j);
	}

	public static void task4() {
		int[] array = new int[8];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10 + 1);
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				array[i] = 0;
			}
			System.out.print(array[i] + " ");
		}
	}

	public static void task6() {
		int[] array = new int[4];
		int flag;
		flag = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 89 + 10);
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("NOT strictly increasing sequence");
		} else {
			System.out.println("Strictly increasing sequence");
		}
	}

	public static void task7() {
		int[] array = new int[20];
		for (int i = 0, n1 = 1, n2 = 1; i < array.length; i++) {
			if (i % 2 == 0) {
				n1 = n1 + n2;
				array[i] = n1;
			} else {
				n2 = n1 + n2;
				array[i] = n2;
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void task8() {
		int[] array = new int[12];
		int max = 0;
		int j = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 31 - 15);
			System.out.print(array[i] + " ");
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= max) {
				max = array[i];
				j = i;
			}
		}
		System.out.println("Max element of array is: " + array[j]);
		System.out.println("Index of last element is: " + j);
	}

	public static void task9() {
		int[] array1 = new int[10];
		int[] array2 = new int[10];
		double[] array3 = new double[10];
		int j = 0;
		for (int i = 0; i < array1.length; i++) {
			array1[i] = (int) (Math.random() * 9 + 1);
			array2[i] = (int) (Math.random() * 9 + 1);
			array3[i] = (double) array1[i] / array2[i];
			System.out.print(array1[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < array3.length; i++) {
			System.out.print(array3[i] + " ");
			if (array3[i] % 1 == 0) {
				j++;
			}
		}
		System.out.println();
		System.out.println("Count full elements in array3 = " + j);
	}

	public static void task10() {
		int[] array = new int[11];
		int a = 0, b = 0, c = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 4 - 2);
			System.out.print(array[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			if (array[i] == -1) {
				a++;
			} else if (array[i] == 0) {
				b++;
			} else {
				c++;
			}
		}
		if (a > b && a > c) {
			System.out.println("Item -1 found " + a + " times.");
		} else if (b > a && b > c) {
			System.out.println("Item 0 found " + b + " times.");
		} else if (c > a && c > b) {
			System.out.println("Item 1 found " + c + " times.");
		}
	}
}
