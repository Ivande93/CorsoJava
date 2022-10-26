import java.util.Scanner;

public class UsaBancomat {

	public static void main(String[] args) {
		ContoCorrente a1 = new ContoCorrente (123123,2000.40);
		ContoCorrente a2 = new ContoCorrente (543543,1050.50);
		ContoCorrente a3 = new ContoCorrente (321321,2350.70);
		ContoCorrente a4 = new ContoCorrente (987987,1300.50);
		ContoCorrente a5 = new ContoCorrente (765765,2100.65);
		Bancomat c = new Bancomat();
		ContoCorrente a =new ContoCorrente(0,0.0);
        c.aggiungiconto(a1);
        c.aggiungiconto(a2);
        c.aggiungiconto(a3);
        c.aggiungiconto(a4);
        c.aggiungiconto(a5);
		
		 System.out.println("inserisci Id");	 
	     Scanner sc5=new Scanner(System.in);
	     int  cerca=sc5.nextInt();	    
	    if (c.controlloid(cerca)>=0){
	    int i=c.controlloid(cerca);
	  
	    	System.out.println("Prelievo");
	         Scanner sc3 = new Scanner(System.in); 
		     System.out.println("Quanto vuoi prelevare ?"); 
		     double prelievo = sc3.nextDouble();
			c.Bancomat.get(i).prelievo(prelievo);
			
			System.out.println("Versamento");
	         Scanner sc4 = new Scanner(System.in); 
		     System.out.println("Quanto vuoi versare ?"); 
		     double versamento = sc4.nextDouble();
		     c.Bancomat.get(i).credito(versamento);
		     
		     System.out.println(c.Bancomat.get(i).saldo);

	}}}
