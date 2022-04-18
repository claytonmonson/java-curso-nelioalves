package secao05;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Double salario, imposto;

		System.out.print("Digite o salário em R$: ");
		salario = sc.nextDouble();

		if (salario <= 2000.0) {
			imposto = 0.0;
		} else if (salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08;
		} else if (salario <= 4500.0) {
			imposto = 1000.0 * 0.08 + (salario - 3000.0) * 0.18;
		} else {
			imposto = 1000.0 * 0.08 + 1500.0 * 0.18 + (salario - 4500.0) * 0.28;
		}

		if (imposto == 0.0) {
			System.out.println("Isento");
		} else {
			System.out.printf("R$ %.2f", imposto);
		}

		sc.close();

	}
}
