package entities;

public class Product17 {

	private String name;
	private double price;
	private int quantity;

	public Product17(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	private double total() {
		return this.price * this.quantity;
	}

	@Override
	public String toString() {
		return this.name + "," + String.format("%.2f", total());
	}

}
