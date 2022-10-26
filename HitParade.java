import java.io.Serializable;
import java.util.ArrayList;
public class HitParade implements Serializable{ 
 ArrayList <Hit> Hit; 
 public HitParade(ArrayList <Hit> Hit) {
  this.Hit=Hit; 
 }
 public void inserisci (Hit canzone,int posizione) {
  Hit.add(posizione, canzone);
 }
 public void rimuovi (int posizione) {
  Hit.remove(posizione);  
 }
 public void scambio(int posizione1, int posizione2) {
 Hit temp=Hit.get(posizione1); 
 Hit.set(posizione1, Hit.get(posizione2));
    Hit.set(posizione2, temp);
 }
 public void ricerca(String input ) {
  for (int i =0;i<Hit.size();i++) {
   if (Hit.get(i).titolo.equalsIgnoreCase(input) ||Hit.get(i).autore.equalsIgnoreCase(input) ) {
    System.out.println(Hit.get(i));}
  }  
}
}

