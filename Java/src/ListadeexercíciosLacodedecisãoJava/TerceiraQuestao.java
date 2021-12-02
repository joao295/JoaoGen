package ListadeexercíciosLacodedecisãoJava;

import java.util.Scanner;

public class TerceiraQuestao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner ler = new Scanner (System.in);
		int idade,idade1,idade2,idade3;
		
		
	
		
		System.out.print ("Escreva a sua idade");
		idade = ler.nextInt();	
		
		
		
		
		
		if 	(idade <= 14)
			
		{
		
			System.out.println("10-14 infantil\r\n");

		}
		
		else if (idade <= 17)
		
		{
			System.out.println("15-17 juvenil\r\n");
		}
		
		else if (idade <= 25)
			{
			
			System.out.println("18-25 adulto\r\n");

		}
		
	}

}
