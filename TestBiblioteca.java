import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class TestBiblioteca {

	public static void main(String[] args) {
		
		ArrayList  <Libro> Libro= new ArrayList();

		Libro a=new Libro("Nella teca","Serena Barsottelli");
		Libro b=new Libro("Una manciata di coriandoli","Mara Genotti");
		Libro c=new Libro("Breve storia della vita privata","Bill Bryson");
		Libro d=new Libro("Nessun incontro è un caso","Kay Pollak");
		Libro e=new Libro("Il male e come trasformarlo","Eva Pierrakos");
		Libro f=new Libro("Le coordinate della felicità","Gianluca Gotto");
		Libro g=new Libro("Le avventure di Gordon Pym","Edgar Allan Poe");
		Libro.add(a);
		Libro.add(b);
		Libro.add(c);
        Libro.add(d);
        Libro.add(e);
        Libro.add(f);
        Libro.add(g);
        Biblioteca a1 =new Biblioteca(Libro);
        
int x=0;
do {	
System.out.println("Digita 1 per inserire un nuovo libro");
System.out.println("Digita 2 per ricercare un libro");
System.out.println("Digita 3 per prenotare un libro");
System.out.println("Digita 4 per Stampare tutti i libri");
System.out.println("Digita 6 per salvare HitParade.dat");
System.out.println("Digita 7 per leggere HitParade.dat");
System.out.println("Digita 0 per chiudere programma");
Scanner sc1= new Scanner(System.in);
x=sc1.nextInt();
if (x==1) {
System.out.println("Inserisci un libro!");

System.out.println("Inserisci il titolo");
Scanner sc4= new Scanner(System.in);
String titolo=sc4.nextLine();

System.out.println("Inserisci l'autore");
Scanner sca=new Scanner(System.in);
String autore=sca.nextLine();

a1.inserisci(new Libro(titolo,autore));
}
else if (x==2) {
    System.out.println("cerca titolo o autore");
   Scanner sc2=new Scanner(System.in);
   String cerca=sc2.nextLine();
   a1.ricerca(cerca);
  
   }
else if (x==3) {
	System.out.println("Prenotazione!");
	System.out.println("Inserisci il titolo da prenotare!");
	Scanner sc3= new Scanner(System.in);
	String prenotazione=sc3.nextLine();
    a1.PrenotaLibro(prenotazione);
    System.out.println("Prenotazione effettuata!");
}
else if (x==4) {
    for (int i =0;i<Libro.size(); i++) {
      System.out.println(Libro.get(i));      
  }}
else if (x==6) {
    try { 
        ObjectOutputStream out = 
        new ObjectOutputStream ( new BufferedOutputStream ( 
        new FileOutputStream ("Biblioteca.dat" ))); 
        out . writeObject (a1); 
        
        out . close (); 
        } catch ( IOException e1) { 
        System . out . println (" ERRORE di I/O"); 
        System . out . println (e1 ); 
        }
}
else if (x==7) {
    try {FileInputStream fileStream = new FileInputStream("Biblioteca.dat"); 
    // Creating an object input stream
    ObjectInputStream objStream = new ObjectInputStream(fileStream); 

    // Using the readObject() method 
    a1 = (Biblioteca) objStream.readObject(); 
    
    } 
    catch (Exception e1) { 
    e1.getStackTrace(); 
    }

} 
}
while (x!=0);
	
}
}


