import java.util.Scanner;

public class Bisestile {
 
 /*Scrivere un programma Ordina3Valori che chiede all’utente 
   di inserire tre numeri interi e stampa su un’unica riga 
   in ordine crescente.*/

 public static void main(String[] args) {

     int x, y, z, maggiore, primonumero = 0, secondonumero = 0, terzonumero = 0;
     Scanner numeroordinato = new Scanner(System.in); 
     
     System.out.println("scrivi 1° numero intero:");
     x = numeroordinato.nextInt(); 
     System.out.println("scrivi 2° numero intero:");
     y = numeroordinato.nextInt(); 
     System.out.println("scrivi 3° numero intero:");
     z = numeroordinato.nextInt(); 
     
     if (x <  y && x < z) 
     primonumero = x;
     else if (x >  y && x > z) 
     terzonumero = x;
     else
     secondonumero = x;
     
         if (y <  x && y < z) 
      primonumero = y;
         else if (y >  x && y > z) 
      terzonumero = y;
      else
      secondonumero = y;
      
      
       if (z <  x && z < y) 
       primonumero = z;
       else if (z >  x && z > y) 
       terzonumero = z;
       else
       secondonumero = z;

        System.out.println(primonumero);
        System.out.println(secondonumero);
        System.out.println(terzonumero);
 }

}




	


