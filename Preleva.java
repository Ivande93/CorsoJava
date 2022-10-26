import java.util.Scanner;

public class Preleva {
	

static 

int saldo = 3000;

static void Preleva1 (int x) {
 
 saldo = saldo - x;
}
public static void main(String[] args) {
 
			
int prelievo;
Scanner sc = new Scanner(System.in); 
System.out.println("Quanto vuoi prelevare ?"); 
prelievo = sc.nextInt();

if (saldo >= 0 && prelievo <= saldo) {
	  Preleva1(prelievo);
	  System.out.println("Il tuo saldo è:  " + saldo);
	 } else {
	  System.out.println("Qui non regaliamo soldi !");
	 }
}}
	
		


