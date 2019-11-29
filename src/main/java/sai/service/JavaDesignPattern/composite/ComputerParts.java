package sai.service.JavaDesignPattern.composite;

import java.util.ArrayList;
import java.util.List;

interface Component {
	void showPrice();
}

class Leaf implements Component {

	int price;
	String name;

	public Leaf(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

	public void showPrice() {
		System.out.println(name + " : " + price);
	}

}

class Composite implements Component {

	String name;

	List<Component> componentsList = new ArrayList<>();

	public Composite(String name) {
		super();
		this.name = name;
	}

	public void showPrice() {

		System.out.println(name);

		for (Component com : componentsList) {
			com.showPrice();
		}
	}

	public void addComponent(Component com) {
		componentsList.add(com);
	}

}