package core.less11h;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		Zooclub z = new Zooclub();
		while (true) {
			System.out.println("1 Add member");
			System.out.println("2 Add Animal to Member");
			System.out.println("3 Remove Animal from Member");
			System.out.println("4 Remove member");
			System.out.println("5 Remove TYPE of Animal from all Member in club");
			System.out.println("6 Print Zooclub");
			System.out.println("7 Exit");
			switch (sc.next()) {
			case "1":
				z.addMember(createMember());
				System.out.println("Member is created");
				break;
//			case "2":
//				z.addAnimalToMember(createMember(), createAnimal());
//				break;
//			case "3":
//				z.removeAnimalfromMember(createMember(), createAnimal());
//				break;
			case "4":
				z.removeMember(createMember());
				break;
			case "5":
				System.out.println("Enter type");
				String type = sc.next();
				z.deleteTypeAnimal(type);
				break;
			case "6":
				z.toString();
				break;
			default:
				sc.close();
				break;
			}
		}

	}

	public static Human createMember() {
		System.out.println("Enter name:");
		String name = sc.next();
		System.out.println("enter age");
		int age = sc.nextInt();
		Human h = new Human(name, age);
		return h;
	}

//	public static Animal createAnimal() {
//		System.out.println("Enter name:");
//		String animalName = sc.next();
//		System.out.println("enter age");
//		String type = sc.nextLine();
//		
//		AnimalType[] type1 = AnimalType.values();
//		
//		for (AnimalType typeOfAnimal2 : type1) {
//			if(typeOfAnimal2.name().equals(AnimalType)){
//				type = typeOfAnimal;
//			}
//			
//		Animal a = new Animal(animalName, AnimalType);
//		return a;
//	}

}