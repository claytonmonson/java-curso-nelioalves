package secao04;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Integer a, b, c, d, diferenca;

		System.out.print("Valor A: ");
		a = sc.nextInt();
		System.out.print("Valor B: ");
		b = sc.nextInt();
		System.out.print("Valor C: ");
		c = sc.nextInt();
		System.out.print("Valor D: ");
		d = sc.nextInt();

		diferenca = (a * b) - (c * d);
		System.out.println("DIFERENÇA: " + diferenca.toString());

		sc.close();
	}
}
