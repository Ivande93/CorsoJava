import java.util.Scanner;

public class MesiAnno {

	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in); 
		  System.out.print("Inserisci il numero del mese ");
		  
		  int x = sc.nextInt();
		  
		  if  (x == 1 ) {
				
				System.out.println("Gennaio ");
			}	
					
				else if  ( x == 2) {
					
				 System.out.println("Febbraio");
				}		 
				else if ( x == 3) {
								
				System.out.println("Marzo");
			}		 
				else if ( x == 4) {
									
		        System.out.println("Aprile");
							 }
				else if ( x == 5) {
					
		            System.out.println("Maggio");
		    					 }
				else  if ( x == 6) {
					
		            System.out.println("Giugno");
		    					 }
				else if ( x == 7) {
					
				System.out.println("Luglio");
				}
				else if ( x == 8) {
					
					System.out.println("Agosto");
					}
				else if ( x == 9) {
					
					System.out.println("Settembre");
					}else if ( x == 10) {
						
						System.out.println("Ottobre");
						}else if ( x == 11) {
							
							System.out.println("Novembre");
							}else if ( x == 12) {
								
								System.out.println("Dicembre");
								}
		            else System.out.println ( " numero non consentito "); 
		

	}

}
