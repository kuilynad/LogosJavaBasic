package core.less6;

import java.io.Serializable;

public class Person implements Comparable<Person>, Serializable{

	private static final long serialVersionUID = -4397348609784566997L;

	private String name;
	
	private int age;
	
	private Gender gender;

	public Person(String name, int age, Gender gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender
				+ "]";
	}

	@Override
	public int compareTo(Person o) {
		return name.compareTo(o.name);
	}
}