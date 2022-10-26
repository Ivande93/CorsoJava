import java.util.Scanner;

public class CalcolaGiorni {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci il N° progressivo per il calendario corrispondente al tuo compleanno :");
		int Compleanno = sc.nextInt(); 
		int Giorni = 365;
		int Oggi = 277;
		
		if (Compleanno > Oggi )	{
		
			System.out.println( Compleanno - Oggi);
		}
		
		else System.out.println (Giorni - Oggi + Compleanno);
		
		
		
	}

}
