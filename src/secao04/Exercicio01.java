package secao04;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a, b, soma;

		System.out.println("Soma de 2 numeros\n");
		System.out.print("Valor 1: ");
		a = sc.nextInt();
		System.out.print("Valor 2: ");
		b = sc.nextInt();

		soma = a + b;
		System.out.printf("%d + %d = %d", a, b, soma);

		sc.close();

	}
}
