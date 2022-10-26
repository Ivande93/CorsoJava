import java.io.Serializable;

public class Hit implements Serializable{
String autore;
String titolo;
public Hit (String autore,String titolo) {
 this.autore=autore;
 this.titolo=titolo; 
}
public String toString() {
   
return ("Autore: " + autore + " Titolo: " + titolo);
  }
 }

