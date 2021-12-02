package OrientacaoObjetos;

public class GenrenciamentoCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	Cliente c1  = new Cliente();
	c1.setNome("Neymar");
	c1.setIdade(29);
	c1.setSexo("Masculino");
	
	
	
	
	
	
	System.out.println(c1.getNome());

	
	System.out.println(c1.getSexo());

	
	System.out.println(c1.getIdade());

	c1.Comprar();

	
	}
	
};

