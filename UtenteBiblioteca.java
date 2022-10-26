import java.util.ArrayList;
import java.util.Collection;

public class UtenteBiblioteca {
String nome;
String cognome;
ArrayList <Libro> Biblioteca; 

public UtenteBiblioteca(ArrayList<UtenteBiblioteca> prenotati) {
	
}
public void CreaUtente (String nome,String cognome){
	this.nome=nome;
	this.cognome=cognome;
}
 public  void prenota(Biblioteca b,String titolo) {
for  (int i =0;i<b.Biblioteca.size(); i++) {
	if (b.Biblioteca.get(i).titolo.equalsIgnoreCase(titolo) && 
     b.Biblioteca.get(i).stato.equalsIgnoreCase("Disponibile"));{
	b.Biblioteca.get(i).stato="Non disponibile";
	.add(b.Biblioteca.get(i));
}
else if (b.Biblioteca.get(i).titolo.equalsIgnoreCase(titolo) &&
		b.Biblioteca.get(i).stato.equals("Non disponibile"));{
		System.out.println("Libro attualmente non disponibile");
		}
 else {
	 System.out.println("Libro non presente sul catalogo");
}
 
 
 }}
 public void StampaPrenotati() {
	for  (int i =0;i<Biblioteca.size();i++) {
	 if (Biblioteca.get(i).titolo.)
 }}
}

