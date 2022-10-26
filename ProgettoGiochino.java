import java.util.Scanner;

public class ProgettoGiochino {
		
			
			
			
			public static void main(String[] args) {
			
			
				
				Scanner sc =new Scanner( System.in);
				 System.out.println("Inserisci il tuo nome:");				  
				 String nome = sc.nextLine();
				 Scanner sc1 =new Scanner( System.in);
				 System.out.println("inserisci password");
				 int password = sc1.nextInt();
				 
				 System.out.println("Buon Game!!");	 
				 
			     System.out.println("Benvenuto"+" "+nome+" "+ "!!! Oggi dovrai scegliere che strada prendere per arrivare a casa");
			     Scanner sc2 =new Scanner( System.in);
				 System.out.println("sei sicuro di potercela fare ?"+" "+nome+" "+"?");
				 System.out.println("Cominciamo, in che direzione vuoi andare ? "
				 		+ "0 verso sinistra e 1 verso destra ");
					System.out.println("allora ? ");
				 int p = sc2.nextInt();
			             switch (p) {
				         case 0:
				         System.out.println("Hai scelto sinistra");
				         Scanner sc11 = new Scanner(System.in); 
					     System.out.println("Potrebbe essere la strada giusta! PREMI 1 "); 
		               int t=sc11.nextInt();
		               
		             
				         break;
				         case 1:
				         System.out.println("Hai scelto destra!");
				         Scanner sc3 = new Scanner(System.in); 
					     System.out.println("Forse oggi era meglio non uscire!"
					     		+ "GameOver!!"); 
					    
					    int risposta2 = sc3.nextInt();
				  
				        
			          
			 default:}
			             System.out.println("Bene"+" "+ nome +" "+ "ora devi scegliere un mezzo di trasporto:");
			             System.out.println("0 per L'auto");
			             System.out.println("1 per la bici");
			             System.out.println("2 per il monopattino");
					     Scanner sc4 =new Scanner( System.in);
						
						 int t = sc4.nextInt();
		               switch (t) {
		               
		               case 0:
		            
					         System.out.println("Hai scelto l'auto! più sicura e veloce!");
					         Scanner sc5 = new Scanner(System.in); 
						     System.out.println("Potrebbe essere la strada giusta!"); 
						     System.out.println("Premi 1 per continuare!"); 
						     int x=sc5.nextInt();
						     break;
						     
		               case 1:
				            
					         System.out.println("Hai scelto la bici, non proprio il massimo ma va bene!");
					         Scanner sc6 = new Scanner(System.in); 
						     System.out.println("Non proprio la scelta migliore..."); 
						     System.out.println("Premi 1 per continuare!");
						     int y=sc6.nextInt();
						     break;
		               case 2:
				            
					         System.out.println("Hai scelto il monopattino, non ci vuoi proprio arrivare...");
					         Scanner sc7 = new Scanner(System.in); 
						     System.out.println("Torna a dormire!"
						     		+ "GameOver"); 
						     int z=sc7.nextInt();
						     break;
						     default:}
		               System.out.println("ora se hai scelto bene dovresti arrivare a casa sano e salvo...");
			             System.out.println("premi ZERO se hai scelto bici");
			             System.out.println("premi UNO se hai scelto l'auto");
			             
					     Scanner sc8 =new Scanner( System.in);
						
						 int a = sc8.nextInt();
		               switch (a) {
		               
		               case 0:
		            
					         System.out.println("Sei caduto ! Game Over!!!!");
					         Scanner sc5 = new Scanner(System.in); 
				
						     int x=sc5.nextInt();
						     break;
						     
		               case 1:
				            
					         System.out.println("Le tue scelte sono state saggie ! SEI ARRIVATO A CASA YOU WIN !");
					         Scanner sc6 = new Scanner(System.in); 						  
						     int y=sc6.nextInt();
						     break;
		               default:}
						     
				 }

			             }     	
			     

	


