import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

public  class Ricette implements ActionListener {

	String ricetta;
	String difficoltà;
	int temp;
	String categoria;
	
	
	public Ricette (String ricetta,String difficoltà, int temp,String categoria) {
	
		this.ricetta=ricetta;
		this.difficoltà=difficoltà;
		this.temp=temp;
		this.categoria=categoria;
	}
public Ricette(FinestradiRicetta finestradiRicetta) {
		// TODO Auto-generated constructor stub
	}
public  void temp(int temp) {
		  
		  System.out.println(temp);
		 
		 }
 public String toString() {
	 
	 return ("Ricetta: " + ricetta + " difficoltà: " + difficoltà + " tempo di cottura:  " + temp +" "+"minuti"+" " +" Categoria: " + categoria);
 }
	
	public static void main(String[] args) {
		
		  
	 
		Ricette ricetta1 = new Ricette("Carobonara", "Difficoltà media", 25, "Primi piatti");
		Ricette ricetta2 = new Ricette("Torta Paradiso", "Difficoltà facile", 50, "Dolce");
		Ricette ricetta3 = new Ricette("Pizzette di sfoglia", "Difficoltà facile", 30, "Antipasti");
		
		
		ArrayList <Ricette> Ricette = new ArrayList();
		  
		 Scanner sc = new Scanner(System.in); 		
		 System.out.print("inserisci nome della ricetta");
		  String Nomericetta = sc.nextLine();
		  
		  Scanner sc1 = new Scanner(System.in); 		
			 System.out.print("inserisci La difficoltà");
			  String Difficoltà = sc1.nextLine();
			  
			  Scanner sc2 = new Scanner(System.in); 		
				 System.out.print("inserisci Il tempo di cottura");
				  int TempoDC = sc2.nextInt();
				  
				  Scanner sc3 = new Scanner(System.in); 		
					 System.out.print("inserisci La categoria");
					  String Categoria = sc3.nextLine();
		 
		 
		  		
		  
          Ricette b = new Ricette (Nomericetta,Difficoltà,TempoDC,Categoria );
		  Ricette.add(ricetta1);
		  Ricette.add(ricetta2);
		  Ricette.add(ricetta3);
		  Ricette.add(b);
		  for (int i =0;i<Ricette.size(); i++) {
			     System.out.println(Ricette.get(i));	     
				}
			 }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	}
	


