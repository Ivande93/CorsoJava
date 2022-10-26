import java.util.Scanner;

public class Es3 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print( "Inserisci nome: "); 
		
		String nome = sc.nextLine();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.print( "Inserisci Cognome: "); 
		
		String cognome = sc1.nextLine();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.print( "Inserisci Età: "); 
		
		int eta = sc2.nextInt();
		
		int anni =( eta + 15 );
		
		
		
		
		System.out.println( nome  + " " +  cognome + " "+ " anni " +" " + eta + " "+ 
		 		" fra quindici anni avrai: " +  " "+ anni + " anni ");
	}

}
