
public class StringExemplos {

	public static void main(String[] args) {
		String letras = "abcg DEF ghi JKL ggygcg       ";

		String letrasMinusculas = letras.toLowerCase();// transforma em minusculo
		System.out.println("toLowerCase -" + letrasMinusculas + "-");

		String letrasMaiusculas = letras.toUpperCase();// transforma em maisculo
		System.out.println("toUpperCase -" + letrasMaiusculas + "-");

		String espacoEmBranco = letras.trim();// remove o espaço no final da string
		System.out.println("trim -" + espacoEmBranco + "-");

		String pegarCaracterInicio = letras.substring(5);// inicio a string na posição ()
		System.out.println("substring(5) -" + pegarCaracterInicio + "-");

		String pegarCaracterInicioeFim = letras.substring(4, 7);// inicio e fim da string
		System.out.println("substring(4,7) -" + pegarCaracterInicioeFim + "-");

		String trocarCaracter = letras.replace("g", "X");// trocar todo o caracter "g" por "X"
		System.out.println("replace('g','x') -" + trocarCaracter + "-");

		String trocarSubstring = letras.replace("ghi", "TOP");// trocar todo substring "g" por "X"
		System.out.println("replace('ghi','TOP') -" + trocarSubstring + "-");

		int x = letras.indexOf("cg");
		System.out.println("indexOf 'cg' " + x);// primeira ocorrencia do cg
		int y = letras.lastIndexOf("cg");
		System.out.println("lastIndexOf " + y);// ultima ocorrencia do cg

	}

}
