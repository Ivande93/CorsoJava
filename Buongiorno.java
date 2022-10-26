
public class Buongiorno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String x = "Buongiorno";
System.out.println(x.length());
System.out.println(x.toUpperCase()); // tutti i caratteri in maiuscolo
System.out.println(x.equalsIgnoreCase("Buongiorno")); //ingora le lettere maiuscole e minuscole
System.out.println(x.equals("buongiorno")); //
System.out.println(x.substring(2)); //

System.out.println(x.substring(0,5));
System.out.println(x.compareTo("Buongiorno"));
System.out.println(x.compareTo("Buongior"));
	}

}
