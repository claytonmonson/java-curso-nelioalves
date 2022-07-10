package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program156 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Pessoa> pessoa = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c) ? ");
			char tp = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual Income: ");
			Double anualIncome = sc.nextDouble();

			if (tp == 'i') {
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				pessoa.add(new PessoaFisica(name, anualIncome, healthExpenditures));

			} else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				pessoa.add(new PessoaJuridica(name, anualIncome, numberOfEmployees));

			}
		}

		System.out.println();

		double totalTaxPaid = 0.0;
		System.out.println("TAXES PAID:");
		for (Pessoa p : pessoa) {
			System.out.printf("%s: $ %.2f%n", p.getNome(), p.impostoPago());
			totalTaxPaid += p.impostoPago();
		}

		System.out.println();
		System.out.printf("TOTAL TAXES: %.2f", totalTaxPaid);

		sc.close();
	}
}
