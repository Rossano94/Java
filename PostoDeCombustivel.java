import java.util.Scanner;

public class PostoDeCombustivel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o c�digo do Combust�vel:");
		int codigo = sc.nextInt();
		int A=0,G=0,D=0;

		
		while (codigo != 4) {
			if (codigo == 1) {
				A=A+1;
			}else if (codigo == 2) {
				G=G+1;
			}else if (codigo == 3) {
				D=D+1;			
			}else {
				System.out.println("Informe um c�digo v�lido");
			}
			codigo = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool:"+A);
		System.out.println("Gasolina:"+G);
		System.out.println("Disel:"+D);
		sc.close();
	}

}
