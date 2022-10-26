
public class QuesitoNumerico extends Quesito{

	 int rispostaG;
	public QuesitoNumerico(String domanda, String rispostaGiusta) {
		super(domanda, rispostaGiusta);
		 rispostaG=Integer.parseInt(rispostaGiusta);
	}
	@Override
	public int ask(String rispostaUtente) {
		int rispostaU=Integer.parseInt(rispostaUtente);
		
		if (rispostaG==rispostaU) {
		return punteggio=2;

		}
		return punteggio;
		
}
}
//<>//<>