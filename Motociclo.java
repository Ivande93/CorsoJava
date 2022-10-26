
public class Motociclo extends veicolo{
int cilindrata;

	public Motociclo(int targa, String modello, String marca,String tipologia,boolean riparato,int prezzo) {
		super(targa, modello, marca,tipologia, riparato, prezzo);
	  
		  this.cilindrata = cilindrata;
		 }
		
		public String toString () {
			  return (marca + targa + modello  + cilindrata);
			 }
			 
			}