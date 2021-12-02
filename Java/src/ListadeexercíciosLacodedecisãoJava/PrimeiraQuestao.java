package ListadeexercíciosLacodedecisãoJava;

import java.util.Scanner;

public class PrimeiraQuestao {

	public static void main(String[] args) {

      
		
		Scanner ler = new Scanner (System.in);
		
		int num1,num2,num3;
		
		
		System.out.printf("Escreva um numero:");
		
		num1 = ler.nextInt();
		
		System.out.printf("Escreva um numero:");
		
		num2 = ler.nextInt();
		
		System.out.printf("Escreva um numero:");
		
		num3 = ler.nextInt();
		
		

if ((num1>num2) && (num1>num3))

{
	System.out.printf("o numero 1 é o maior:"+num1);

}

else if ((num2>num1) && (num2>num3))

{
	System.out.printf(" o numero 2 é o maior:"+num2);
}
else 
	
{
	
	System.out.printf("o numero 3 é o maior:"+num3);

}





}
	
}