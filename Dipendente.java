public class Dipendente extends Persona {
 // variabili di istanza
 
 int stipendio;

 public Dipendente(String nome, String cognome, int anni, int altezza)
 
 // costruttore dove si inizializzano le variabili
 {
  super(nome, cognome, anni, altezza);
  

 }
 //mteodi
 public void stipendio(int stipendio) {
  
  
  this.stipendio = stipendio;
 }

 public static void main(String[] args) {
 

  
  Persona b = new Persona("Mario", "Bianchi", 35, 169);
  System.out.println(b.toString());
  b.toString();
  b.stipendio(2000);
  b.StampaGen();
  
  Dipendente a = new Dipendente("Maria", "Rossi", 35, 169);
  System.out.println(a.toString());
  a.stipendio(1800);
  System.out.println(a.stipendio);
  a.StampaGen();
  
  
  
 }

}
