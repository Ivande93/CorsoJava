
public class Studente extends Persona{
int matricola;

	public Studente(String nome, String cognome, 
			        int anni, int matricola)
	{
		super(nome, cognome, anni,matricola);
    }
	 public void matricola(int matricola) {
		  
		  
		  this.matricola = matricola;
		 }
	public static void main(String[] args) {
				  
		  
          Studente St= new Studente ("Marco", "Natale", 29,168);
          System.out.println (St.toString());
          St.matricola(956234);
		  System.out.println(St.matricola);
		  St.StampaGen();
		  
		
		 
	}

}
