import java.util.Scanner;

public class Feste  {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in); 
			System.out.println("Inserire Giorno  :");
			
			int x = sc.nextInt();	
			
			
			Scanner sc1 = new Scanner(System.in); 
				
				System.out.println("Inserire Mese :");
			int y = sc1.nextInt();
			{
		  if (x >= 1 && x <= 31 && y >= 1 && y <= 12) 
		  
		  if (x == 25 && y == 12)
		 {
		  System.out.println("E' natale");
		 }

		  else  if (x == 6 && y == 1)
			 {
			  System.out.println("E' l'Epifania");
			  
			 }		  
		  else  if (x == 15 && y == 8)
				 {
				  System.out.println("E' Ferragosto");
				  
				 }
					  
		  else  if (x == 1 && y == 1)
					 {
					  System.out.println("E' Capodanno");
					 }
					   
			else { System.out.println("E' feriale");
			  
			}
			else   System.out.println("formato data non corretto");
			
			}}}

		  
			
	
	
