import java.util.Scanner;

public class InOut {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o número de vezes que o programa vai ler a condição:");
		int N = sc.nextInt();

		int in = 0;
		int out = 0;

		for (int X = 0; X < N; X++) {
			int numero = sc.nextInt();
			if (numero >= 10 && numero <= 20) {
				in = in + 1;

			} else {
				out = out + 1;
			}
		}
		System.out.println("in: " + in);
		System.out.println("out: " + out);

		sc.close();
	}

}
