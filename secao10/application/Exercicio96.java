package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.EmployeeExercise96;

public class Exercicio96 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		List<EmployeeExercise96> listEmployee = new ArrayList<>();

		System.out.print("How many employees will be registered ? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.printf("%nEmployee #%d:%n", i + 1);
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			String name = sc.next();
			sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			listEmployee.add(new EmployeeExercise96(id, name, salary));
		}

		System.out.print("\nEnter the employee id that will have salary increase: ");
		int idIncrease = sc.nextInt();
		Integer position = position(listEmployee, idIncrease);
		if (position == null) {
			System.out.println("This id does not exist !");
		} else {
			System.out.print("Enter the percentage: ");
			double increase = sc.nextDouble();
			listEmployee.get(position).increaseSalary(increase);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for (EmployeeExercise96 x : listEmployee) {
			System.out.println(x.toString());
		}
		;

		sc.close();
	}

	private static Integer position(List<EmployeeExercise96> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
}
