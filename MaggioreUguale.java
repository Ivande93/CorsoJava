import java.util.Scanner;

public class MaggioreUguale {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner( System.in);
		 System.out.println("scegli un numero da 0 a 4:");
          int A=sc.nextInt();
          switch (A ) {
          case 0:
          System.out.println("ZERO");
          break;
	      case 1:
	      System.out.println("UNO");
	      break;
	      case 2:
	      System.out.println("DUE");
	      break;
	      case 3:
          System.out.println("TRE");
          break;
	      case 4:
          System.out.println("QUATTRO");
          break;
	      default: 
		  System.out.println("ERRORE!");
		  break;}}}


