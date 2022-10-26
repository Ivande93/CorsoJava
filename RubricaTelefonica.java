import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class RubricaTelefonica {

	public static void main(String[] args) {
		
		ArrayList <Contatto> Contatto = new ArrayList();

		
		Contatto a= new Contatto("Mario",320338453);
		Contatto b= new Contatto("Angela",334758699);
		Contatto c= new Contatto("Irene",338439954);
		Contatto d= new Contatto("Luigi",328447382);
		Contatto e= new Contatto("Bianca",34556584);
		Contatto f= new Contatto("Carlo",348675483);
		Contatto.add(a);
		Contatto.add(b);
		Contatto.add(c);
		Contatto.add(d);
		Contatto.add(f);
		Contatto.add(e);
		
		Contatto a1 =new Contatto (Contatto);
		int x=0;
		do {
			 System.out.println("1 Cerca per nome");
	         System.out.println("2 Aggiungi contatto");
	         System.out.println("3 per rimuovere un contatto");
	         System.out.println("4 Stampa tutti i contatti");
	         System.out.println("Digita 5 per salvare Rubrica.dat");
	         System.out.println("Digita 6 per leggere Rubrica.dat");
	         System.out.println("0 Termina");
	         Scanner sc =new Scanner( System.in);
	         x = sc.nextInt();
	         
	         
		if (x==1){
			Scanner sc1 =new Scanner( System.in);	
   	         System.out.println("Cerca per Nome");				 				
		     String nomedatrovare=sc1.nextLine();
       	     a1.ricerca(nomedatrovare);
       	     }
					
else if (x==2) {
Scanner sc2 = new Scanner(System.in); 		
 System.out.print("inserisci nome ");
String Ncontatto = sc2.nextLine();
		    			  
Scanner sc4 = new Scanner(System.in); 		
System.out.print("inserisci il numero");
int Nnumero = sc4.nextInt();
Contatto b1 = new Contatto (Ncontatto,Nnumero);
 Contatto.add(b1);
}
else if (x==3) {
for (Contatto aContatto:Contatto );{
System.out.println(Contatto);
System.out.println("Rimuovi un contatto");
Scanner sc2= new Scanner(System.in);
int nomedarimuovere=sc2.nextInt();
a.rimuovi(nomedarimuovere);
}
}
else if (x==4) {
for (int i =0;i<Contatto.size(); i++) {
System.out.println(Contatto.get(i));	     
}}
else if (x==5) {
try { 
ObjectOutputStream out = 
new ObjectOutputStream ( new BufferedOutputStream ( 
 new FileOutputStream ("Rubrica.dat" ))); 
  out . writeObject (Contatto); 
					            
out . close (); 
 } catch ( IOException e1) { 
System . out . println (" ERRORE di I/O"); 
System . out . println (e1 ); 
 }
}
else if (x==6) {
 try {FileInputStream fileStream = new FileInputStream("Rubrica.dat"); 
 // Creating an object input stream
 ObjectInputStream objStream = new ObjectInputStream(fileStream); 

// Using the readObject() method 
Contatto = (ArrayList<Contatto>) objStream.readObject(); 

} 
catch (Exception e1) { 
e1.getStackTrace(); 
}
					 
} 
}
while(x!=0);
{
}}}
	


