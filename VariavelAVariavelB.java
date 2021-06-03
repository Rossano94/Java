import java.util.Scanner;

public class VariavelAVariavelB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um número:");
		int x = sc.nextInt();

		if (x >= 0) {
			int A = x;
			System.out.println("A: " + A);
			System.out.println("B: undefined");
		} else {
			int B = x;
			System.out.println("A: undefined");
			System.out.println("B: " + B);
		}

		sc.close();
	}

}
