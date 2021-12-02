package LaçosdeRepetiçao;

import java.util.Scanner;

public class TerceiraQuestao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		

		
		
int n,b = 0, c = 0, media = 0; 		
		
		
do {
	
Scanner ler = new Scanner (System.in);
System.out.println("\n Digite um numero (para Sair digite 0):");
n = ler.nextInt();	
	
if(n%3==0)

	b =+ n;
	c++;
}	
	
while(n!=0);

media = b/c;

System.out.printf("Os numeros multilpos de 3 são" +  media );
	
	
}

}

		
		

		



