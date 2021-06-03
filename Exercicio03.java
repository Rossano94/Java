import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe dois números inteiros");
		int a = sc.nextInt();
		int b = sc.nextInt();

		int par = verificador(a, b);
		System.out.println(par);

		sc.close();

	}

	public static int verificador(int x, int y) {
		int result = x + y;
		if (result % 2 == 0) {
			result = 0;
		} else {
			result = 1;
		}
		return result;
	}

}