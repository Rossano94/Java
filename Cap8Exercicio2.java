import java.util.Locale;
import java.util.Scanner;

public class Cap8Exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha dois números");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int result = soma(x,y);
		System.out.println("Resultado da soma:"+result);
		
		
		sc.close();

	}
	public static int soma(int a, int b) {
		int s = a+b;
		return s;
	}
}
