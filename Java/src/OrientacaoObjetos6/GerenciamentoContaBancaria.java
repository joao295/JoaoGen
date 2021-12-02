package OrientacaoObjetos6;

public class GerenciamentoContaBancaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ContaBancaria c1 = new ContaBancaria();
c1.setNomedodono("Joao");
c1.setBanco("Itau");
c1.setDinheirodaconta(50000.0);
c1.setConta(1622);




 System.out.println(c1.getNomedodono());
 System.out.println(c1.getBanco());
 System.out.println(c1.getConta());
 System.out.println(c1.getDinheirodaconta());
 
 
 c1.Deposito();
		
		
		
		
		
		
		
	}

}
