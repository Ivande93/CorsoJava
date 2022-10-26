import java.util.Scanner;

public class OpCondizionale {

	public static void main(String[] args) {
		 
		
		
		Scanner sc = new Scanner(System.in); 
		  System.out.print("Inserisci il primo n° da confrontare:x "); 
		   
		  int x  = sc.nextInt();
		  
		  System.out.print("Inserisci il secondo n° da confrontare:y "); 
		  
		  Scanner sc1 = new Scanner(System.in);
				  
		  int y  = sc1.nextInt();
		  
		     
		     if (x == y) {
		      System.out.println(" x è uguale a y");
		      
		     }
		     if (x < y) {
		      System.out.println("x è minore di y");
		     }
		     if (x > y) {
		      System.out.println("x è maggiore di y ");
		     }
		     

	}

}
