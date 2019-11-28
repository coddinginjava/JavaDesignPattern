package sai.service.JavaDesignPattern.Bridge;

public class BridgePatternMain {

	public static void main(String[] args) {

		Color green = new Green();

		Color blue = new Blue();

		Color red = new Red();

		Car lambo = new Lomborgini(green);

		lambo.applyColor();

		Car ferrari = new Ferrari(red);

		ferrari.applyColor();

		Car lambo1 = new Lomborgini(blue);

		lambo1.applyColor();

	}

}
