package HelloWorld;

import java.util.Scanner;

public class OitavaQuestao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner ler = new Scanner (System.in);

		
		double CustodeFab, CustodeImposto, CustodOcarro, valtodcarro, custostoal;
		
		CustodeFab = 28;
	    CustodeImposto = 45;

	    System.out.println("Escreva o valor do carro");
	    CustodOcarro = ler.nextDouble();
		
	    


custostoal = CustodeFab+CustodeImposto;


valtodcarro = (CustodOcarro + ( CustodOcarro * custostoal/100));

	    
	    
	    
System.out.println("O custo do carro é de  "+valtodcarro);

	}

}
