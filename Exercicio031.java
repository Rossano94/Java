import java.util.Scanner;

public class Exercicio031 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Selecione dois n�meros:");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		double resultadoDaFuncao = nomeDaFuncao(a,b);//a,b s�o par�metros
		System.out.println(resultadoDaFuncao);
		
		sc.close();

	}

	public static double nomeDaFuncao (double x,double y) {
		double result = x+y;
		return result;
	}
}
