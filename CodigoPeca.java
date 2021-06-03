import java.util.Locale;
import java.util.Scanner;

public class CodigoPeca {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int quantidade1 = sc.nextInt();
		double valor1 = sc.nextDouble();
		
		int quantidade2 = sc.nextInt();
		double valor2 = sc.nextDouble();
		
		double pagar = (quantidade1*valor1 + quantidade2*valor2);
		System.out.printf("VALOR A PAGAR: R$ %.2f%n",pagar);
		
		sc.close();
	}

}
