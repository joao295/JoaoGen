package HelloWorld;

import java.util.Scanner;

public class PrimeiraQuestao {

	public static void main(String[] args) 
	
	
	
	{
	Scanner ler = new Scanner(System.in);
	double dia,mes,ano,soma; 
	
	System.out.println ("Escreva o dia que nasceu");
	dia = ler.nextDouble();
	
	System.out.println ("Escreva o mes que nasceu");
	mes = ler.nextDouble();
	
	System.out.println ("Escreva o ano que nasceu");
	ano = ler.nextDouble();
	
	
soma = (ano*365 + (dia) + (mes*30));

	

	System.out.println(soma);


	}
	

}
