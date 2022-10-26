import java.util.Scanner;

public class PositivoNegativo {

	public static void main(String[] args) {
		
		 Scanner sc =new Scanner( System.in);
		 System.out.println("Numero 1:");
		 int a= sc.nextInt();
		 Scanner sc1 =new Scanner( System.in);
		 System.out.println("Numero2:");
		 int b= sc1.nextInt();
		 int S= a+b;
		 if (a>=0) {
			 System.out.println("E' positivo:"+ a);		 
		 }
		 else if (b>=0) {
			 System.out.println("E' Positivo"+ b);
	}
		 else if (S>=0) {
			 System.out.println("La somma è:"+ S);
		 }
		
		 } 
	
		 
		 
}
	

