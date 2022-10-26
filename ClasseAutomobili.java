
public class ClasseAutomobili {


	String marca;
	String modello;
	int targa;
	
	
	public  ClasseAutomobili(String marca,String modello,int targa) {
		this.marca=marca;
		this.modello=modello;
	    this.targa=targa;
		
	}
	public void Colore(String colore) {
		  
		  System.out.println(colore);
		 }
	public String toString() {
		  
		  return ("marca: " + marca + " modello: " + modello + " targa: " + targa );
		 }
	
	public static void main(String[] args) {
		
		ClasseAutomobili auto= new ClasseAutomobili("Nissan", "Juke",2466543);
		System.out.println(auto.marca + " " + auto.targa);
		auto.Colore("Giallo");
		ClasseAutomobili auto1 = new ClasseAutomobili("BMW", "X5",78931564);
		System.out.println(auto1.marca + " " + auto1.targa);
		auto.Colore("Blu");
		ClasseAutomobili auto2 = new ClasseAutomobili("Audi", "Q7",72341564);
		System.out.println(auto2.marca + " " + auto2.targa);
		auto.Colore("Verde");
	}

}
