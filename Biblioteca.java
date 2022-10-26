import java.io.Serializable;
import java.util.ArrayList;

public class Biblioteca implements Serializable{
	 ArrayList <Libro> Biblioteca; 
	 public Biblioteca(ArrayList <Libro> Biblioteca) {
		  this.Biblioteca=Biblioteca; 
	 }

public void inserisci (Libro Libro) {
	  Biblioteca.add(Libro);
	 }
public void ricerca(String input ) {
	  for (int i =0;i<Biblioteca.size();i++) {
	   if (Biblioteca.get(i).titolo.equalsIgnoreCase(input)||Biblioteca.get(i).autore.equalsIgnoreCase(input)){
	    System.out.println(Biblioteca.get(i));}
	  }}
public void PrenotaLibro (String titolo) {
	for (int i=0;i<Biblioteca.size();i++) {
		if (Biblioteca.get(i).titolo.equalsIgnoreCase(titolo)) {
			if (Biblioteca.get(i).stato=="Disponibile") {
				Biblioteca.get(i).stato="Non disponibile";
}
			}
		}
	}}
	



