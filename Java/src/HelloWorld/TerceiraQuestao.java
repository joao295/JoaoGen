package HelloWorld;

import java.util.Scanner;

public class TerceiraQuestao {

public static void main(String[] args) {

		
 Scanner ler = new Scanner (System.in);
		
 int event,horas,minutos,segs,segs1;
 
 System.out.println("Quantos Segundos vai durar o Evento");
 segs = ler.nextInt();
		
		
 horas = segs/3600; minutos = (segs % 3600) / 60; segs1 = (minutos % 60 ) * 60 ;
		
		
		
 
	System.out.println("Você tem: "+horas+" horas "+ minutos+" minutos "+ segs1+" segundos");
 
		
	}

}
