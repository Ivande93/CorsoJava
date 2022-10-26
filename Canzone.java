import java.util.ArrayList;
import java.util.Scanner;

public class Canzone {

	String titolo;
	String autore;
	int anno;
	
	public Canzone (String titolo, String autore, int anno) {
		this.titolo=titolo;
		this.autore=autore;
		this.anno=anno;}
	public  void anno(int anno) {
		  
		  System.out.println(anno);
		 
		 }
	public String toString() {
		  
		  return ("Titolo: " + titolo + " Autore: " + autore + " Anni:  " + anno );
		 }
	
	public static void main(String[] args) {
		
		Canzone canzone1= new Canzone ("A te","Jovanotti",2008);
		Canzone canzone2= new Canzone ("La Cura","Franco Battiato",1996);
		Canzone canzone3= new Canzone ("Il mondo che vorrei","Vasco Rossi",2008);
		Canzone canzone4= new Canzone ("Favola","Modà",2003);
		Canzone canzone5= new Canzone ("Piove","Alex Britti",2009);
		Canzone canzone6= new Canzone ("It's My Life","Bon Jovi",2000);
		Canzone canzone7= new Canzone ("Nuova luce","Francesco Renga",2017);
		Canzone canzone8= new Canzone ("I giardini di marzo","Lucio Battisti",1972);
		Canzone canzone9= new Canzone ("Il ragazzo della via Gluck","Adriano Celentano",1966);
		Canzone canzone10= new Canzone ("Ma che bontà","MIna",1977);
		
		ArrayList <Canzone> Canzone = new ArrayList();
		
		
		
		Canzone.add(canzone1);
		Canzone.add(canzone2);
		Canzone.add(canzone3);
		Canzone.add(canzone4);
		Canzone.add(canzone5);
		Canzone.add(canzone6);
		Canzone.add(canzone7);
		Canzone.add(canzone8);
		Canzone.add(canzone9);
		Canzone.add(canzone10);
					
				  int x=0;
		  do   {
	         System.out.println("1 Stampa tutte le canzoni  ");
	         System.out.println("2 Cerca una canzone per anno ");
	         System.out.println("3 Inserisci una nuova canzone");
	         System.out.println("4 Termina");
	         
	         Scanner sc =new Scanner( System.in);
	         x = sc.nextInt();	
	         if (x==1) {
	        	 for (int i =0;i<Canzone.size(); i++) {
				     System.out.println(Canzone.get(i));	     
					}}
	         else if (x==2)
	         { Scanner sc5 =new Scanner( System.in);	
        	 System.out.println("Cerca per anno");				 				
			 int trova=sc5.nextInt();
	        	 int cont=0;
					for (int i =0; i<Canzone.size();i++)
					{
						if ( Canzone.get(i).anno==trova) {
						System.out.println(Canzone.get(i));
						
						} } }
	   	         
	         else if (x==3) {
	        	 Scanner sc1 = new Scanner(System.in); 		
	    		 System.out.print("inserisci nome della Canzone");
	    		  String NomeCanzone = sc1.nextLine();
	    		  
	    		  Scanner sc2 = new Scanner(System.in); 		
	    			 System.out.print("inserisci l'autore");
	    			  String Autore = sc2.nextLine();
	    			  
	    			  Scanner sc3 = new Scanner(System.in); 		
	    				 System.out.print("inserisci l'anno");
	    				  int AnnoCanzone = sc3.nextInt();
	    				  Canzone b = new Canzone (NomeCanzone,Autore,AnnoCanzone);
	    				  Canzone.add(b);
	         }}	
		  while (x!=4);{
			  
				  System.out.println("Programma terminato");}		}}
