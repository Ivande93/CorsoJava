import java.util.ArrayList;
import java.util.Scanner;

public class MediaVettore {
static double numeri;

public MediaVettore (double numeri) {
	this.numeri=numeri;}
	
public static void numero(double numeri) {
	  
	  System.out.println(numeri);
}
public String toString() {
	return ("Media dei numeri"+numeri);
}

	public static void main(String[] args) {
				
		ArrayList <Double> Numero = new ArrayList();
			
	    double b=0;
		int cont=0;
		double somma=0;
		
		  do {
			  Scanner sc3 = new Scanner(System.in);
	         System.out.println("inserisci un nuermo con la virgola ");
	         
				 b = sc3.nextDouble();			 
				Numero.add(b);
	     
			 somma=somma+b;
			 cont++;
			 
		  
		  }
		while (b!=0);
		if (cont>0) {
	   double numeri=(Numero.size()-1);
	   double media = somma/numeri;
	   System.out.println("La somma è: "+ somma);
	   System.out.println("la media è:"+media);
		}	       
}}





