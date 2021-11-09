package HelloWorld;

import java.util.Scanner;

public class SetimaQuestao {

	public static void main(String[] args) {

		
Scanner ler = new Scanner (System.in);

		
double a,b,c,d,f,x,y,e1,ce,bf,ae1,bd,af,cd;
		
		



System.out.println("Escreva A");
	a = ler.nextInt();
	 
	 
	 System.out.println("Escreva B");
	b = ler.nextInt();
	 
	 
	 System.out.println("Escreva C");
	c = ler.nextInt();
     
     
	 
	 System.out.println("Escreva D");
	d = ler.nextInt();
     

	 System.out.println("Escreva E");
	e1 = ler.nextInt();
    
	 System.out.println("Escreva F");
	f = ler.nextInt();



ce = (c + e1) ; 
bf = (b + f);ae1= (a + e1);
bd = (b + d) ;
af = (a + f) ;
cd = (c + d) ;
x= (ce - bf/ae1 - bd)  ;
y=	(af - cd/ae1 - bd) ;


System.out.println("O resultado de X É "+x+"O resultado de Y É "+y);




		
	}

}
