import java.util.Scanner;

public class Es1 {

	public static void main(String[] args) {
		
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Numero ore con virgola :");
			
			double ore = sc.nextDouble();
			
			int minuti = (int)(ore * 60);
     
			System.out.println ("le ore in minuti sono : " + (  minuti ));
		}
	}

}
