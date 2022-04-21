package secao06;

import java.util.Scanner;

/*
Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva 
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até 
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a 
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme 
exemplo
 */
public class Exercicio03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int opcao = 0;
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		while (opcao != 4) {
			System.out.println("Selecione o combustível desejado:");
			System.out.println("1.Álcool\n2.Gasolina\n3.Diesel\n4.Fim\n");
			System.out.print("Opção: ");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				alcool++;
				break;
			case 2:
				gasolina++;
				break;
			case 3:
				diesel++;
				break;
			case 4:
				break;
			default:
				System.out.println("Opção inválida. Digite novamente");
				break;
			}
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool..: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel..: " + diesel);

		sc.close();

	}
}
