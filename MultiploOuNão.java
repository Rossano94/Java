import java.util.Scanner;

public class MultiploOuN�o {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A,B;
		
		System.out.println("Informe o primeiro n�mero:");
		A = sc.nextInt();
		System.out.println("Informe o segundo n�mero:");
		B = sc.nextInt();
		
		if(A%B==0 || B%A==0) {
			System.out.println("SAO MULTIPLOS");
		}else {
			System.out.println("NAO SAO MULTIPLOS");
		}
		
		sc.close();

	}

}
