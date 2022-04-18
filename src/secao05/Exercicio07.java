package secao05;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Double x, y;

		System.out.print("Digite as coordenadas x e y: ");
		x = sc.nextDouble();
		y = sc.nextDouble();

		if (x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		} else if (x == 0.0) {
			System.out.println("Eixo y");
		} else if (y == 0.0) {
			System.out.println("Eixo x");
		} else if (x > 0.0) {
			if (y > 0.0) {
				System.out.println("Q1");
			} else {
				System.out.println("Q4");
			}
		} else {
			if (y > 0.0) {
				System.out.println("Q2");
			} else {
				System.out.println("Q3");
			}
		}

		sc.close();

	}
}
