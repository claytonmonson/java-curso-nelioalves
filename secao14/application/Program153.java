package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product153;
import entities.UsedProduct;

public class Program153 {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Scanner sc = new Scanner(System.in);
		List<Product153> products = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			String typeProduct = sc.next();
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Price: ");
			Double price = sc.nextDouble();

			if (typeProduct.charAt(0) == 'i') {
				System.out.print("Customs fee: ");
				Double customsFee = sc.nextDouble();
				products.add(new ImportedProduct(name, price, customsFee));
			} else if (typeProduct.charAt(0) == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				products.add(new UsedProduct(name, price, manufactureDate));
			} else {
				products.add(new Product153(name, price));
			}

		}
		
		System.out.println();
		
		System.out.println("PRICE TAGS:");
		products.forEach(x -> System.out.println(x.priceTag()));

		sc.close();

	}
}
