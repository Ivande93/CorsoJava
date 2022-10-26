import java.util.Scanner;

public class Lampadina {
	 // variabili di istanza
	String stato;
	int Maxclick;
	int Contclick;
	
	
	public Lampadina ( int Maxclick) {
		 // costruttore dove si inizializzano le variabili
		this.stato="off";
	    this.Maxclick=Maxclick;
	   this.Contclick=0;
	}
	//mteodi
	 public void click() {
		 if (Contclick<Maxclick) {
			 
		 
		 if (stato.equals("on")) {
			 stato=("off");
			 Contclick++;			 
		 }
		 else {
			 stato=("on");
			 Contclick++;
			 }}
		 else {
			 stato=("Rotta");
			 
		 }
		 
	 }
	 public String toString() {
		 // questo metodo ci permette di rappresentare in forma stampabile le variabili 
		 // che rappresentano l'oggetto
		  return ("La lampadina è :"+stato );
		 }
	public static void main(String[] args) {
	
   Lampadina b = new Lampadina(5);
		
        int scelta=0;
        System.out.println("Premi 1 per accedere e spegnere, 2 per visualizzare lo stato");

		do { Scanner sc1 = new Scanner(System.in); 		
		 System.out.print("Click");
		   scelta = sc1.nextInt();
			if (scelta==1) {
				 
			b.click();
		}
			else if (scelta==2) {
				System.out.println(b.stato);
			}		
		}while (scelta!=0);			
	}
}




