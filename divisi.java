import java.util.Scanner;

public class divisi {

	public static void main(String[] args) {
		
		
		
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println ("Inserisci numero 1:");
		
		int n1 = sc1.nextInt();
		
		
		Scanner sc2 = new Scanner(System.in);
		
		System.out.print("Inserisic numero 2: "); 
				
				int n2 = sc2.nextInt();
				
				int divi = (n1/n2);
				int rest = (n1%n2);
		
				System.out.print("Il risultato è: "+" "+divi+" "+ "il resto è:"+ " "+rest);
	}

}
