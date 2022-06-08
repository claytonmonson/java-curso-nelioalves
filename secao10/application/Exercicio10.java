package application;

import java.util.Scanner;

import entities.StudentSecao10;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		StudentSecao10[] rooms = new StudentSecao10[10];

		System.out.print("How many rooms will be rented ? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.println("Rent #" + i);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			StudentSecao10 student = new StudentSecao10(name, email);
			rooms[room] = student;
			System.out.println();
		}

		sc.close();

		System.out.println("\nBusy rooms:");
		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i] != null) {
				System.out.printf("%d: %s, %s\n", i, rooms[i].getName(), rooms[i].getEmail());
			}
		}

	}
}
