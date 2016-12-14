package core.less10h;

import java.util.Scanner;

public class Main {

	private static final Scanner sc = new Scanner(System.in);
	private static final Functional f = new Functional();

	public static void main(String[] args) {

		while (true) {
			System.out.println("Menu");
			System.out.println("Press 1 (Add item)");
			System.out.println("Press 2 (Delete item)");
			System.out.println("Press 3 (Change item)");
			System.out.println("Press 4 (Sort items by: )");
			System.out.println("Press 0 (Exit)");
			System.out.println("Please type something");
			switch (sc.next()) {
			case "1":
				f.addItem();
				break;
			case "2":
				System.out.println("Enter name of item: ");
				String name = sc.next();			
					f.deleteItem(name);
				break;
			case "3":
				System.out.println("Enter name item to replace: ");
				String name1 = sc.next();
				f.replaceItem(name1);
				break;
			case "4":
				System.out.println("1) Sort items by Name");
				System.out.println("2) Sort items by Weigh");
				System.out.println("3) Sort items by Volume");
				System.out.println("4) Sort items by Price");
				System.out.println("Press 0 to Exit");
				switch (sc.next()) {
				case "1":
					f.sortByName().forEach(System.out::println);
					break;
				case "2":
					f.sortByWeigh().forEach(System.out::println);
					break;
				case "3":
					f.sortByVolume().forEach(System.out::println);
					break;
				case "4":
					f.sortByPrice().forEach(System.out::println);
					break;
				case "0":

					return;

				default:
					break;
				}
				break;
			case "0":
				return;

			default:
				sc.close();
				break;
			}
		}

	}

}
