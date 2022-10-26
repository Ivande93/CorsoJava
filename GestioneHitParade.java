
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class GestioneHitParade {

 public static void main(String[] args) {

  ArrayList <Hit> Hit = new ArrayList();
  Hit h1= new Hit ("Rhove","Shakerando ");
  Hit h2= new Hit ("Mahmood & Blanco","Brividi ");
  Hit h3= new Hit ("Dargen D'Amico","Dove si balla");
  Hit h4= new Hit ("Elodie","Bagno a mezzanotte");
  Hit h5= new Hit ("Sangiovanni","Farfalle");
  Hit h6= new Hit ("Harry Styles","As it was");
  Hit h7= new Hit ("Jovanotti","I love you baby");
  Hit h8= new Hit ("Irama","Ovunque sarai");
  Hit h9= new Hit ("Fabri Fibra","Propaganda");
  Hit h10=new Hit ("Marracash","Crazy love");
Hit.add(h1);
Hit.add(h2);
Hit.add(h3);
Hit.add(h4);
Hit.add(h5);
Hit.add(h6);
Hit.add(h7);
Hit.add(h8);
Hit.add(h9);
Hit.add(h10);

HitParade a =new HitParade(Hit);

int x=0;
do {
 
 System.out.println("Digita 1 per inserire una Hit");
 System.out.println("Digita 2 per rimuovere una Hit");
 System.out.println("Digita 3 per scambiare una Hit");
 System.out.println("Digita 4 per stampare tutte le Hit");
 System.out.println("Digita 5 cerca per titolo o autore");
 System.out.println("Digita 6 per salvare HitParade.dat");
 System.out.println("Digita 7 per leggere HitParade.dat");
 System.out.println("Digita 0 per chiudere programma");
 Scanner sc =new Scanner( System.in);
    x = sc.nextInt();
 
 if (x==1) {
  System.out.println("Inserisci una nuova Hit!");
  System.out.println("Inserisci titolo");
 Scanner sc1= new Scanner(System.in);
 String titolo=sc1.nextLine();
 System.out.println("Inserisci l'autore");
 
 Scanner sca=new Scanner(System.in);
 String autore=sca.nextLine();
 System.out.println("Inserisci la posizione");
 
 Scanner scb=new Scanner(System.in);
 int posizione=scb.nextInt(); 
 a.inserisci(new Hit(autore,titolo),posizione);}
  
 
 else if (x==2) {
  for (Hit aHit:Hit );{
   System.out.println(Hit);
  System.out.println("Rimuovi una Hit!");
  Scanner sc2= new Scanner(System.in);
  int titolo=sc2.nextInt();
    a.rimuovi(titolo);}}
 
 else if (x==3) {
  System.out.println("Scambia una Hit ");
  System.out.println("Digita la posizione 1");
  Scanner sc3=new Scanner(System.in);
  int posizione1=sc3.nextInt();
  System.out.println("Digita la posizione 2");
  Scanner sc4=new Scanner(System.in);
  int posizione2=sc4.nextInt();
  
 a.scambio(posizione1, posizione2);} 
 
 else if (x==4) {
     for (int i =0;i<Hit.size(); i++) {
       System.out.println(Hit.get(i));      
   }}
     else if (x==5) {
      System.out.println("cerca titolo o autore");
     Scanner sc5=new Scanner(System.in);
     String cerca=sc5.nextLine();
     a.ricerca(cerca);
     
     }
 
    else if (x==6) {
        try { 
            ObjectOutputStream out = 
            new ObjectOutputStream ( new BufferedOutputStream ( 
            new FileOutputStream ("hit2022.dat" ))); 
            out . writeObject (Hit); 
            
            out . close (); 
            } catch ( IOException e1) { 
            System . out . println (" ERRORE di I/O"); 
            System . out . println (e1 ); 
            }
    }
    else if (x==7) {
        try {FileInputStream fileStream = new FileInputStream("hit2022.dat"); 
        // Creating an object input stream
        ObjectInputStream objStream = new ObjectInputStream(fileStream); 

        // Using the readObject() method 
        Hit = (ArrayList<Hit>) objStream.readObject(); 
        



        } 
        catch (Exception e1) { 
        e1.getStackTrace(); 
        }
 
    } 
} 
while (x!=0);
 }

}
