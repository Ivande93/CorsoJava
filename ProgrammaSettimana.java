import java.util.Scanner;

public class ProgrammaSettimana {

	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		  System.out.print("Inserisci il numero del giorno ");
		  
		int x = sc.nextInt();
		
		
		
		if  (x == 1 ) {
			
		System.out.println("Lunedì ");
	}	
			
		else if  ( x == 2) {
			
		 System.out.println("Martedì");
		}		 
		else if ( x == 3) {
						
		System.out.println("Mercoledì");
	}		 
		else if ( x == 4) {
							
        System.out.println("Giovedì");
					 }
		else if ( x == 5) {
			
            System.out.println("Venerdì");
    					 }
		else  if ( x == 6) {
			
            System.out.println("Sabato");
    					 }
		else if ( x == 7) {
			
		System.out.println("Domenica");
		}
            else System.out.println ( " numero non consentito "); 
    					 }
				     }
	


