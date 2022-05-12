package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Exercicio02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Gross salary: ");
		double grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		double tax = sc.nextDouble();
		System.out.println();

		Employee employee = new Employee(name, grossSalary, tax);
		System.out.println("Employee: " + employee.toString());

		System.out.print("\nWhich percentage to increase salary? ");
		employee.increaseSalary(sc.nextDouble());
		System.out.println("\nUpdated data: " + employee.toString());

		sc.close();

	}

}
