
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TastoVerifica implements ActionListener {

 FinestradiBancomat b;
 Bancomat b2;
 public JLabel label1;
 public JTextField campo1;
 public JLabel label2;
 public JTextField campo2;
 public JLabel label3;
 public JTextField campo3;
 public JButton bottone;


 public TastoVerifica(FinestradiBancomat finestradiBancomat) {
this.b=finestradiBancomat;

 
 }

@Override
 public void actionPerformed(ActionEvent e) {
  // TODO Auto-generated method stub
  
  int cont = 0;
  int indice = 0;
  int pin = Integer.parseInt(b.campo1.getText());
  for (int i = 0; i < b.c.Bancomat.size(); i++) {
   
   if (b.c.Bancomat.get(i).id==pin) {
   cont++;
   indice = i;
  
  }
  }
  if (cont == 0) {
   b.bottone1.setVisible(false);
   b.bottone2.setVisible(false);
   b.bottone3.setVisible(false);
   b.bottone4.setVisible(false);
  }
  
  if (cont == 1) {
   b.bottone1.setVisible(true);
   b.bottone2.setVisible(true);
   b.bottone3.setVisible(true);
   b.bottone4.setVisible(true);
   
   b.bottone2.addActionListener(new TastoPreleva(b.Bancomat.get(pin)));
   //b.bottone3.addActionListener(new TastoVersamento(b2.Bancomat.get(indice)));
  // b.bottone4.addActionListener(new TastoSaldo(b2.Bancomat.get(indice)));
  }
  
}
}





