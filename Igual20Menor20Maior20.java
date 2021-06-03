import java.util.Scanner;

public class Igual20Menor20Maior20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha um número:");
		int x = sc.nextInt();
		
		if(x>20) {
			System.out.println("Maior do que 20");
		}else if(x<20) {
			System.out.println("Menor do que 20");
		} else {
			System.out.println("Igual a 20");
		}
		
		sc.close();

	}

}
