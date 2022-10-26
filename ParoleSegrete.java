import java.util.Scanner;

public class ParoleSegrete {



	public static void main(String[] args) {
		//Scrivere un programma ParoleMisteriose che crea e inizializza un array di stringhe
		//contenete 5 parole a piacere (usando il comando di inizializzazione che prevede la lista dei valori tra
				//parentesi graffe) e chiede all’utente di indovinare una tra le 5 parole entro 3 tentativi.


		String  [] Nascoste= {"casa","albero","macchina","computer","sole"};	
        int cont=0;
        String temp="";
        int tutte=0;
        
		for (int i =0; i<3;i++) {
			 Scanner sc =new Scanner( System.in);
			 System.out.println("Indovina la parola: ");
			String Parola = sc.nextLine();
			
			for (int j=0; j<Nascoste.length; j++)
			if (Parola.equalsIgnoreCase(Nascoste[j])) {
			temp=Nascoste[j];
			 tutte= j;
				cont++;
			}	
			
		}
		if (cont==0) {
			System.out.println("GameOver"+" "+"Le parole giuste erano:"+" "+"casa,"+ " "+"albero,"+" "+"macchina,"+" "+"computer e"+" "+"sole");
		}
		else  {
			for (int j =0; j<tutte;j++)
			System.out.println("Hai indovinato!");
		
		}
	}
}

	
			
			

        
    
        	
        
			
		
		
	


