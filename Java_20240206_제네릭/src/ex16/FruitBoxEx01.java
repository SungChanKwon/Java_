package ex16;

import java.util.ArrayList;

class Fruit {
	@Override
	public String toString() {
		return "Fruit";
	}
}

class Apple extends Fruit {
	public String toString() {
		return "Apple";
	}
}

class Grape extends Fruit {
	public String toString() {
		return "Grape";
	}
}

class Toy {
	public String toString() {
		return "Toy";
	}
}

class Box<T> {
	ArrayList<T> list = new ArrayList<T>();

	void add(T item) {
		list.add(item);
	}

	T get(int i) {
		return list.get(i);
	}

	int size() {
		return list.size();
	}

	public String toString() {
		return list.toString();
	}
}

public class FruitBoxEx01 {

	public static void main(String[] args) {

		Box<Fruit> fruitBox = new Box<Fruit>();
		Box<Apple> appleBox = new Box<Apple>();
		Box<Toy> toyBox = new Box<Toy>();
//		Box<Grape> grapeBox = new Box<Apple>();  ==> 에러. 타입불일치

		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());

		appleBox.add(new Apple());
		appleBox.add(new Apple());
//		appleBox.add(new Toy()); ==> 에러.  Box<Apple>에는 Apple만 담을 수 있음 

		toyBox.add(new Toy());
//		toyBox.add(new Apple()); ==> 에러.   Box<Toy>에는 Apple만 담을 수 있음

		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(toyBox);

	}
}
