package OrientacaoObjetos5;

public class GerenciamentoPatinente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
Patinete p1 = new Patinete();
p1.setModelo("Novo");	
p1.setCor("Preto");		
p1.setTipo("Eletrico");		
		
		
		
System.out.println(p1.getModelo());
System.out.println(p1.getCor());
System.out.println(p1.getTipo());


p1.Andar();
		
		
		
		
	}

}
