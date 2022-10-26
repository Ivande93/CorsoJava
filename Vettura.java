
public class Vettura extends veicolo {
String Tipologia;

	public Vettura (int targa, String modello, String marca,String tipologia,boolean riparato,int prezzo) {
		super(targa, modello, marca,tipologia, riparato, prezzo);
		  
		  this.Tipologia = Tipologia;
	}
		  public String toString () {
		   return (marca + targa + modello + Tipologia);
		  }

	}


