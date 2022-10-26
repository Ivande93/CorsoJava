import java.util.Scanner;
 

public class Imput {

	public static void main(String[] args) {
		
		 Scanner sc =new Scanner( System.in);
		  System.out.println("inserisci il tuo nome:");
		  
		 String nome = sc.nextLine();
		
		 Scanner sc1 =new Scanner( System.in);
		  System.out.println("inserisci l'età:");
		  
		  int anni = sc1.nextInt();
              
			  System.out.println (nome + " "+ anni + "anni" );
			
			 
			 System.out.println ("Tra 10 anni avrai " + (anni + 10));
			 
			 
			 
	}

}
