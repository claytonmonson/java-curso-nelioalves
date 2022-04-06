package secao04;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Integer numero, horasTrabalhadas;
		Double valorHora, salario;

		System.out.println("DADOS DO FUNCIONÁRIO");
		System.out.println("====================");

		System.out.print("Número: ");
		numero = sc.nextInt();
		System.out.print("Horas Trabalhadas: ");
		horasTrabalhadas = sc.nextInt();
		System.out.print("Valor Hora: R$ ");
		valorHora = sc.nextDouble();
		salario = horasTrabalhadas * valorHora;
		System.out.println();
		System.out.printf("NUMBER: %d%n", numero);
		System.out.printf("SALARY = U$ %.2f", salario);

		sc.close();
	}
}
