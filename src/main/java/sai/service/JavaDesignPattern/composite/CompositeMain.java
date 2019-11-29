package sai.service.JavaDesignPattern.composite;

public class CompositeMain {

	public static void main(String[] args) {

		Component mouse = new Leaf(500, "mouse");
		Component hdd = new Leaf(5000, "hdd");
		Component keyboard = new Leaf(1000, "keyboard");
		Component monitor = new Leaf(1000, "monitor");
		Component ram = new Leaf(4000, "ram");
		Component cpu = new Leaf(8000, "cpu");

		
		Composite ph = new Composite("peri");
		Composite cabniet = new Composite("cabniet");
		Composite mb = new Composite("mb");
		Composite computer = new Composite("computer");
		
		mb.addComponent(ram);
		mb.addComponent(cpu);
		
		cabniet.addComponent(hdd);
		cabniet.addComponent(mb);

		ph.addComponent(mouse);
		ph.addComponent(keyboard);
		
		computer.addComponent(cabniet);
		computer.addComponent(ph);
		
		
		System.out.println("peripheral deveice");
		ph.showPrice();
		
		System.out.println();
		System.out.println();
		
		System.out.println("computer deveice");
		computer.showPrice();
		
		System.out.println();
		System.out.println();
		
		
		ram.showPrice();
		
		
		
		
		
		
		
		
		
	}

}
