package atividade;
import java.util.Scanner;

public class LDP7144 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int x = leia.nextInt();
		leia.close();

		if(x%2==0 && x>=0) {
			System.out.println("PAR E POSITIVO");
		} else if(x%2==0 && x<0) {
			System.out.println("PAR E NEGATIVO");
		} else if(x%2==1 && x>=0) {
			System.out.println("�MPAR E POSITIVO");
		}else {
			System.out.println("�MPAR E NEGATIVO");
		}
	}

}
