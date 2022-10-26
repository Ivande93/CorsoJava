import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class StampaRicette implements ActionListener {
FinestradiRicetta window;
	public StampaRicette(FinestradiRicetta finestradiRicetta) {
		this.window=finestradiRicetta;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for (int i =0;i<window.Ricette.size(); i++) {
		     System.out.println(window.Ricette.get(i));
		} 
		     JOptionPane.showMessageDialog(window, window.Ricette); 
	

}}
