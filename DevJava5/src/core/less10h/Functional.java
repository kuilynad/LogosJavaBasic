package core.less10h;

import static java.util.Comparator.comparingInt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.Stream;

public class Functional {

	private static final Scanner sc = new Scanner(System.in);
	ArrayList<Commodity> list = new ArrayList<>();

	public void addItem() {
		System.out.println("Add Item");
		System.out.println("Item name: ");
		String name = sc.next();
		System.out.println("Item weigh: ");
		int weigh = sc.nextInt();
		System.out.println("Item volume: ");
		int volume = sc.nextInt();
		System.out.println("Item price: ");
		int price = sc.nextInt();
		list.add(new Commodity(name, weigh, volume, price));
		list.forEach(System.out::println);
	}

	public void deleteItem(String name) {
		Iterator<Commodity> iter = list.iterator();
		while (iter.hasNext()) {
			if (iter.next().getName().toLowerCase().equals(name.toLowerCase())) {
				iter.remove();
			}
		}
		for (Commodity comodity : list) {
			System.out.println("Item " + comodity);
		}
	}

	public void replaceItem(String name1) {
		System.out.println("--------------Replace Item--------------");
		System.out.println("Item name: ");
		String name = sc.next();
		System.out.println("Item weigh: ");
		int weigh = sc.nextInt();
		System.out.println("Item volume: ");
		int volume = sc.nextInt();
		System.out.println("Item price: ");
		int price = sc.nextInt();
		Commodity c = new Commodity(name, weigh, volume, price);
		int j = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().toLowerCase().equals(name1.toLowerCase())) {
				j = i;
			}
		}
		list.set(j, c);
		for (Commodity commodity : list) {
			System.out.println(commodity);
		}
		// list.forEach(System.out::println);
	}

	public Stream<Commodity> sortByName() {
		return list.stream().sorted();
	}

	public Stream<Commodity> sortByWeigh() {
		return list.stream().sorted(comparingInt(Commodity::getWeigh));
	}

	public Stream<Commodity> sortByVolume() {
		return list.stream().sorted(comparingInt(Commodity::getVolume));
	}

	public Stream<Commodity> sortByPrice() {
		return list.stream().sorted(comparingInt(Commodity::getPrice));
	}
}
