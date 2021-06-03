import java.util.Locale;
import java.util.Scanner;

public class Media7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a primeira nota do aluno");
		double nota1 = sc.nextDouble();
		System.out.println("Informe a primeira nota do aluno");
		double nota2 = sc.nextDouble();

		double resultado = (nota1 + nota2) / 2;

		if (resultado >= 7) {
			System.out.println("Aprovado");
		} else {
			System.out.println(resultado);
		}

		sc.close();
	}

}
