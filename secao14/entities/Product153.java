package entities;

public class Product153 {

	protected String name;
	protected Double price;

	public Product153() {
	}

	public Product153(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String priceTag() {
		return this.name + " $ " + String.format("%.2f", price);
	}

}
