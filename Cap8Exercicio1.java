import java.util.Locale;
import java.util.Scanner;

public class Cap8Exercicio1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Escolha um número");
		int x = sc.nextInt();

		int result = verificar(x);
		
		if(result==1) {
			System.out.println("Positivo");
		}else {
			System.out.println("Negatavio");
		}
		
		sc.close();
	}

	public static int verificar(int v) {
		if (v >= 0) {
			v = 1;
		} else {
			v = 0;
		}
		return v;
	}

}
