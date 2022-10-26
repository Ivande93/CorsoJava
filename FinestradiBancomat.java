import java.util.ArrayList;
import javax.swing.*;
public class FinestradiBancomat extends JFrame{
	
	 ArrayList <ContoCorrente> Bancomat = new ArrayList();
	 
	 JButton bottone1;
	 JButton bottone2;
	 JButton bottone3;
	 JButton bottone4;
	 
	 JTextField campo1;
		 
	 JLabel etichetta1;
	 JLabel etichetta2;
	 JLabel etichetta3;
	 JLabel etichetta4;
	 
	 JPanel pannello;
     
	 Bancomat c = new Bancomat();
	 public FinestradiBancomat(String Bancomat) {
		
		    ContoCorrente a1 = new ContoCorrente (1231,2000.40);
			ContoCorrente a2 = new ContoCorrente (5435,1050.50);
			ContoCorrente a3 = new ContoCorrente (3213,2350.70);
			ContoCorrente a4 = new ContoCorrente (9879,1300.50);
			ContoCorrente a5 = new ContoCorrente (7657,2100.65);
		    ContoCorrente a6 = new ContoCorrente (1234,2000.9);
		    c.aggiungiconto(a1);
	        c.aggiungiconto(a2);
	        c.aggiungiconto(a3);
	        c.aggiungiconto(a4);
	        c.aggiungiconto(a5);
		  	c.aggiungiconto(a6);
		  	
		  campo1 = new JTextField(25);
		  etichetta1 = new JLabel("Inserisci il pin :");	 		
		  bottone1 = new JButton("Verifica pin");
		  bottone2 = new JButton("Preleva");
		  bottone3 = new JButton("Versa");
		  bottone4 = new JButton("Visualizza saldo");
		  pannello = new JPanel();
		  pannello.add(etichetta1);
		  pannello.add(campo1); 	
		  pannello.add(bottone1);
		  pannello.add(bottone2);
		  pannello.add(bottone3);
		  pannello.add(bottone4);	
		  bottone1.addActionListener(new TastoVerifica(this));
		 bottone2.addActionListener(new TastoPreleva(this));
		  bottone3.addActionListener(new TastoVersamento(this));
		  bottone4.addActionListener(new TastoSaldo(this));
		  bottone2.setVisible(false);
		  bottone3.setVisible(false);
		  bottone4.setVisible(false);		
		  
		  // aggiungiamo il pannello alla finestra
		  this.add(pannello);		  
		  // settiamo granfzza finestra
		  this.setSize(400,500);
		   //settiamo la visibilità della finestra
		  this.setVisible(true);		  
		 }		 
		public static void main(String[] args) {
	    FinestradiBancomat finestra = new FinestradiBancomat("Bancomat");
		 }		
}
