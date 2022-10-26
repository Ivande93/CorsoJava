import java.util.Scanner;

public class CartadiIdentita {

	public static void main(String[] args) {
		
		 Scanner myObj = new Scanner(System.in);

		    System.out.println("Inserisci Nome, Cognome, via e anni:");

		    
		    
		    String Nome = myObj.nextLine();
		     
		    
		    Scanner myObj1 = new Scanner(System.in);
		    
		    String Cognome = myObj1.nextLine();
		   
		    
		    Scanner myObj2 = new Scanner(System.in);
		    String Via = myObj2.nextLine();
		   
		    
		    Scanner myObj3 = new Scanner(System.in);
		    int Eta = myObj3.nextInt();
		    

		    System.out.println ("Nome" +" "+ Nome +" "+"Cognome"+" "+ Cognome +" "+"Via"+" "+  Via +" "+"Età"+ Eta);
		    
		   
		  
	}
	

}
