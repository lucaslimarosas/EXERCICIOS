package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class MultiplasAreasExercicio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();

		// Área do triangulo retângulo

		double areaTri = A * C / 2;

		// Área do círculo

		double areaCirc = Math.PI * (Math.pow(C, 2));

		// Área do trapézio

		double areaTrape = A + B * C / 2;

		// Área do quadrado

		double areaQuad = B * B;

		// Área retângulo

		double areaRet = A * B;

		System.out.printf("TRIANGULO: %.3f%n", areaTri);
		System.out.printf("CIRCULO: %.3f%n", areaCirc);
		System.out.printf("TRAPEZIO: %.3f%n", areaTrape);
		System.out.printf("QUADRADO: %.3f%n", areaQuad);
		System.out.printf("RETANGULO: %.3f%n", areaRet);

		sc.close();

	}

}
