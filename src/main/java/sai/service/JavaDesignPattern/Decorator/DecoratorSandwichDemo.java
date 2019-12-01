package sai.service.JavaDesignPattern.Decorator;

public class DecoratorSandwichDemo {

	public static void main(String[] args) {

		Sandwich sandwich = new SimpleSandwich();

		MeatDecorator meatDecorator = new MeatDecorator(sandwich);

		DressingDecorator decorator = new DressingDecorator(meatDecorator);

		System.out.println(decorator.make());
		
		
		
//		-----or -----
		
		
		DressingDecorator singleLineSandwich = new DressingDecorator(new MeatDecorator (new SimpleSandwich()));
		
		Sandwich singleLineSandwich1 = new DressingDecorator(new MeatDecorator (new SimpleSandwich()));
		
		System.out.println(singleLineSandwich.make()); //same
		
		System.out.println(singleLineSandwich1.make());//same result only
		
		
	}

}
