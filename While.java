import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe uma sequencia de numero diferente de zero para soma:");
		int x = sc.nextInt();
		
		int soma=0;
		while(x!=0) {
			soma+=x;
			x=sc.nextInt();
		}
		System.out.println("Soma dos números selecionados "+soma);
			
		sc.close();

	}

}
