package curso_programacao;

import java.util.Scanner;
import java.util.Locale;

public class calculoValorPecas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cp1, cp2, np1, np2;
		double vp1, vp2, totalp1, totalp2, vtotal;

		// peça 1 //
		
		System.out.println("Digite o código da peça 1");
		cp1 = sc.nextInt(); // código peça 1
		
		System.out.println("Digite o número de peças");
		np1 = sc.nextInt(); // número de peças 1
		
		System.out.println("Digite o valor da peça 1");
		vp1 = sc.nextDouble(); // valor peça 1

		totalp1 = np1 * vp1; // número de peças 1 X valor peças 1

		// peça 2

		System.out.println("Digite o código da peça 2");
		cp2 = sc.nextInt();
		
		System.out.println("Digite o número de peças");
		np2 = sc.nextInt();
		
		System.out.println("Digite o valor da peça 2");
		vp2 = sc.nextDouble();
		totalp2 = np2 * vp2;

		// VALOR TOTAL DA COMPRA

		vtotal = totalp1 + totalp2;

		System.out.printf("VALOR A PAGAR: R$ %.2f%n", vtotal);

		sc.close();

	}

}
