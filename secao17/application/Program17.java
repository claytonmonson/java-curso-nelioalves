package application;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product17;

public class Program17 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		List<Product17> products = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		Scanner scLine = null;

		System.out.print("Enter path and file name: ");
		String pathAndFile = sc.nextLine();

		File file = new File(pathAndFile);
		
		try {
			scLine = new Scanner(file);
			while (scLine.hasNextLine()) {

				String[] line = scLine.nextLine().split(",");
				String name = line[0];
				double price = Double.parseDouble(line[1]);
				int quantity = Integer.parseInt(line[2]);
				
				products.add(new Product17(name, price, quantity));

			}

			saveSummary(file.getParent() + "\\out", products);
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());

		} finally {
			if (scLine != null) {
				scLine.close();
			}
		}

		sc.close();

	}
	
	private static void saveSummary(String outPath, List<Product17> products) {

		String fileName = outPath + "\\summary.csv";
		
		File outFile = new File(outPath + "\\", "summary.csv");
		
		try {
			outFile.createNewFile();
			FileWriter fileWriter = new FileWriter(outFile);
			PrintWriter printWriter = new PrintWriter(fileWriter);
			
			products.forEach( i -> printWriter.println(i.toString()) );
			printWriter.flush();
			printWriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
