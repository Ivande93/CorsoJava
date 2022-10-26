import java.io.Serializable;

public class Libro implements Serializable{
String titolo;
String autore;
String stato;


public  Libro(String titolo,String autore) {
	this.titolo=titolo;
	this.autore=autore;
	this.stato="Disponibile";
}
	public String toString() {
		   
		return (" Titolo : " + titolo + " Autore : " + autore+" Stato :"+ stato);
		  }

		 }

