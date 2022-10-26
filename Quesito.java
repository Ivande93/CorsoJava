import java.util.Scanner;

public abstract class Quesito {
String domanda;
String risposta;
int punteggio=0;
String rispostaGiusta;
	public Quesito(String domanda,String rispostaGiusta) {
		this.domanda=domanda;		
		this.rispostaGiusta=rispostaGiusta;
}
	public int ask(String rispostaUtente) {
		if (rispostaUtente.equalsIgnoreCase(rispostaGiusta)) {
			punteggio=2;
			
		}
		return punteggio;
	}
	public String getDomanda() {
		// TODO Auto-generated method stub
		return domanda;
	}}


//Scrivere la classe Quesito i cui oggetti rappresentano domande di esami orali. Ogni quesito
//si compone di una domanda, di una risposta corretta e di un punteggio, e mette a disposizione un metodo
//ask() che stampa la domanda, legge la risposta dell’utente e restituisce il punteggio conseguito (0 se la
//risposta dell’utente `e sbagliata).
//Scrivere la classe QuesitoSiNo che estende la classe Quesito in modo da rappresentare domande a
//cui possa essere risposto solo si o no.
//Sovrascrivere il metodo ask() in modo da garantire che l’utente
//risponda si o no (prima che venga restituito il punteggio conseguito).
//Scrivere la classe QuesitoNumerico che estende la classe 
//Quesito in modo da rappresentare domande
//a cui possa essere risposto solo con un valore intero. 
//Sovrascrivere il metodo ask() in modo da garantire
//che l’utente risponda con un valore intero (prima che venga restituito il punteggio conseguito).
//Scrivere la classe QuesitoMultiplo che estende la classe QuesitoNumerico in modo da rappresentare
//domande che offrono un certo numero di opzioni (prefissato) e alle quali possa essere risposto solo con un
//valore intero positivo minore o uguale al numero di opzioni disponibili. 
//Sovrascrivere il metodo ask() in modo da garantire che l’utente risponda con un valore consentito
//(prima che venga restituito il punteggio
//conseguito).
//Scrivere il programma Test che riempie un array con quesiti di diversa natura e poi simula un’interrogazione
//calcolando il punteggio totale ottenuto. A scelta, l’interrogazione pu`o essere fatta estraendo in modo casuale tre quesiti dall’array.
//Per l’estrazione casuale usare il metodo nextInt(int n) della classe Random
//(importare java.util.Random).







