package secao05;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer a,b, maior;
		a = sc.nextInt();
		b = sc.nextInt();
		if (a.compareTo(b) < 0) {
			maior = b;
			b = a;
			a = maior;
		}
		
		if (a % b == 0) {
			System.out.println("São múltiplos");
		} else {
			System.out.println("Não são múltiplos");
		}

		sc.close();
	}
}
