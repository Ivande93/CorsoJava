import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class StringheSalvate {

 public static void main(String[] args) {
  int x = 0;
  String stringa = null;
  do {
   
   
   
   System.out.println("Cosa vuoi fare 1 per importare, 2 per salavare,"
     + "3 per scrivere una stringa, 4 per stampare, 0 per terminare ");
   Scanner sc1 = new Scanner(System.in);
   x = sc1.nextInt(); 
   
   if (x == 3) {
    
    Scanner sc = new Scanner(System.in); 
    System.out.print("Inserisci una frase o una parola: "); 
     stringa = sc.nextLine(); }
    
   
  
  else if (x ==2) {
   
   try { 
    ObjectOutputStream out = 
    new ObjectOutputStream ( new BufferedOutputStream ( 
    new FileOutputStream ("stringa.dat" ))); 
    out . writeObject (stringa); 
    
    out . close (); 
    } catch ( IOException e1) { 
    System . out . println (" ERRORE di I/O"); 
    System . out . println (e1 ); 
    } 
   
   
  }
   
  else if (x ==1) {try 
  {FileInputStream fileStream = new FileInputStream("stringa.dat"); 
  // Creating an object input stream
  ObjectInputStream objStream = new ObjectInputStream(fileStream); 

  // Using the readObject() method 
  stringa = (String) objStream.readObject(); 
  



  } 
  catch (Exception e1) { 
  e1.getStackTrace(); 
  }}
  else if (x == 4) {
  System.out.println(stringa) ;
  }

 

}while (x != 0); }}
