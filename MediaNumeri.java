import java.util.Scanner;

public class MediaNumeri {

	public static void main(String[] args) {
		// Scrivere un programma MediaNumeri che chiede all’utente di inserire una sequenza di
		//numeri interi positivi. Non appena l’utente inserisce un numero negativo il programma si arresta e
		//visualizza la media aritmetica dei valori positivi inseriti (senza approssimazione!).
	
		 int i = 0;
		int num = 0;
		int somma=0;
		do {
			somma+=num;
			System.out.println("Inserisci un numero:");
			Scanner sc =new Scanner( System.in);
		
			num = sc.nextInt();	
		    i++;
}
		while (num>=0);
		
		
		System.out.println(somma/(i-1));
}
}
