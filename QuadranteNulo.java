import java.util.Scanner;

public class QuadranteNulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor de x:");
		int x = sc.nextInt();
		System.out.println("Informe o valor de y:");
		int y = sc.nextInt();
		
		while(x != 0 && y != 0) {
			if(x>0 && y>0) {
				System.out.println("Primeiro Quadrante\n");
			}else if(x<0 && y>0) {
				System.out.println("Segundo Quadrante\n");
			}else if(x<0 && y<0) {
				System.out.println("Terceiro Quadrante\n");
			}else {
				System.out.println("Quarto Quadrante\n");
			}
			
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		
		sc.close();

	}

}
