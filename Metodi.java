import java.util.Scanner;

public class Metodi {


static void perimetroRettangolo(int x, int y) { 

int perimetro = (x * 2) + (y*2); 
System.out.println("perimetro rettangolo: " + perimetro); 
} 

public static void main(String[] args) { 

Scanner sc = new Scanner(System.in); 
System.out.print("lato rettangolo: "); 
int lato = sc.nextInt(); 

Scanner sc1 = new Scanner(System.in); 
System.out.print("base rettangolo: "); 
int base = sc.nextInt(); 

perimetroRettangolo(lato, base); 
areaRettangolo(lato, base); 
} 
static void areaRettangolo(int x, int y) { 
int area = x * y; 
System.out.println("area rettangolo: " + area); 
} 

}