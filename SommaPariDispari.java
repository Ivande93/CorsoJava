
public class SommaPariDispari {

	public static void main(String[] args) {
		
		
		int [] numeri = {2,2,2,2,2,2,2,2,2,2};
		int sommaPari=0;
		int sommaDispari=0;
		int tutti=0;
	    
	    for (int i=0;i<numeri.length;i++){ 
	
		if (i % 2 != 0 )
		{tutti=i;
		sommaDispari= sommaDispari+ numeri[i];
		}
		     
	 else {sommaPari=sommaPari+numeri[i];
    
}
}
	System.out.println(sommaPari);
	System.out.println(sommaDispari);
	if (sommaPari==sommaDispari) {;
	System.out.println("Pari e dispari Uguali");}
	else {System.out.println("Pari e dispari Diversi");		
	}
	}}


