package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee20;

public class Program20 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee20> emp = new ArrayList<>();

		System.out.print("Enter full file path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				emp.add(new Employee20(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			br.close();

			System.out.print("Enter salary: ");
			double salary = sc.nextDouble();

			System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary));
			List<String> email = emp.stream()
					.filter(e -> e.getSalary() >= salary)
					.map(e -> e.getEmail())
					.sorted()
					.collect(Collectors.toList());
			email.forEach(System.out::println);
			
			double sum = emp.stream()
					.filter( e -> e.getName().charAt(0) == 'M')
					.map( e -> e.getSalary())
					.reduce( 0.00, (x,y) -> x + y);
			
			System.out.print("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();

	}
}
