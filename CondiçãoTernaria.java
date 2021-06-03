import java.util.Scanner;

public class CondiçãoTernaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double preco, desconto;
		
		System.out.println("Informe o preço do produto:");
		preco = sc.nextDouble();
		
		desconto=(preco<20)?preco*0.1:preco*0.05;
		System.out.printf("O produto selecionado tem desconto de R$ %.2f%n",desconto);
		sc.close();

	}

}
