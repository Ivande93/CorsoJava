import java.util.Scanner;

public class SommaDiQuattro {

	public static void main(String[] args) {
	
		 Scanner myObj = new Scanner(System.in);

		   Scanner myObj1 =new Scanner( System.in);
			  System.out.println("Inserisci valore 1:");
			 int valore1 = myObj1.nextInt();
		
			   Scanner myObj2 =new Scanner( System.in);
				  System.out.println("Inserisci valore 2:");
				 int valore2 = myObj2.nextInt();
				 
				 Scanner myObj3 =new Scanner( System.in);
				  System.out.println("Inserisci valore 3:");
				 int valore3 = myObj3.nextInt();
				 
				 Scanner myObj4 =new Scanner( System.in);
				  System.out.println("Inserisci valore 4:");
				 int valore4 = myObj4.nextInt();
				 
				 System.out.println("il totale è " + (valore1 + valore2 + valore3 + valore4));
	}

}
