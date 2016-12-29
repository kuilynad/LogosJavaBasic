package core.less15h;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class MyMap<K, V> {

	private static final Scanner sc = new Scanner(System.in);
	
	Set<MyEntry<K, V>> set = new HashSet<>();
	
	public void addSome(K key, V value) {
		System.out.println("Add something");
		set.add(new MyEntry<K, V>(key, value));
		System.out.println(set);
	}
	
	public void deleteSomeKey(K key) {
		System.out.println("Delete something by key");
		System.out.println("Enter key: ");
		Iterator<MyEntry<K, V>> iter = set.iterator();
		while (iter.hasNext()) {
			MyEntry<K, V> next = iter.next();
			if(next.getKey().equals(key)){
				iter.remove();
			}
		}
		System.out.println(set);
	}
	
	public void deleteSomeValue(String string){
		System.out.println("Delete something by value");
		System.out.println("Enter value: ");
		Iterator<MyEntry<K, V>> iter = set.iterator();
		while(iter.hasNext()){
			MyEntry<K, V> next = iter.next();
			if(next.getValue().equals(sc.next())){
				next.setValue(null);
			}
		}
		System.out.println(set);
	}
	
	public void getKeys(){
		System.out.println("Get keys");
		Set<K> keys = new HashSet<>();
		for (MyEntry<K,V> myEntry : set) {
			keys.add(myEntry.getKey());
		}
		System.out.println(keys);
	}
	
	public void getValues(){
		System.out.println("Get Values");
		List<V> values = new ArrayList<>();
		for (MyEntry<K, V> myEntry : set) {
			values.add(myEntry.getValue());
		}
		System.out.println(values);
	}
	
	public void printSomeKeyValue(){
		set.forEach(System.out::println);
	}
}