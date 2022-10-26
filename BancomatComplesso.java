import java.util.Scanner;

public class BancomatComplesso {
	
	
	
	static int saldo = 3000;
	static void prelievo(int x) {	
	 saldo = saldo - x;
	}
	public static void main(String[] args) {
	
	int prelievo;
		
		Scanner sc =new Scanner( System.in);
		 System.out.println("inserisci Cognome:");
		  
		 String cognome = sc.nextLine();
		 String cognomeGiusto ="De Vivo";
		
		 Scanner sc1 =new Scanner( System.in);
		 System.out.println("inserisci password");
		 int passwordGiusta =12345;
		 int password = sc1.nextInt();

		 boolean ok = cognome.equalsIgnoreCase(cognomeGiusto);	 
	     if (password==passwordGiusta&&ok) 
	     {
		 System.out.println("Benvenuto!");	 
		 }
		 else if (password==passwordGiusta&&ok==false) {
		 System.out.println("Cognome non riconosciuto!");
		 }		 
		 else if (password!=passwordGiusta&&ok) {
	     System.out.println("Password Sbagliata!");
		 }
	     else System.out.println("Dati errati");	
	     Scanner sc2 =new Scanner( System.in);
		 System.out.println("cosa vuoi fare ?");
		 System.out.println("1 Preleva  ");
			System.out.println("0 Versa ");
		 int p = sc2.nextInt();
	             switch (p) {
		         case 0:
		         System.out.println("Versa");
		         Scanner sc4 = new Scanner(System.in); 
			     System.out.println("Quanto vuoi versare ?"); 
			     int versa = sc4.nextInt();
			     int versamento = saldo+versa;
				 System.out.println("Il tuo saldo è: "+" "+ versamento);
			     System.out.println("CIAO GRAZIE");			     
		         break;
		         case 1:
		         System.out.println("Prelievo");
		         Scanner sc3 = new Scanner(System.in); 
			     System.out.println("Quanto vuoi prelevare ?"); 
			     prelievo = sc.nextInt();
			    
			     if (saldo >= 0 && prelievo <= saldo) {
			     prelievo(prelievo);
			     System.out.println("Il tuo saldo è:  " + saldo);
			     } else {
			     System.out.println("Qui non regaliamo soldi !");}
		         break;		    
		         default:}	     	
	     }}
	   
		


		


