import java.util.Scanner;

public class TempoDeJogo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inicio, fim, duracao;
		
		System.out.println("Informe a hora do inicio do jogo:");
		inicio = sc.nextInt();
		System.out.println("Informe a hora do fim do jogo:");
		fim = sc.nextInt();
		
		if(inicio<fim) {
			duracao = fim-inicio;
			System.out.println("O JOGO DUROU "+duracao+" HORA(S)");
		}else {
			duracao=(24-inicio)+fim;
			System.out.println("O JOGO DUROU "+duracao+" HORA(S)");
		}
		
		sc.close();
	}

}
