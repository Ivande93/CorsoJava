
public class QuesitoMultiplo extends QuesitoNumerico{
	
	public QuesitoMultiplo(String domanda, String rispostaGiusta) {
		super(domanda, rispostaGiusta);
		
		rispostaG=Integer.parseInt(rispostaGiusta);
		
	}
		
	
		public int ask(String rispostaUtente) {
			int rispostaU=Integer.parseInt(rispostaUtente);
			if (rispostaU==rispostaG) {
				punteggio=2;
				
			}
			return punteggio;
		}}

