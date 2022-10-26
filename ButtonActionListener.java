import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ButtonActionListener implements ActionListener {

 
 Finestra window;
 public ButtonActionListener(Finestra c) {
  
  this.window = c;
 }
 
 @Override
 public void actionPerformed(ActionEvent e) {
  // ci andiamo a ricavare il testo scritto dall'utente nella finesta nel campo tesstuale
  String testo = window.campo.getText();
  String testo2 = window.campo2.getText();
  String testoGiusto = "Rossi";
  
  String messaggio = "";
  
  int numero = Integer.parseInt(testo2);
  int NumeroGiusto=1234;
  // andiamo a creaare un nuovo jframe
  JFrame f=new JFrame();  
  // confronto
  
  if (testo.equalsIgnoreCase(testoGiusto)&&(numero==NumeroGiusto)) {
   
   messaggio = "Login eseguito";
  }
  else  {
   messaggio = "Id o password sbagliata";
  }


  // andiamo a creare un pop up che ci indica il testo del campo
    JOptionPane.showMessageDialog(f,messaggio);  
}}


