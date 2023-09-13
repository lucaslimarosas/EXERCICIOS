package curso_programacao;

import java.util.Scanner;
import java.util.Locale;

public class CalculoHorasTrabalhadas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numeroFuncionario, horaTrabalhada;
		double salario, valorHora;

		System.out.println("Digite o número do funcionário");
		numeroFuncionario = sc.nextInt();
		
		System.out.println("Digite a quantidade de horas trabalhadas");
		horaTrabalhada = sc.nextInt();
		
		System.out.println("Digite o valor das horas trabalhadas");
		valorHora = sc.nextDouble();
		
		salario = horaTrabalhada * valorHora;

		System.out.println("NUMBER= " + numeroFuncionario);
		System.out.printf("SALARY= U$ %.2f%n", salario);

		sc.close();

	}

}
