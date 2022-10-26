import java.util.ArrayList;
public class ArrayDinamici {
	public static void main(String[] args) {
		 
		 ArrayList <Integer> numeri = new ArrayList();
		 
		 // inserire elementi nell'array
		 numeri.add(2);
		 numeri.add(20);
		 numeri.add(2, 40);
		 numeri.add(21);
		 numeri.add(28);
		 numeri.add(30);
		 
		 // cambiare il valore di un elemento
		 numeri.set(0, 3);
		 System.out.println(numeri.get(0));
		 
		 // rimuovere un elemento
		 numeri.remove(2);
		 
		    //ritorna la lunghezza dell'array
		 numeri.size();
		 System.out.println(numeri.size());
		 
		 for (int i = 0; i < numeri.size(); i++) {
		  System.out.println(numeri.get(i));
		 }		 
		}}
ArrayList <String> desidera= new ArrayList();  

Scanner sc = new Scanner(System.in);   
System.out.println("Digitare le 10 desiderata: ");
String input;

for (int i = 0; i <10; i++) {
    String x  = sc.nextLine();
    desidera.add(x);}
do {Scanner myObj = new Scanner(System.in);
System.out.print("Procedere scegliendo l'operazione/i: ");
input = myObj.nextLine();
 switch (input) {
     case "S": Scanner p1=new Scanner(System.in);
        System.out.println("Posizione 1: ");
        int n=p1.nextInt();
        Scanner p2=new Scanner(System.in);
        System.out.println("Posizione 2: ");
        int m=p2.nextInt();
        for (int i=n; i<=m; i++) System.out.println(desidera.get(i)); break;
       
     case "M": Scanner cambio=new Scanner(System.in);
        System.out.println("La parola sostitutiva è: ");
        String s=cambio.nextLine();
        
        Scanner mn=new Scanner(System.in);
        System.out.println("La posizione: ");
        int order=mn.nextInt();
        desidera.add(order, s); break;
     case "T":
    ; break;
     case "E": for(int i=0; i<desidera.size();i++)
     {System.out.println(desidera.get(i));} ; break;}}
while (!input.equalsIgnoreCase("E"));

