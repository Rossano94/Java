import java.util.Scanner;

public class MaiorDeIdade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o ano do seu nascimento:");
		int ano = sc.nextInt();

		int idade = 2021 - ano;
		System.out.println("Idade: " + idade + " anos");

		if (idade >= 18) {
			System.out.println("Apto a Votar");
			System.out.println("Apto a tirar a Carteira de Habilitação");
		} else if (idade >= 16 && idade < 18) {
			System.out.println("Apto a Votar");
		} else {
			System.out.println("Inapto a votar");
			System.out.println("Inapto a tirar a Carteira de Habilitação");
		}

		sc.close();

	}

}
