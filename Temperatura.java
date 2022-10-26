import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
	
		double  [] numeri = { 15.5,20.0,22.5,25.2,28.5,28.3,29.5,29.0,33,35,35,40};
		double somma=0;		
		double media=0;
		for (int i =0; i<numeri.length; i++) {somma=somma+numeri[i]; }
	media=somma/numeri.length;
		
        
      
       

       for (int i = 0; i < numeri.length ; i ++ ){
    	   if (numeri[i]>media)
    	   {
    		   System.out.println(numeri[i]+" "+ "La temperatura è superiore alla media");
    	   }
    	   else if ( numeri[i]==media)
    	   {
    		   System.out.println(numeri[i]+" "+"La temperatura è uguale alla media");
    		   
    	   }
    	   else{
    		   System.out.println(numeri[i]+" "+"La temperatura è minore alla media");
       }
    	
      
       }

       }
	
	}


