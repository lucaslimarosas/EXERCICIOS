package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_raio_circ {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double R, A, pi = Math.PI
		

		;
		R = sc.nextDouble();
		
		A = pi * (Math.pow(R, 2));

		System.out.printf ("A=%.4f%n ", A);
		sc.close();

	}

}
