package entities;

public class Rectangle {

	private double width;
	private double heigth;

	public Rectangle( double width, double heigth) {
		this.width = width;
		this.heigth = heigth;
	}
	
	public double area() {
		return this.width * this.heigth;
	}

	public double perimeter() {
		return 2 * (this.width + this.heigth);
	}

	public double diagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(heigth, 2));
	}
	
}
