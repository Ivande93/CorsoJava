
public class QuesitoSiNo extends Quesito{

	public QuesitoSiNo(String domanda, String rispostaGiusta) {
		super(domanda, rispostaGiusta);
	
		
	}
	public int ask(String rispostaUtente) {
		if (rispostaUtente.equalsIgnoreCase(rispostaGiusta)) {
			punteggio=2;
			
		}
		return punteggio;
	}}


