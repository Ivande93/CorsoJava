import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

// importiamo il paccheto swing

public class FinestradiRicetta extends JFrame {
 
 // creazione di un bottone
 JButton bottone1;
 JButton bottone2;
 ArrayList<Ricette> Ricette=new ArrayList();
 // creazione di un campo di testo
 JTextField campo1;
 JTextField campo2;
 JTextField campo3;
 JTextField campo4;
 // creazione di una etichetta
 JLabel etichetta1;
 JLabel etichetta2;
 JLabel etichetta3;
 JLabel etichetta4;
 // creazione pannello
 JPanel pannello;
 
 
 //costruttore di Finestra
 
 public FinestradiRicetta(String titoloFienstra) {
  
 
  campo1 = new JTextField(20);
  etichetta1 = new JLabel("Nome ricetta");
  campo2 = new JTextField(20);
  etichetta2 = new JLabel("Difficoltà");
  campo3 = new JTextField(20);
  etichetta3 = new JLabel("Tempo di cottura");
  campo4 = new JTextField(20);
  etichetta4 = new JLabel("Categoria");
  bottone1 = new JButton("Aggiungi al ricettario");
  bottone2 = new JButton("Visualizza tutte le ricette");
  pannello = new JPanel();
  pannello.add(etichetta1);
  pannello.add(campo1); 
  pannello.add(etichetta2);
  pannello.add(campo2);
  pannello.add(etichetta3);
  pannello.add(campo3);
  pannello.add(etichetta4);
  pannello.add(campo4);
  pannello.add(bottone1);
  pannello.add(bottone2);
  bottone1.addActionListener(new UsaRicette (this));
  bottone2.addActionListener(new StampaRicette(this));
  // aggiungiamo il pannello alla finestra
  this.add(pannello);
  
  // settiamo granfzza finestra
  this.setSize(250, 500);
  
  //settiamo la visibilità della finestra
  this.setVisible(true);
  
 }

 

public static void main(String[] args) {
  
  FinestradiRicetta finestra = new FinestradiRicetta("La mia prima finestra");

 }

}