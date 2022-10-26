import java.util.Scanner;

public class DomandaRisposta {

	public static void main(String[] args) {
	   
		String frase;
		Scanner sc =new Scanner( System.in);
		System.out.println("scrivi:");			
	    frase = sc.nextLine();
	    
	 int TuttalaFrase=(frase.length()-1);
	 char ultimocarattere=frase.charAt(TuttalaFrase);		
      if (ultimocarattere=='!') {
    	  System.out.println("Hai ragione");
      }
    	  
      else if ( ultimocarattere=='?') {
    	  System.out.println("Non saprei");}
      
      else {
    	  System.out.println("mmm , non mi convince");
      }
      
      }
	}


