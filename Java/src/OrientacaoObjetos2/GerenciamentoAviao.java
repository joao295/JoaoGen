package OrientacaoObjetos2;

public class GerenciamentoAviao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	Avião c1 = new Avião();	
	c1.setModelo("Boeing - 737-800ng");
	c1.setMatricula(1234);
	c1.setCombustível("60%");
	c1.setManutenção("Manutenção em dia");
	c1.setDestino("Destino : Foz de Iguçu");	
	
	System.out.println(c1.getModelo());
	System.out.println(c1.getMatricula());
	System.out.println(c1.getManutenção());
	System.out.println(c1.getCombustível());
	
	System.out.println(c1.getDestino());

	
	c1.Takeof();

		
	}

}
