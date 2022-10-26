import java.util.ArrayList;
import java.util.Scanner;

public class Memo {

	public static void main(String[] args) {
		
		ArrayList <String> parole = new ArrayList();
		
		System.out.println("Benvenuto");
		 Scanner sc = new Scanner(System.in); 		
		 System.out.print("Inserisci 10 parole");
		 
		 for (int i = 0; i <10; i++) {
			 String x  = sc.nextLine();			 
			parole.add(x);}
int p =0;
	
	
	do {
				System.out.println("scegli cosa fare");
				System.out.println("0, il programma legge due posizioni n e m e stampa tutti gli elementi dell’array il cui indice `e compreso tra n e m;");
				System.out.println("1,  il programma legge una posizione n e una stringa s che assegna alla cella n dell’array;");
				System.out.println("2, il programma legga una stringa s e stampa la prima posizione dell’array che la contiene, o un messaggio di errore se nessuna cella la contiene;");
				System.out.println("3, il programma stampa il contenuto dell’array e termina");
				Scanner sc2 =new Scanner( System.in);
				
			     p = sc2.nextInt();					 
			 
			 if (p==0) {
				 System.out.print("posizione 1 ");
				 Scanner sc3 =new Scanner( System.in);					
				 int Posizione1 = sc3.nextInt();
				
				 System.out.print("posizione 2");
				 Scanner sc4 =new Scanner( System.in);					
				 int Posizione2 = sc4.nextInt();
				
				 
				 for (int i=Posizione1; i<=Posizione2; i++)
					 
				 System.out.println(parole.get(i));
			 }
			 else if (p==1) {
				 Scanner sc5=new Scanner(System.in);
			        System.out.println("metti la nuova parola ");
			        String scambio=sc5.nextLine();
			        
			        Scanner sc6=new Scanner(System.in);
			        System.out.println("in posizione ");
			        int ordine=sc6.nextInt();
			        parole.set(ordine, scambio);
					 
				 System.out.println(parole.get(ordine));
			 }
             else if (p==2) {
            	 Scanner sc5 =new Scanner( System.in);	
            	 System.out.println("Trova la parola");				 				
				 String trova=sc5.nextLine();	
				 int cont=0;
				for (int i =0; i<parole.size();i++)
				{
					if ( parole.get(i).equalsIgnoreCase(trova)) {
					cont ++;	
					System.out.println("Parola trovata"+" "+trova);}
					
				}
				 if (cont==0) {
					 System.out.println("parola non trovata");}
				 
			 }
             else if (p==3){
            	 					
				
              	for(int i=0; i<parole.size();i++)
                System.out.println(parole.get(i));}	
	}
	             while (p!=3);{
	            	 System.out.println("Programma terminato!");
	            	 
	             }
	
			 
			 
	}}
	


