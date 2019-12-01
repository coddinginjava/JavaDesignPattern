package sai.service.JavaDesignPattern.Decorator;

public class MeatDecorator extends SandwichDecorator {

	public MeatDecorator(Sandwich sandwich) {
		super(sandwich);
	}

	@Override
	public String make() {
		return sandwich.make() + addMeat();
	}

	public String addMeat() {
		return " chicken :";
	}
}
