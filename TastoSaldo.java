import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TastoSaldo implements ActionListener {

JFrame f;
FinestradiBancomat ContoCorrente;
FinestradiBancomat saldo;
	public TastoSaldo(FinestradiBancomat finestradiBancomat) {
		this.ContoCorrente=finestradiBancomat;
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JFrame stampa= new JFrame();
		int indice=0;
		int pin=Integer.parseInt(saldo.campo1.getText());		
		for (int i=0; i<saldo.Bancomat.size();i++) {
			if (saldo.c.Bancomat.get(i).id==pin) {				
						
		    
	f=new JFrame();   
    // JOption per stampare
 JOptionPane.showMessageDialog(f,ContoCorrente);
		
	}}}}