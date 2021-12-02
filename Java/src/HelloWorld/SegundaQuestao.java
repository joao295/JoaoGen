package HelloWorld;

import java.util.Scanner;

public class SegundaQuestao {

	public static void main(String[] args) 
	
	
	{
	 Scanner ler = new Scanner (System.in);
     int dia,dias,mes,ano; 
     
     
      System.out.println("Escreva quantos dias de vida você tem");
      dias = ler.nextInt();
      
      
     ano = dias/365; mes = (dias % 365) / 30; dia = (dias % 365) % 30;
	
  
 	System.out.println("Você tem: "+ano+" anos");
 	System.out.println("Você tem: "+mes+" meses");
 	System.out.println("Você tem: "+dia+" dias");

	
	
	}

}