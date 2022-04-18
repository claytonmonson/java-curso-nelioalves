package secao05;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String intervalo = "";
		Double numero = sc.nextDouble();

		if (numero.compareTo(0.0) < 0.0 || numero.compareTo(100.0) > 0.0) {
			intervalo = "Fora do intervalo";
		} else if (numero >= 0.0 && numero <= 25.0) {
			intervalo = "Intervalo [0,25]";
		} else if (numero > 25.0 && numero <= 50.0) {
			intervalo = "Intervalo (25,50]";
		} else if (numero > 50.0 && numero <= 75.0) {
			intervalo = "Intervalo (50,75]";
		} else {
			intervalo = "Intervalo (75,100]";
		}

		System.out.println(intervalo);
		sc.close();

	}
}
