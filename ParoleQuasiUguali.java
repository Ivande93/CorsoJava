import java.util.Scanner;

public class ParoleQuasiUguali {

	public static void main(String[] args) {
		
		 String frase;
		 
		 Scanner sc =new Scanner( System.in);
		 System.out.println("Inserisci la prima parola:");
		String frase1 = sc.nextLine();
		 Scanner sc1 =new Scanner( System.in);
		 System.out.println("Inserisci la seconda parola:");
		 String frase2 = sc1.nextLine();
		boolean uguale = frase1.equals(frase2);
		boolean quasiuguale = frase1.equalsIgnoreCase(frase2);
		
				
		if (uguale==true) {
			System.out.println("Sono UGUALI!");}
		else if (quasiuguale==true) {
			System.out.println("Sono Simili.");}
		else
			System.out.println("Non sono per niente uguali.");
	}
}

