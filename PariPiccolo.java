import java.util.Scanner;

public class PariPiccolo {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in); {
			System.out.println(" Numero :");
			
			int numero =sc.nextInt();
		  

			 
		    if (numero % 2 == 0 && numero >=0 && numero <=100 )
		    {
		     System.out.println("E' pari e piccolo");
		    }
		    else if (numero % 2 == 0 && numero >=0 && numero >=100 )
		    {
		     System.out.println("E' pari e non è piccolo");
		    }
		    else if ( numero % 2 != 0 && numero >=0 && numero >=100 )
		    {
		     System.out.println("E' dispari  è non piccolo");
		    }
		    else if ( numero % 2 != 0 && numero >=0 && numero <=100 )
		    {
		     System.out.println("E' dispari  è piccolo");
		    }

	}
	}
}
