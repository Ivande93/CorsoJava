
public class veicolo {
int targa;
String marca;
String modello;
boolean ripara;
int prezzo=0;

public veicolo (int targa,String modello, String marca,String tipologia, boolean riparato,int prezzo){
	this.targa=targa;
	this.marca=marca;
	this.modello=modello;
	
	  this.ripara=true;
		 }
		 public String toString () {
		  return (targa +" "+ modello+" " + marca +" "+ripara+" "+ prezzo);
		 }

		 public boolean getRipara () {
		  return ripara;
		 }
		 
		 public void setRotto () {
		  if (ripara==true ) {
		   ripara=false;
		  }
		 }
		 public void tipologia() {
			 
		 }
		 public void ripara() {}
	public static void main(String[] args) {
	}

}
//*Scrivere una classe Veicolo che prevede una targa, una marca e un modello. La classe
//*prevede anche una variabile booleana che descrive se il veicolo `e guasto. Aggiungere un costruttore opportuno e vari metodi get e set opportuni.
//Scrivere la classi Vettura e Motociclo che estendono la classe
//*Veicolo. La classe Vettura prevede una stringa che ne descrive la tipologia ("utilitaria","station wagon",
//*"SUV",....) mentre la classe Motociclo prevede un numero che ne descrive la cilindrata (50, 125, ....).
//Per testare le classi, scrivere un programma UsaVeicoli che crea un array inizializzato con veicoli
//delle varie tipologie. Alcuni dei veicoli inseriti nell’array dovranno diventare guasti. Il programma deve
//stampare la lista delle targhe dei veicoli guasti.






