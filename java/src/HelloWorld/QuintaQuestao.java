package HelloWorld;

import java.util.Scanner;

public class QuintaQuestao {

	public static void main(String[] args) {

		 Scanner ler = new Scanner (System.in);
		 
		 double nota1,nota2,nota3,totaldenota,soma,media;
		
		 System.out.println("Escreva a nota 1");
		 nota1 = ler.nextDouble();
		 
		 
		 System.out.println("Escreva a nota 2");
		 nota2 = ler.nextDouble();
		 
		 
		 System.out.println("Escreva a nota 3");
		 nota3 = ler.nextDouble();
		 
		 
		 totaldenota = nota1 + nota2 + nota3; 

		 soma = (nota1*1) + (nota2*1) + (nota3*1) ;

		 media = totaldenota / soma ;
	
	
	
		 
			System.out.println(" A média é: "+media);

	
	
	}

}
