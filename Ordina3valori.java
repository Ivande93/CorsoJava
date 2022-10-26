import java.util.Scanner;

public class Ordina3valori {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Scrivi il 1° n°:");		
		int a = sc.nextInt();		
		Scanner sc2 = new Scanner(System.in);		
		System.out.println(" Scrivi il 2° n°:");		
		int b = sc2.nextInt();		
		Scanner sc3 = new Scanner(System.in);		
		System.out.println(" Scrivi il 3° n°:");		
		int c = sc3.nextInt();
		if ( a < b && b > c && c < a  ){ 			
		System.out.println(b + " "+ a + " " + c );}		
		else if ( b < a && a > c && b < c ){			
			System.out.println(a + " "+ c + " " + b );}		
		else if ( c < b && b > a && c < a){ 			
			System.out.println(b + " "+ c + "" +a );}		
		else if ( a < b && b < c ){ 			
			System.out.println(c + " "+b+" "+ a );}		
		else if ( b < a && a > c && b > c){ 			
			System.out.println(a+" "+ b +" "+c);}		
		else System.out.println ( c +" "+ a + " " + b );		
	}
}
	        

		
	


