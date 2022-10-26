import java.util.ArrayList;

public class Persona {
 
 
 //Dichiariamo 4 variaibli di istanza
 
 
 String nome;
 
 String cognome;
 
 int anni;
 
 int altezza;
 
 
 // definiamo il costruttore le variabili passate come parametro vengono
 //assegnate alle variabili di istanza con la parola this
 
 public  Persona(String nome, String cognome, int anni, int altezza) {
  
  this.nome = nome;
  this.cognome = cognome;
  this.anni = anni;
  this.altezza = altezza;
  
 }
 
 // nel metodo stipendio viene passato un numero che rappresenta il salario e poi
 //viene stampato
 public void stipendio(int salario) {
  
  System.out.println(salario);
 }
 public void StampaGen() {
	 System.out.println(nome);
	 System.out.println(cognome);
 }
 // questo metodo ci permette di rappresentare in forma stampabile le variabili 
 // che rappresentano l'oggetto
 public String toString() {
  
  return ("Nome: " + nome + " Cognome: " + cognome + " Anni:" + anni + " altezza: " + altezza);
 }

 public static void main(String[] args) {
  
	// sintassi per la creazione di un nuovo oggetto
	  Persona uomo = new Persona("Mario", "Russo", 50, 175);
	  
	  uomo.StampaGen();
	  // chiamata del metodo stipendio sull'oggetto
	
	  
	  Persona persona3 = new Persona("Lucia", "Gallo", 20, 170);
	  persona3.StampaGen();
	  Persona due = new Persona("Maria", "Bianchi", 40, 160);
	  due.StampaGen();
	  // creiamo un array list di persone
	  
	  ArrayList <Persona> persone = new ArrayList();
	  
	  // andare ad aggiungere all'array con il metodo add le persone
	  
	  persone.add(uomo);
	  persone.add(due);
	  persone.add(persona3);
	  
	  for (int i = 0; i < persone.size(); i++)
	  {
	   System.out.println(persone.get(i));
			   
			   
			   
	  }}}
			   
			   
			   
