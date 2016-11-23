package core.less2;

public class Main {

	public static void main(String[] args) {
		Person p = new Person(18, "Ivan");
//		p.age = 18;
//		p.name = "Ivan";
		System.out.println(p.age);
		System.out.println(p.name);
		Person p1 = new Person(25, "Vasyl");
//		p1.age = 25;
//		p1.name = "Vasyl";
		System.out.println(p1.age);
		System.out.println(p1.name);
		p.run();
		p1.run();
	}
	
	static int random(int min, int max) {
		return (int) Math.round(Math.random() * (max - min) + min);
	}
	
	static int random(int max) {
		return random(0, max);
	}
}