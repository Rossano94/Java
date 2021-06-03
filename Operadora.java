import java.util.Locale;
import java.util.Scanner;

public class Operadora {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double minutos;
		
		System.out.println("Informe os minutos utilizados");
		minutos=sc.nextDouble();
		
		if(minutos>100) {
			minutos=(minutos-100)*2+50;
			System.out.printf("Valor a pagar: R$ %.2f%n",minutos);
		}else {
			System.out.println("Valor a pagar: R$ 50.00");
		}
		
		
		
		
		
		sc.close();
	}

}
