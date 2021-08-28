package atividade;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int x = leitor.nextInt(); // aqui criamos uma variável que irá armazenar o numero do fatorial
		leitor.close();

		if (x != 0) {
			int f = x; // aqui criamos outra var. Será o resultado temporário da multiplicação

			while (x > 1) { // Enquanto x for menor que 1 faça o que está entre as chaves

				f = f * (x - 1); // A variável temporária ira receber o resultado da multiplicação dela, pelo
									// valor de x menos 1
				x--; // aqui decrementamos o valor de x em um, no final do loop
				// System.out.println(f); // Esse comando imprime o valor de f. O último será o
				// valor final do Fatorial.
			}
			System.out.println(f);
		} else {
			System.out.println(1);
		}
	}
}
