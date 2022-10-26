import java.util.Scanner;

public class TestRettangolo extends Rettangolo {

public TestRettangolo(int base, int altezza) {
super(base, altezza);
	}
	
public int nuovabase()
{
return base;
}
public int nuovaaltezza()
{
return altezza;
}
public void imposta(int b, int a)
{
base = b;
altezza = a;
	  
}

public int area() 
{
return  base * altezza;
}

public int perimetro()
{
return (base + altezza) * 2;
}
	public static void main(String[] args) {
		
		 System.out.println("Rettangolo 1  Area: " + re1.area() + " Perimetro: "+ re1.perimetro());
	     System.out.println("Rettangolo 2  Area: " + re2.area() + " Perimetro: "+ re2.perimetro());
	     System.out.println("Rettangolo 3  Area: " + re3.area() + " Perimetro: "+ re3.perimetro());
	     
	     
		System.out.print("Ridimensiona base del rettangolo 1 : ");
		 Scanner sc = new Scanner(System.in); 	  
		 int b = sc.nextInt();	 	  
		 System.out.print("Ridimensiona l'altezza del rettangolo 1: "); 
		 Scanner sc1 = new Scanner(System.in); 	  
			  int a  = sc1.nextInt();
			  
			  Rettangolo rettangolonuovo = new Rettangolo(b,a);
			  System.out.println("Rettangolo 1 -> Area: " + rettangolonuovo.area() + " Perimetro: "+ rettangolonuovo.perimetro());			  	       
	}
}
