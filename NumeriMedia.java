import java.util.Scanner;

public class NumeriMedia {

	public static void main(String[] args) {
		   final int N = 5; 
	        int count = 1;   
	        int somma = 0;   
	        int num;         

	        for (count=1; count<=N; count++) {
	            System.out.print("Immetti un intero: ");
	            Scanner sc =new Scanner( System.in);
				System.out.println("Inserisci un numero:");
				num = sc.nextInt();	
	            somma = somma + num;
	        }
	        
	        System.out.println ("La somma e' " + somma);
	    }
	}