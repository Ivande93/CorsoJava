import java.util.ArrayList;


public class UsaVeicoli extends veicolo{

	public UsaVeicoli(int targa, String modello, String marca) {
		super(targa, modello, marca);
		
	}

	public static void main(String[] args) {
		
 ArrayList Veicoli = new ArrayList();
		 
 veicolo auto1 = new veicolo (12345,"Panda","Fiat");
 veicolo auto2 = new veicolo (98765,"Juke","Nissan");
 Motociclo auto3 = new Motociclo (4568,"999","Ducati");
 veicolo auto4 = new veicolo (58432,"Focus","Ford");
 
 auto1.setRotto();
 auto4.setRotto();
 Veicoli.add(auto1);
 Veicoli.add(auto2);
 Veicoli.add(auto3);
 Veicoli.add(auto4);
 
 for ( int i=0; i<Veicoli.size();i++) {
	 if (((veicolo) Veicoli.get(i)).getRipara() == true) {
		    System.out.println (Veicoli.get(i));
		   }
		  }
 }
 
	}


