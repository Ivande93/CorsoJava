import java.util.Scanner;

public class NuovoProgramma {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in); 
		  System.out.print("Inserisci il primo n° da confrontare:x "); 
		   
		  int x  = sc.nextInt();
		  
		  System.out.print("Inserisci il secondo n° da confrontare:y "); 
		  
		  Scanner sc1 = new Scanner(System.in);
				  
		 int y  = sc1.nextInt();
		  
         int S = x + y;
           
		 int x1 = 40;
		  
		 if (S == x1) {
		      System.out.println("è uguale a 40");
		      
		     }
		     if (S < x1) {
		      System.out.println("è minore di 40");
		     }
		     if (S > x1) {
		      System.out.println("è maggiore di 40 ");
		     }
		  System.out.println("La somma è di "  + S   );
		  
	}

}
