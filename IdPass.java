import java.util.Scanner;

public class IdPass {

	public static void main(String[] args) {
		 Scanner sc =new Scanner( System.in);
		 System.out.println("inserisci Cognome:");
		  
		 String cognome = sc.nextLine();
		 String cognomeGiusto ="Rossi";
		
		 Scanner sc1 =new Scanner( System.in);
		 System.out.println("inserisci password");
		 int passwordGiusta =12345;
		 int password = sc1.nextInt();

		 boolean ok = cognome.equalsIgnoreCase(cognomeGiusto);	 
	     if (password==passwordGiusta&&ok) {
		 System.out.println("Benvenuto!");	 
         }
		 else if (password==passwordGiusta&&ok==false) {
		 System.out.println("Cognome non riconosciuto!");
		 }		 
		 else if (password!=passwordGiusta&&ok) {
	     System.out.println("Password Sbagliata!");
		 }
	     else System.out.println("Dati errati");	
	}
}
