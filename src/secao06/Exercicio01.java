package secao06;

import java.util.Scanner;

/*
Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha 
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser 
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002
*/

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int senhaDefault = 2002;
		
		System.out.print("Senha: ");
		int senha = sc.nextInt();
		
		while(senha != senhaDefault) {
			System.out.println("Acesso negado");
			System.out.print("Senha: ");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso permitido");
		
		sc.close();
		
	}
}
