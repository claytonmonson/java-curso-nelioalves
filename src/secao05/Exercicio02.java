package secao05;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um n�mero inteiro: ");
		Integer numero = sc.nextInt();

		if (numero % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
		sc.close();

	}
}
