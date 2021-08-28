package atividade;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int x = leitor.nextInt(); // aqui criamos uma vari�vel que ir� armazenar o numero do fatorial
		leitor.close();

		if (x != 0) {
			int f = x; // aqui criamos outra var. Ser� o resultado tempor�rio da multiplica��o

			while (x > 1) { // Enquanto x for menor que 1 fa�a o que est� entre as chaves

				f = f * (x - 1); // A vari�vel tempor�ria ira receber o resultado da multiplica��o dela, pelo
									// valor de x menos 1
				x--; // aqui decrementamos o valor de x em um, no final do loop
				// System.out.println(f); // Esse comando imprime o valor de f. O �ltimo ser� o
				// valor final do Fatorial.
			}
			System.out.println(f);
		} else {
			System.out.println(1);
		}
	}
}
