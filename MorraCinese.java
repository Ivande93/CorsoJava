import java.util.Scanner;

public class MorraCinese {

	public static void main(String[] args) {
	
	
		int x=0;
		
		do {
   
		     
		    System.out.print("Scelta del primo giocatore: ");  
		    Scanner sc1 =new Scanner( System.in);
			String Giocatore1 = sc1.next();
			
		    System.out.print("Scelta del secondo giocatore: ");
		    Scanner sc2 =new Scanner( System.in);
		    String Giocatore2 = sc2.next();
		    
		      if (Giocatore1.equals(Giocatore2))
		      System.out.println("Parità!");
		      
		      else if (Giocatore1.equals("sasso")&&Giocatore2.equals("sasso"))
		    	  System.out.println("Parità!");
		      
		      else if (Giocatore1.equals("sasso")&&Giocatore2.equals("forbice"))
		      System.out.println("Ha vinto il primo giocatore!");
		    
		      else if (Giocatore1.equals("carta")&&Giocatore2.equals("sasso"))
		      System.out.println("Ha vinto il primo giocatore!");
		    
		      else if (Giocatore1.equals("forbice")&&Giocatore2.equals("carta"))
		      System.out.println("Ha vinto il primo giocatore!");
		    
		      else if (Giocatore2.equals("sasso")&&Giocatore1.equals("forbice"))
		      System.out.println("Ha vinto il secondo giocatore!");
		    
		      else if (Giocatore2.equals("carta")&&Giocatore1.equals("sasso"))
		      System.out.println("Ha vinto il secondo giocatore!");
		    
		      else if(Giocatore2.equals("forbice")&&Giocatore1.equals("carta"))
		      System.out.println("Ha vinto il secondo giocatore!");
		      Scanner sc3 =new Scanner( System.in);
				 System.out.println("Digita 1 per giocare ancora, 2 per terminare!");
				 x = sc3.nextInt();
		}
		while (x<=1);
		{  
			if (x>=2) {
				System.out.println("Partita terminata ! Ha vinto lo sport ! ");
			}}	
		}}
		
		    
		 
