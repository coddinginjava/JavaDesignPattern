package sai.service.JavaDesignPattern.Bridge;

public abstract class Car {

	protected Color color;

	public Car(Color color) {
		this.color = color;
	}

	public void applyColor() {
		color.applyColor();
	}
}
