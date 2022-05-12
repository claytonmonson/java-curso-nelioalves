package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		double grade1 = sc.nextDouble();
		double grade2 = sc.nextDouble();
		double grade3 = sc.nextDouble();
		Student student = new Student(name, grade1, grade2, grade3);
		
		System.out.println(student.situation());
		
		sc.close();
		
	}
}
