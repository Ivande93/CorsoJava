import java.io.Serializable;
import java.util.ArrayList;
public class Contatto implements Serializable{	
	String nome;
	int numero;
	 ArrayList<Contatto> Contatto;	
		public Contatto(ArrayList <Contatto> Contatto) {
			this.Contatto=Contatto;	
		}
	public Contatto (String nome,int numero) {
		this.nome=nome;
		this.numero=numero;
	}
public String toString () {
	return ("Nome : "+nome+" Numero : "+numero);
}
public void inserisci ( Contatto nome,int numero) {
	Contatto.add(numero, nome);
}
public void rimuovi (int posizione) {
	Contatto.remove(posizione);		
}
public void ricerca(String input ) {
	for (int i =0;i<Contatto.size();i++) {
		if (Contatto.get(i).nome.equalsIgnoreCase(input)) {
			System.out.println(Contatto.get(i));}
	}
	}		
}



