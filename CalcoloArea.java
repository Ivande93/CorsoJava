import java.util.Scanner;

public class CalcoloArea {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
	System.out.println (" Lunghezza raggio ?");
	
	 int Raggio = myObj.nextInt();
	
	
	double pi = 3.14;
	double raggio = 2;
	double area = (raggio * raggio) * pi;
	
	System.out.println ("l'area della circonferenza è : " + ( Raggio * Raggio) *pi );
	
			
	}

}
