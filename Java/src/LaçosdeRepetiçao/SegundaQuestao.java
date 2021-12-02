package LaçosdeRepetiçao;

import java.util.Scanner;

public class SegundaQuestao {

	public static void main(String[] args) {


		
Scanner ler = new Scanner (System.in);

int idade, idade_21=0, idade_50 = 0;




System.out.println("\n Digite a idade da pessoa (para Sair digite -99) : ");
idade = ler.nextInt();

while (idade<99){
	
if(idade<21) 
	
	idade_21++;

if (idade>50) 
		
		
	idade_50++;

System.out.println("\n Digite a idade da pessoa (para Sair digite -99) : ");
idade = ler.nextInt();
}



System.out.println("\n O total com menos de 21 : "+idade_21);


System.out.println("\n O total com mais de 50 :  "+idade_50);




}

}
		
		


