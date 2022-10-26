import java.util.Scanner;

public class Maggiore {

	public static void main(String[] args) {
		
int x = 5;
int y = 10;

	Scanner sc = new Scanner(System.in);
	System.out.println(" Scrivi un numero:");
	
	
	int numero = sc.nextInt();
	
	if ( numero >=5 && numero <=10) {
	 System.out.println("Compreso");
	}
	else System.out.println("Non compreso");
	
	}

}
