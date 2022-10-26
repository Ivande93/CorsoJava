import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class TastoPreleva implements ActionListener {
	JFrame f;
	ContoCorrente ContoCorrente;
	
	

	public TastoPreleva(FinestradiBancomat finestradiBancomat) {
	this.ContoCorrente=ContoCorrente;
	}
	
	@Override
	 public void actionPerformed(ActionEvent e) {
	  // TODO Auto-generated method stub
	  
	  {  
	      f=new JFrame();   
	      
	      String debito=JOptionPane.showInputDialog(f,"Inserisici importo:");
	      
	      double x = Double.parseDouble(debito);
	      ContoCorrente.prelievo(x);
	      System.out.println(ContoCorrente.saldo);
	      JOptionPane.showInputDialog(ContoCorrente.debito);
	  }  

	 }

}
