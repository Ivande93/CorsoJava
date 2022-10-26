import java.util.Scanner;

public class CreaSabrina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int x = 0;
		
		
		  System.out.println("Cerca il tuo numero");
		  Scanner s = new Scanner(System.in); 
		  int numDigitato = s.nextInt(); 
		  int arrayDiNumeri  [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		  
		
		  while(x < 10  ) {
		   if(arrayDiNumeri[x] == numDigitato) {
		    System.out.println("Numero trovato "+ arrayDiNumeri[x]);
		   }
		   x++;
		  }}}
	
	

