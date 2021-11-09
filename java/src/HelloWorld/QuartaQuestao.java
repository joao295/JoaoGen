package HelloWorld;

import java.util.Scanner;

public class QuartaQuestao {

	public static void main(String[] args) {

		
		 Scanner ler = new Scanner (System.in);

		 int a,b,c,d,r,s; 
		
		 
		 System.out.println("Escreva um numero para letra A");
		 a = ler.nextInt();
		 
		 
		 System.out.println("Escreva um numero para letra B");
		 b = ler.nextInt();
		 
		 
		 System.out.println("Escreva um numero para letra C");
		 c = ler.nextInt();
		 
		
		 
		 
		 r=(a+b*2); s=(b+c)*2; d=(r+s/2);

		 
			System.out.println(" O resultado é: "+d);

		 
		 
	}

}
