import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
	
		 Scanner sc = new Scanner(System.in); {
				System.out.println("Inserire N°1  :");
				
				int x = sc.nextInt();	
				Scanner sc1 = new Scanner(System.in); {
					
					System.out.println("Inserire N°2 :");
				int y = sc1.nextInt();
				
	Scanner sc2 = new Scanner(System.in); {
					
					System.out.println("quale operazione eseguire ?  :");
					System.out.println("1 Somma  ");
					System.out.println("2 Sottrazione ");
					System.out.println("3 Moltiplicazione ");
					System.out.println("4 Divisione  ");
				int z = sc2.nextInt();
			
		    switch (z ) {
		      case 1:
		        System.out.println(x+y +" "+ " é la somma ");
		        break;
		      case 2:
		        System.out.println(x-y+" "+ "è la sottrazione");
		        break;
		       case 3:
               System.out.println(x*y +" "+ "è la moltiplicazione");
              break;
		       case 4:
	               System.out.println(x/y +" "+ "è la divisione"+" "+ x%y +" " + " è il resto");
	               break;
		       default: 
			        System.out.println("Operazione errata!");
			        break;
		    }
	 }
				 }
		 }
	 }
}
	
		
	
	

