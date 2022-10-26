import java.util.Scanner;

public class Rettangolo {

int base;
int altezza;

public Rettangolo(int base, int altezza)
{
    this.base = base;
    this.altezza = altezza;
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
	 
	
   
     Rettangolo re1 = new Rettangolo(10,30);
     Rettangolo re2 = new Rettangolo(40,50);
     Rettangolo re3 = new Rettangolo(10,15);
     System.out.println("Rettangolo 1  Area: " + re1.area() + " Perimetro: "+ re1.perimetro());
     System.out.println("Rettangolo 2  Area: " + re2.area() + " Perimetro: "+ re2.perimetro());
     System.out.println("Rettangolo 3  Area: " + re3.area() + " Perimetro: "+ re3.perimetro());
 }
}