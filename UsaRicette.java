import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public  class UsaRicette implements ActionListener {

 
 FinestradiRicetta window;
 public UsaRicette(FinestradiRicetta b) {
	
  this.window = b;
 }
 
 public void actionPerformed(ActionEvent b) {
  // ci andiamo a ricavare il testo scritto dall'utente nella finesta nel campo tesstuale
  String testo1 = window.campo1.getText();
  String testo2 = window.campo2.getText();
  String testo3 = window.campo3.getText();
  String testo4 = window.campo4.getText();
  String messaggio = "";
  int numero = Integer.parseInt(testo3);
  
  Ricette ricetta1 = new Ricette(testo1,testo2,numero,testo4);
  window.Ricette.add(ricetta1);  
  messaggio= "Ricetta aggiunta"; 
  // andiamo a creaare un nuovo jframe}	  
  JFrame f=new JFrame();  
  // andiamo a creare un pop up che ci indica il testo del campo
  JOptionPane.showMessageDialog(f,messaggio); 
    	
 }



    

    }
    	
    
 


