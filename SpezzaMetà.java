import java.util.Scanner;

public class SpezzaMetà {

	public static void main(String[] args) {
		String frase;
		Scanner sc =new Scanner( System.in);
		System.out.println("scrivi:");			
		String frase1 = sc.nextLine();		 
		System.out.println(frase1.substring(0,frase1.length()/2));
	    System.out.println(frase1.substring(frase1.length()/2,frase1.length()));
	}

}

