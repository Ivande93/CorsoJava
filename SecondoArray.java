import java.util.ArrayList;
import java.util.Scanner;

public class SecondoArray {

	public static void main(String[] args) {
		
		 ArrayList <Integer> numeri = new ArrayList();
	
		 Scanner sc = new Scanner(System.in); 		
		 System.out.print("Inserisci 10 numeri interi");
		 
		 for (int i = 0; i <3; i++) {
		 int x  = sc.nextInt();
		 if (x>=0) { 
		 numeri.add(x);
		 }}
		 for (int i = numeri.size()-1;i>=0; i--) {
	     System.out.println(numeri.get(i));	     
		}
		
	    }
        }
