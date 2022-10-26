
public class UsaOfficina {

	public static void main(String[] args) {
		
		officina officina = new officina();
		//targa, modello, marca,tipologia, riparato, prezzo
veicolo a=new veicolo(23476,"Panda","Fiat","City car",true,50);

veicolo b=new veicolo(54232,"Y", "Lancia","utilitaria",false,70);

veicolo c=new veicolo(76543,"X5","Bmw","Suv",true,150);

veicolo d=new veicolo(45678,"Avenger","Jeep","suv",false,150);
//targa, modello, marca,tipologia, riparato, prezzo
Motociclo e=(Motociclo) new veicolo (29384,"999","ducati","motociclo",true,1000);

Motociclo f=(Motociclo) new veicolo (23842,"Ciao","Piaggio","motociclo",true,50);

Motociclo g=(Motociclo) new veicolo (34583,"Duke","Ktm","motociclo",false,125);

System.out.println(officina.Ripara(a));
System.out.println(officina.Ripara(c));
System.out.println(officina.Ripara(e));
System.out.println(officina.Ripara(f));





}

}
