package HelloWorld;

import java.util.Scanner;

public class SegundaQuestao {

	public static void main(String[] args) 
	
	
	{
	 Scanner ler = new Scanner (System.in);
     int dia,dias,mes,ano; 
     
     
      System.out.println("Escreva quantos dias de vida voc� tem");
      dias = ler.nextInt();
      
      
     ano = dias/365; mes = (dias % 365) / 30; dia = (dias % 365) % 30;
	
  
 	System.out.println("Voc� tem: "+ano+" anos");
 	System.out.println("Voc� tem: "+mes+" meses");
 	System.out.println("Voc� tem: "+dia+" dias");

	
	
	}

}