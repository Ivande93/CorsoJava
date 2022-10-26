import java.util.Scanner;

public class Crea {

	public static void main(String[] args) {
		
		
			
		int [] n = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
			
			
			
			Scanner sc =new Scanner( System.in);
			System.out.println("Inserisci un numero:");			
			int x = sc.nextInt();
			
			int presente=0;
			for (int i:n) {
				if (x==i) {presente = 1;
					System.out.print("E' presente!");}
}
			if(presente==1) {System.out.println("E' presente!");}
			else {System.out.println("Non presente!");
			}
	}}
	
			

	


