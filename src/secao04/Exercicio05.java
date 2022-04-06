package secao04;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Integer codigo1, quantidade1, codigo2, quantidade2;
		Double valorUnitario1, valorUnitario2, valorPagar1, valorPagar2;

		codigo1 = sc.nextInt();
		quantidade1 = sc.nextInt();
		valorUnitario1 = sc.nextDouble();
		valorPagar1 = quantidade1 * valorUnitario1;

		codigo2 = sc.nextInt();
		quantidade2 = sc.nextInt();
		valorUnitario2 = sc.nextDouble();
		valorPagar2 = quantidade2 * valorUnitario2;

		System.out.printf("VALOR A PAGAR: R$ %.2f", valorPagar1 + valorPagar2);

		sc.close();

	}
}
