package application;

import java.util.Scanner;

public class Exercicio100 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Número de linhas: ");
		int numeroLinhas = sc.nextInt();
		System.out.print("Número de colunas: ");
		int numeroColunas = sc.nextInt();
		int[][] matriz = new int[numeroLinhas][numeroColunas];

		for (int m = 0; m < numeroLinhas; m++) {
			for (int n = 0; n < numeroColunas; n++) {
				matriz[m][n] = sc.nextInt();
			}
		}

		System.out.println();
		System.out.print("Número a pesquisar: ");
		int numero = sc.nextInt();

		System.out.println();
		for (int m = 0; m < numeroLinhas; m++) {
			for (int n = 0; n < numeroColunas; n++) {
				if (matriz[m][n] == numero) {
					System.out.printf("Position %d,%d:%n", m, n);
					if (n > 0) {
						System.out.printf("Left: %d%n", matriz[m][n - 1]);
					}
					if (n < numeroColunas - 1) {
						System.out.printf("Right: %d%n", matriz[m][n + 1]);
					}
					if (m > 0) {
						System.out.printf("Up: %d%n", matriz[m - 1][n]);
					}
					if (m < numeroLinhas - 1) {
						System.out.printf("Down: %d%n", matriz[m + 1][n]);
					}
				}
			}
		}

		sc.close();

	}
}
