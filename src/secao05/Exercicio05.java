package secao05;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Integer item, quantidade;
		Double valor;

		Double valorItem1 = 4.0;
		Double valorItem2 = 4.5;
		Double valorItem3 = 5.0;
		Double valorItem4 = 2.0;
		Double valorItem5 = 1.5;

		item = sc.nextInt();
		quantidade = sc.nextInt();

		if (item.compareTo(1) == 0) {
			valor = quantidade * valorItem1;
		} else if (item.compareTo(2) == 0) {
			valor = quantidade * valorItem2;
		} else if (item.compareTo(3) == 0) {
			valor = quantidade * valorItem3;
		} else if (item.compareTo(4) == 0) {
			valor = quantidade * valorItem4;
		} else {
			valor = quantidade * valorItem5;
		}

		System.out.printf("Total: R$ %.2f", valor);
		sc.close();

	}

}
