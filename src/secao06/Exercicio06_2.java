package secao06;

import java.util.Scanner;

/*
 Leia um valor inteiro N. Este valor ser� a quantidade de valores inteiros X que ser�o lidos em seguida.
 Mostre quantos destes valores X est�o dentro do intervalo [10,20] e quantos est�o fora do intervalo, mostrando 
 essas informa��es conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo)
 */
public class Exercicio06_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de inteiros: ");
		int quantidadeLer = sc.nextInt();
		int quantidadeIntervalo = 0;

		for (int i = 1; i <= quantidadeLer; i++) {
			int numero = sc.nextInt();
			if (numero >= 10 && numero <= 20) {
				quantidadeIntervalo++;
			}
		}
		System.out.printf("%d in\n", quantidadeIntervalo);
		System.out.printf("%d out", quantidadeLer - quantidadeIntervalo);
		sc.close();

	}
}
