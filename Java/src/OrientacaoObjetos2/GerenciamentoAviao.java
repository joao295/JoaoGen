package OrientacaoObjetos2;

public class GerenciamentoAviao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	Avi�o c1 = new Avi�o();	
	c1.setModelo("Boeing - 737-800ng");
	c1.setMatricula(1234);
	c1.setCombust�vel("60%");
	c1.setManuten��o("Manuten��o em dia");
	c1.setDestino("Destino : Foz de Igu�u");	
	
	System.out.println(c1.getModelo());
	System.out.println(c1.getMatricula());
	System.out.println(c1.getManuten��o());
	System.out.println(c1.getCombust�vel());
	
	System.out.println(c1.getDestino());

	
	c1.Takeof();

		
	}

}
