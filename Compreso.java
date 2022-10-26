import java.util.Scanner;

public class Compreso {

	public static void main(String[] args) {
		

			Scanner sc = new Scanner(System.in);
			System.out.println(" Scrivi il 1° n°:");
			
			int numero = sc.nextInt();
			
			Scanner sc2 = new Scanner(System.in);
			
			System.out.println(" Scrivi il 2° n°:");
			
			int numero2 = sc2.nextInt();
			
			Scanner sc3 = new Scanner(System.in);
			
			System.out.println(" Scrivi il 3° n°:");
			
			int numero3 = sc3.nextInt();
			
			if ( numero > numero2 && numero > numero3) { 
				
			System.out.println(numero);}
			
			else if ( numero2 > numero3 && numero2 > numero ) { 
				
				System.out.println(numero2);}
					 
		
		    else if (numero3 > numero && numero3 > numero2) {
			
			System.out.println(numero3);}
				
				
	}

}
