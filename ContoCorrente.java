import java.util.ArrayList;

public class ContoCorrente {
	
	int id;
	double saldo;
	double credito;
	double debito;
	public ContoCorrente(int id, double saldo) {
		this.id=id;
		this.saldo=saldo;
	}
	
	public  double prelievo(double debito ) {
		 saldo = saldo-debito; 
		 return saldo;
	}
	public double credito (double credito) {
		saldo= saldo+credito;
		return saldo;}

public String toString() {
	return ("id :"+ id + "saldo :"+ saldo);
}


}







	
	











/*scrivere la classe conto corrente che ha come variabili di istanza 
 * l'id del cliente un double saldo un double credito un double debito
 *  Per creare un contoContoccorrente è necessario 
 *  definire l'id dell'utente e il suo saldo la classe a tre metodi preleva 
 *  versa e getSaldo successivamente creare la classe bancomat che inizializza
 *   un array di contoCorrente ed ha un metodo controllaId(int id) che controlla 
 *   l'id dell'utente all'interno dell'array list infine creare la classe UsaBancomat
 *    che prevede la creazione di qualche contocorrente su cui viene effettuato il controllo 
 *    controlla(id) e successivamente viene consentito di effettuare le operazioni*/
