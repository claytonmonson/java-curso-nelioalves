package entities;

public class OrderItem {

	private Integer quantity;
	private Double price;
	private Product product;

	public OrderItem() {
	}

	public OrderItem(Integer quantity, Double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}
	
	public Double subTotal(){
		return this.price * this.quantity;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(product.getName() + ", ");
		sb.append("$" + String.format("%.2f", this.price) + ", ");
		sb.append("Quantity: " + this.quantity + ", ");
		sb.append("Subtotal: $" + String.format("%.2f", subTotal()));
		
		return sb.toString();
	}

}
