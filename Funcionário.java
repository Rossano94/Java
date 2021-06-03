import java.util.Locale;
import java.util.Scanner;

public class Funcionário {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
				
		int funcionario = sc.nextInt();
		int horasTrabalhadas = sc.nextInt();
		double valorPorHora = sc.nextDouble();
		double salario;
		
		salario = horasTrabalhadas*valorPorHora; 
		System.out.println("NUMBER = "+funcionario);
		System.out.printf("SALARY = U$ %.2f%n",salario);
		
		sc.close();
	}

}
