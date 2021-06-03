import java.util.Locale;
import java.util.Scanner;

public class CincoNumeros {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Esolcha cinco números:");
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		double n4 = sc.nextDouble();
		double n5 = sc.nextDouble();
		
		double resultadoSoma=n1+n2+n3+n4+n5;
		
		System.out.println("Somatório "+resultadoSoma);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		
		sc.close();
	}

}
