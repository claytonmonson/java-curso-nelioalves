package secao04;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Double raio, area;

		System.out.println("�rea do C�rculo");
		System.out.print("Digite o raio: ");
		raio = sc.nextDouble();
		area = Math.PI * Math.pow(raio, 2);

		System.out.printf("�rea = %.4f", area);

		sc.close();
	}
}
