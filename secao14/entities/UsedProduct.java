package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class UsedProduct extends Product153 {

	private Date manufactureDate;

	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String priceTag() {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return this.name + " (used) $ " + String.format("%.2f", this.price) + " (Manufacture date: "
				+ sdf.format(manufactureDate) + ")";
	}

}
