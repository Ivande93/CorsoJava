import java.util.ArrayList;

public class Bancomat {
	ArrayList <ContoCorrente> Bancomat = new ArrayList();
	
		public Bancomat() {
			
	}	
		public void aggiungiconto(ContoCorrente c) {
			Bancomat.add(c);
		}
		// il metodo controllo id ha un id come " parametro" passato dall'utente
		// il metodo ritorna un intero che mostra l'indice dell'array,riferito 
		//al conto corrente desiderato
		
	public int  controlloid(int id ) {
		//inizialmente la variabile controlloId viene inizializzata a -1, questo significa
		//che se l'array non verrà trovato, il metodorito ritornerà valore negativo
			int controlloid=-1;
			for (int i =0;i<Bancomat.size();i++) 
				// se l'id viene trovato all'interno dell'array, ci andiamo a copiare l'indice
				//di riferimento del contocorrente
				if (id==Bancomat.get(i).id){
					controlloid=i;
				
				}
			return controlloid;
		}
		// il boolean non va bene perchè dice solo se è presente nell'array, invece così vado a lavorare
	//solo sull'id che ho trovato nell'array
	

		//get serve per accedere all'oggetto dentro l'array es. Bancomat.get(i).id

		

		

}
