import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TastoVersamento implements ActionListener {
JFrame f;
ContoCorrente contoCorrente;
	
	public TastoVersamento(FinestradiBancomat finestradiBancomat) {
		this.contoCorrente = finestradiBancomat;	}
	@Override
	public void actionPerformed(ActionEvent e) {
	      f=new JFrame();   
	      
	      String credito=JOptionPane.showInputDialog(f,"Inserisici importo:");
	      
	      double y = Double.parseDouble(credito);
	      contoCorrente.credito(y);
	      System.out.println(contoCorrente.saldo);
	      JOptionPane.showInputDialog(contoCorrente.credito);
	  }  
	}		
	

