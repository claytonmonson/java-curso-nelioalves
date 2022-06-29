package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program139 {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String birthDate = sc.nextLine();
		
		Client client = new Client(name, email, sdf.parse(birthDate));

		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String status = sc.nextLine();
		Order order = new Order(OrderStatus.valueOf(status), client);
		
		System.out.println("How many items to this order? ");
		int quantity = sc.nextInt();
		for(int i = 1; i <= quantity; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			String productName = sc.next();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int productQuantity = sc.nextInt();
			Product product = new Product(productName, productPrice);
			order.addItem(new OrderItem( productQuantity, productPrice, product));
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		
		System.out.println(order.toString());
		
		sc.close();
		
	}
}
