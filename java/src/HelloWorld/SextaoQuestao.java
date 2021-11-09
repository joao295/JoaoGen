package HelloWorld;

import java.util.Scanner;

public class SextaoQuestao {

	public static void main(String[] args) {		 Scanner ler = new Scanner (System.in);
	    
		 int  p,d,x,y,x2,y2,total;

     
		 
		 
		 
		 
		 
         System.out.println("Escreva x");
		 x = ler.nextInt();
		 
		 
		 System.out.println("Escreva y");
		 y = ler.nextInt();
		 
		 
		 System.out.println("Escreva x2");
		 x2 = ler.nextInt();
         
         
		 
		 System.out.println("Escreva y2");
		 y2 = ler.nextInt();
         
         
   d = (x-y*2) + (x2-y2*2);
   total = d*d; 
         

	
	System.out.println("A distancia é de "+total);

	
	}

}
