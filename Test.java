import java.util.*;


  public class Test { 

   public static void main(String[] args) { 
   
    


   ArrayList<Quesito> quesiti = new ArrayList<Quesito>(); 

  

   quesiti.add(new QuesitoSiNo("Oggi è Lunedì? Si/No :", "No")); 
   quesiti.add(new QuesitoNumerico("Quanti giorni ha una settimana? :", "7")); 
   quesiti.add(new QuesitoSiNo("Parigi è la capitale d'Italia? Si/No :", "No")); 
   quesiti.add(new QuesitoNumerico("Quante sono le dita di una mano? :", "5")); 
   quesiti.add(new QuesitoSiNo("Parigi è la capitale di Francia? Si/No :", "si")); 
   quesiti.add(new QuesitoSiNo("'Anyway' è una parola inglese? Si/No :", "Si")); 
   quesiti.add(new QuesitoNumerico("Quanti sono gli Stati dell'Unione Europea? :", "27")); 
   quesiti.add(new QuesitoMultiplo("Roma è la capitale di: \n1. Italia, \n2. Francia, \n3. Spagna", "1")); 
   quesiti.add(new QuesitoMultiplo("Torino è il capoluogo di: \n1. Veneto, \n2. Sicilia, \n3. Piemonte", "3")); 
   quesiti.add(new QuesitoSiNo("'Bonjour' è un'espressione spagnola? Si/No :", "No")); 
   quesiti.add(new QuesitoMultiplo("Qual è stato il primo Primo Ministro italiano: \n1. Rattazzi, \n2. Cavour, \n3. Ricasoli", "2"));
   
   
   final int MAX_QUESITI = quesiti.size(); 
   int domandeEffettuate = 0; 
   int risposteEsatte = 0; 
   int punteggioTotale = 0; 

   Random r = new Random(); 
   Scanner input = new Scanner(System.in); 

   for (int i=0; i < quesiti.size();) {

    int sceltaQuesito = r.nextInt(quesiti.size()); 

    Quesito quesito = quesiti.get(sceltaQuesito); 

    quesiti.remove(quesito); 

    System.out.println("\nDOMANDA: " + quesito.getDomanda()); 

    String risposta = input.nextLine();

    int punteggio = quesito.ask(risposta); 
    punteggioTotale += punteggio; 

    if (0 == punteggio) { 
    System.out.println("\nRISPOSTA SBAGLIATA! - Punteggio = " + punteggio); 
    } else { 
    System.out.println("\nRISPOSTA ESATTA! - Punteggio = " + punteggio); 
    risposteEsatte++; 
    } 

    domandeEffettuate = quesiti.size(); 

    System.out.println(System.lineSeparator()); 
    } 
  
 }

}
