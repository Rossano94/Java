import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int hora;
		 
		 System.out.println("what time is it ?");
		 hora = sc.nextInt();
		 
		 if(hora<12) {
			 System.out.println("Good morning");
		 }
		 else if(hora<18) {			 
			 System.out.println("Good evening");
		 }
		else {
			 System.out.println("Good night");
		}
		 
		sc.close();
	}

}
