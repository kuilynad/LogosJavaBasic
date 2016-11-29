package core.less4h;

public class Main {

	public static void main(String[] args) {

		Pet cow = new Cow();
		cow.voice();
		Pet cat = new Cat();
		cat.voice();
		Pet dog = new Dog();
		dog.voice();

		System.out.println();
		
		WorkerMonth mWorker = new WorkerMonth(500);
		System.out.println("Worker Month earnel " + mWorker.getSalary(500) + " thousand dollars.");
		WorkerHour hWorker = new WorkerHour(5);
		System.out.println("Worker Hour earned " + hWorker.getSalary(120) + " thousand dollars.");
	}

}
