import java.util.Scanner;

public class Automobile {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		
		    String Modello;
		    
		    System.out.println("Quale modello vuo?  "); 
		    
		   Modello = myObj.nextLine();
		   
		   Scanner myObj1 = new Scanner(System.in);
			
		    String Marca;
		    System.out.println("Quale marca vuo?  ");
		   Marca = myObj1.nextLine();
		   
		   System.out.println( Marca  + " " + Modello);
		   
	}

}
