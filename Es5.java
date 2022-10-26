import java.util.Scanner;

public class Es5 {

	public static void main(String[] args) {
		 Scanner sc =new Scanner( System.in);
		 System.out.println("Numero 1:");
		 int a= sc.nextInt();
		 Scanner sc1 =new Scanner( System.in);
		 System.out.println("Numero2:");
		 int b= sc1.nextInt();
		 int R=a+b;
		 if (a > 0 || b > 0) {
		   
		   System.out.println(R +" "+"E' il risultato");
		 }
		 else System.out.println ("Non valido");
		 
	}

}
