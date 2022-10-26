import java.util.Scanner;

public class ContoBancario {
String cognome;
static int Saldo;


public  ContoBancario(String cognome, int Saldo) {
	  

	  this.cognome = cognome;
	  this.Saldo = Saldo;
}
public static int prelievo(int preleva ) {
	 Saldo= Saldo-preleva; 
	 return Saldo;
	  
	 }
public int versamento (int versa) {
	Saldo= Saldo+versa;
	return Saldo;
	  
	
	 }

public String toString() {
	  
	  return (" Cognome: " + cognome + " Saldo:  " + Saldo );
	 }


	public static void main(String[] args) {
		

		Scanner sc =new Scanner( System.in);
		 System.out.println("inserisci Cognome:");
		  
		 String cognome = sc.nextLine();
		 
		 Scanner sc1 =new Scanner( System.in);
		 System.out.println("inserisci il tuo credito");
		 int credito=sc1.nextInt();
		
		 ContoBancario utente1=new ContoBancario(cognome,credito);
		 
		 
		
		  System.out.println(cognome + " " + credito);

		  System.out.println("Buongiorno e benvenuto !"); 
		  System.out.println("cosa desideri fare ?");
				  
				  
				
				  int x=0;
				  do   {
			         System.out.println("1 Versa  ");
			         System.out.println("2 Preleva ");
			         System.out.println("3 per ottenere il saldo complessivo");
			         System.out.println("4 Termina");
			         Scanner sc2 =new Scanner( System.in);
			         x = sc2.nextInt();			 
		             int prelievo;
				     if (x==1) {
			         System.out.println("Versa");
			         Scanner sc4 = new Scanner(System.in); 
				     System.out.println("Quanto vuoi versare ?"); 
				     int versa = sc4.nextInt();
				    utente1.versamento(versa);					 					 
				     System.out.println("CIAO GRAZIE");
				     }							        
				     else if (x==2) {
			         System.out.println("Prelievo");
			         Scanner sc3 = new Scanner(System.in); 
				     System.out.println("Quanto vuoi prelevare ?"); 
				     prelievo = sc3.nextInt();				    
				     if (utente1.Saldo>prelievo) {
				     prelievo(prelievo);				    
				     } else 
				     System.out.println("Qui non regaliamo soldi !");}			        	
				     else if (x==3) {
				         System.out.println("Il tuo saldo complessivo è:"+" "+ utente1.Saldo);
				         }				    				     				            
				     }	while (x!=4);{
					  
						  System.out.println("Programma terminato");}
				     }}
			        	     	
	





















