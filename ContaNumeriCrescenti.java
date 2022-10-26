import java.util.Scanner;

public class ContaNumeriCrescenti {

	public static void main(String[] args) {
		
		 int x=0;
		 int temp;		
		 int cont=0;
		do {
			temp=x;
			cont++;
			Scanner sc =new Scanner( System.in);
			System.out.println("Inserisci un numero:");
			x = sc.nextInt();			
}
		while ( temp<=x );
		
		System.out.println(cont-1);
	}

}
