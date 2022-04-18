package secao05;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Integer horaInicial, horaFinal, duracao;
		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();

		if (horaInicial.compareTo(horaFinal) < 0) {
			duracao = horaFinal - horaInicial;
		} else {
			duracao = (24 - horaInicial) + horaFinal;
		}

		System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
		
		sc.close();
	}
}
