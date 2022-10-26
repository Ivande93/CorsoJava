import java.util.Scanner;

public class Giudizio {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print( "Inserisci voto: ");
		
		int voto =sc.nextInt();	
		
	    if (voto<=0&&voto<=30){
		System.out.println("Numero errato!!");}		
		else if (voto>0&&voto<17) {
	    System.out.println("Esame non superato.");}
		else if (voto>18&&voto<24) {
		System.out.println("Giudizio: Sufficiente");
		}
		else if ( voto>25&&voto<30) {
		System.out.println("Giudizio: Buono");}

	    
		System.out.print( "Vuoi registrare il voto ?  ");
		Scanner sc1 = new Scanner(System.in);
		int Reg =sc1.nextInt();
		if (voto<18&&voto<33) {
		
		switch (Reg) {
	    case 0:
	        System.out.println( "voto non registrato");
	        break;
	      case 1:
	        System.out.println("voto registrato");
	        break;
	    
	       default: 
		       
	    }
 }
			 }
	 
		
		
		
	    
	
	}


