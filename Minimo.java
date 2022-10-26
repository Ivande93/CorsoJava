import java.util.Scanner;

public class Minimo {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in); 
  System.out.println("Inserire un numero :"); 

  int x = sc.nextInt();
  
  Scanner sc1 = new Scanner(System.in); 
  System.out.println("Inserire un numero :"); 

  int y = sc1.nextInt();
  
  Scanner sc2 = new Scanner(System.in); 
  System.out.println("Inserire un numero :"); 

  int p = sc2.nextInt();
  
  Scanner sc3 = new Scanner(System.in); 
  System.out.println("Inserire un numero :"); 

  int t = sc3.nextInt();
  
  Scanner sc4 = new Scanner(System.in); 
  System.out.println("Inserire un numero :"); 

  int d = sc4.nextInt();
  
  int minimo = minimo(x, y);
  minimo = minimo(minimo, p);
  minimo = minimo(minimo, t);
  minimo = minimo(minimo, d);
  System.out.println(minimo);
  
 }
 
 static int minimo(int x, int y) {
  
  int minimo;
  
  if (x < y) {
   
   minimo = x;
  }
  else {
   minimo = y;
  }
  return minimo;
  
 }

}
