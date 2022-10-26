import java.util.Scanner;

public class SommaProdotto {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner( System.in);
		  System.out.println("Inserisci valore:");
		 int valore = sc.nextInt();
		 
		 Scanner myObj =new Scanner( System.in);
		  System.out.println("Inserisci valore 2:");
		 int valore2 = myObj.nextInt();
		 
		 System.out.println ( "La somma è "+ ( valore + valore2  ));
		 System.out.println ("Il prodotto è " + (valore * valore2));
	}

}
