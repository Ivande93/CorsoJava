import java.util.ArrayList;
import java.util.Scanner;

public class TestUtenteBiblioteca {

	public static void main(String[] args) {
	ArrayList  <UtenteBiblioteca> Prenotati= new ArrayList();
	
	UtenteBiblioteca b =new UtenteBiblioteca(Prenotati);
	int x=0;
	do {	
		
		
		System.out.println("Digita 1 per creare un nuovo utente");	
		System.out.println("Digita 2 per prenotare un libro");
		System.out.println("Digita 3 per Stampare tutti i libri");	
		System.out.println("Digita 0 per chiudere programma");
		Scanner sc2= new Scanner(System.in);
		x=sc2.nextInt();
		
		if (x==1) {
		
		Scanner sc =new Scanner( System.in);
	 System.out.println("Inserisci nome:");	  
	 String nome = sc.nextLine();
	 Scanner sc1 =new Scanner( System.in);
	 System.out.println("inserisci cognome");	
	 String cognome = sc1.nextLine();	 
	 System.out.println("Benvenuto!");	 
	 b.CreaUtente(nome, cognome);
	 

	}}
	while(x!=0);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	

}
