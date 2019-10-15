import java.util.Scanner;

public class VeybanjePetlje {

	public static void main(String[] args) {
		
		int brojac = 0;
		int ukupnoBrojeva=0;
		int brojacNeparnih=0;
		 Scanner skener=new Scanner(System.in); 
		 int pocetnaVrednost= skener.nextInt();
		 System.out.println("Unesite krajnju vrednost");
		 
		 
		 
		 
		
		int krajnjaVrednost =skener.nextInt();
		skener.close();
      
      
      
      
		for(int i= pocetnaVrednost ; i <= krajnjaVrednost ; i++) {
	 ukupnoBrojeva ++;
	 if (i%2==0) {
		 brojac ++;
	 }else {
			 brojacNeparnih ++;
		 }
	 
	 }
	 System.out.println("Parnih brojeva ima :" + brojac);
	 System.out.println("Ukupno brojeva:" + ukupnoBrojeva);
	 System.out.println("Neparnih brojeva ima: " + brojacNeparnih);
	 

	 }
 }
		
		
		
		
		
		
		
		
		


