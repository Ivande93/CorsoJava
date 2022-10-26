import javax.swing.*;
//importiamo il pacchetto swing
public class Finestra3Input extends JFrame{
	// creazione di un bottone
	 JButton bottone1;
	 JButton bottone2;	
	// creazione di un campo di testo
	 JTextField campo1;
	 JTextField campo2;
	 JTextField campo3;
	// creazione di una etichetta
	 JLabel etichetta1;
	 JLabel etichetta2;
	 JLabel etichetta3;
	// creazione pannello 
	 JPanel pannello;
	 
	// costruttore di finestra
	 public Finestra3Input(String titoloFinestra) {
		//elementi finestra
		campo1 = new JTextField(20);
		etichetta1 = new JLabel("Campo 1 ");
		campo2 = new JTextField(20);
		etichetta2 = new JLabel("Campo 2");
		campo3 = new JTextField(20);
		etichetta3 = new JLabel("Campo 3");
		bottone1= new JButton("Invia");
		bottone2= new JButton("Ricevi");	
		
		//aggiungiamo il pannello
		pannello= new JPanel();		
		
		pannello.add(campo1);
		pannello.add(etichetta1);
		pannello.add(campo2);
		pannello.add(etichetta2);
		pannello.add(campo3);
		pannello.add(etichetta3);
		
		pannello.add(bottone1);
		pannello.add(bottone2);

		this.add(pannello);	
		// settiamo grandezza finestra
		this.setSize(350,500);
		//settiamo la visibilità della finestra
		this.setVisible(true);
	 }
	public static void main(String[] args) {
		
		Finestra3Input finestra1 = new Finestra3Input("La mia prima finestra");
	}}


