import java.util.Locale;
import java.util.Scanner;

public class ImpostoDeRenda {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double renda,imposto=0;
		
		System.out.println("Informe a renda do cidadão ");
		renda = sc.nextDouble();
		
		if(renda<=2000.00) {
			imposto=0.0;
		}else if(renda<=3000.00) {
			imposto=(renda-2000)/100*8;
		}
		else if(renda<=4500.00) {
			imposto=(renda-3000)/100*18 + 1000/100*8;
		}else if(renda>4500.00) {
			imposto=(renda-4500)/100*28 + 1500/100*18 + 1000/100*8;
		}
		
		if(imposto==0.0) {
			System.out.println("Isento");
		}else {
			System.out.printf("R$ %.2f%n",imposto);
		}
		
		sc.close();

	}

}
