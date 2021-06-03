import java.util.Locale;
import java.util.Scanner;

public class Cardapio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		int codigo,quantidade;
		double valor;
		
		System.out.println("Informe o código do item:");
		codigo = sc.nextInt();
		System.out.println("Informe a quantidade:");
		quantidade = sc.nextInt();
		
		if(codigo==1) {
			valor = quantidade*4.0;
		}
		else if(codigo==2) {
			valor = quantidade*4.50;
		}
		else if(codigo==3) {
			valor = quantidade*5.0;
		}
		else if(codigo==4) {
			valor = quantidade*2.0;
		}
		else{
			valor = quantidade*1.50;
		}
		System.out.printf("Total: R$ %.2f%n",valor);
		sc.close();

	}

}
