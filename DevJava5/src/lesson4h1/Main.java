package lesson4h1;

public class Main {

	public static void main(String[] args) {
		
		task1();

	}

	static void task1() {
		int[] mas = new int[10];
		for(int i=0,n=2; i<mas.length; n=n+2,i++){
			mas[i] = n;
		}
		for(int i=0; i<mas.length; i++) {
			System.out.print(mas[i]+" ");
		}
		System.out.println();
		for(int i=0; i<mas.length; i++) {
			System.out.println(mas[i]);
		}
	}
}
