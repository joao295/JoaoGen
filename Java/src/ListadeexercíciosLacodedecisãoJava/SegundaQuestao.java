package ListadeexercíciosLacodedecisãoJava;

import java.util.Scanner;

public class SegundaQuestao {

public static void main(String[] args)	{
	
	
	
	Scanner ler = new Scanner (System.in);
	
	int a,b,c;
    


System.out.print ("Escreva letra A");
a = ler.nextInt();	
	
System.out.print ("Escreva letra B");
b = ler.nextInt();	
	
System.out.print ("Escreva letra C");
c = ler.nextInt();	
		
	



if ((a<b) && (b<c))
	
{
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	
} 

else if ((b<a) && (a<c))
	
{
	System.out.println(b);
	System.out.println(a);
	System.out.println(c);
	
}

else if ((c<a) && (a<b))
{
	System.out.println(c);
	System.out.println(a);
	System.out.println(b);
	
}
else if ((c<b) && (b<a))

{
	System.out.println(c);
	System.out.println(b);
	System.out.println(a);	
}



else if ((a<c) && (c<b))

{
	System.out.println(a);
	System.out.println(c);
	System.out.println(b);	
}

else if ((c<b) && (b<a))

	
{
	System.out.println(c);
	System.out.println(b);
	System.out.println(a);	
}
	
	
	
	
}
	

}

