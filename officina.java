
public class officina{
boolean ripara;
int prezzo=0;


public officina () {}


public int Ripara (Vettura a) {
	
	if (a.Tipologia.equalsIgnoreCase("utilitaria")) {
		prezzo=50;		
	}
	else if (a.Tipologia.equalsIgnoreCase("Suv")) {
		prezzo=150;
	}
	else if (a.Tipologia.equalsIgnoreCase("Sportiva")) {
		prezzo=300;
	}
	else if (a.Tipologia.equalsIgnoreCase("City car")) {
		prezzo=70;
	}
	return prezzo;
	
  
}

public int Ripara (Motociclo a) {
		
 if (a.cilindrata==50) {
	 prezzo=35;}
	 else if (a.cilindrata==125) {
		 prezzo=90;
	 }
	 else if (a.cilindrata==500) {
		 prezzo=150;
	 }
	 else if (a.cilindrata==1000) {
		 prezzo=250;
	 }
 
	return prezzo;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

		
	}


