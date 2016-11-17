package lesson4h1;

public class Main {

	public static void main(String[] args) {

		// task1();
		// task2();
		//task3();
		//task4();
		task5();
		//task6();
		//task7();
		//task8();
		//task9();
		//task10();
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
			array[i] = (int)(Math.random()*10);
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
			array[i] = (int)(Math.random()*10 + 1);
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			if (i%2 == 0) {
				array[i] = 0;
			}
			System.out.print(array[i] + " ");
		}
	}
	
	
	public static void task5() {
		int[] array1 = new int[5];
		int[] array2 = new int[5];
		int sum1 = 0, sum2 = 0;
		double a1 , a2;
		for (int i = 0; i < array1.length; i++) {
			array1[i] = (int)(Math.random()*6);
			array2[i] = (int)(Math.random()*6);			
		}
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i]+" ");
		}
		for (int i = 0; i < array1.length; i++) {
			sum1 += array1[i];
		}
		for (int i = 0; i < array2.length; i++) {
			sum2 += array2[i];
		}
		System.out.println();
		a1 = (double)sum1/5;
		a2 = (double)sum2/5;
		if (a1>a2){
			System.out.println("Arithmetic mean of first array is bigger");
		}
		else if (a1<a2) {
			System.out.println("Arithmetic mean of second array is bigger");
		}
		else {
			System.out.println("Arithmetic mean of both arrays is the same");
		}
	}
	
	
	public static void task6() {
		int[] array = new int[4];
		int flag;
		flag = 0;
		for(int i=0; i<array.length; i++){
			array[i] = (int)(Math.random()*89+10);
		}
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		for(int i=0; i<array.length-1; i++) {
			if(array[i]>array[i+1]) {
				flag = 1;
				break;
			}
		}
		if(flag==1) {
			System.out.println("NOT strictly increasing sequence");
		} else {
			System.out.println("Strictly increasing sequence");
		}
	}
}
