import javax.swing.*;
import java.awt.*;

// importiamo il paccheto swing

public class Finestra extends JFrame {
 
 // creazione di un bottone
 JButton bottone;
 JButton bottone2;
 
 
 // creazione di un campo di testo
 JTextField campo;
 JTextField campo2;
 // creazione di una etichetta
 JLabel etichetta;
 JLabel etichetta2;
 // creazione pannello
 JPanel pannello;
 
 
 //costruttore di Finestra
 
 public Finestra(String titoloFienstra) {
  
  bottone = new JButton("Login");
  campo = new JTextField(20);
  etichetta = new JLabel("ID");
  campo2 = new JTextField(20);
  etichetta2 = new JLabel("Password");
  pannello = new JPanel();
  pannello.add(etichetta);
  pannello.add(campo);
  
  pannello.add(etichetta2);
  pannello.add(campo2);
  pannello.add(bottone);
  bottone.addActionListener(new ButtonActionListener(this));
  
  // aggiungiamo il pannello alla finestra
  this.add(pannello);
  
  // settiamo granfzza finestra
  this.setSize(250, 250);
  
  //settiamo la visibilità della finestra
  this.setVisible(true);
  
 }

 public static void main(String[] args) {
  
  Finestra finestra1 = new Finestra("La mia prima finestra");

 }

}
