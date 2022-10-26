import java.util.Scanner;

public class Divisione {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in); {
			System.out.println("Trasforma minuti in ore :");
			
             double minuti = sc.nextDouble();
			
			int ore = (int)(minuti / 60 );
			
			int resto = ( int) ( minuti % 60);
			
			System.out.println ("i minuti in ore sono : " +   ore + " " + " " +  resto );
	}
	}
}

