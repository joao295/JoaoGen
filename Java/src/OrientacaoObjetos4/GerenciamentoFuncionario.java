package OrientacaoObjetos4;

public class GerenciamentoFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
Funcionario f1 = new Funcionario();		

f1.setNome("JO�O");
f1.setMatricula(9992);
f1.setPosi��o("Manager");
f1.setSexo("MASCULINO");
f1.setSalario(100000);
		
		
		


System.out.println(f1.getNome());
System.out.println(f1.getMatricula());
System.out.println(f1.getPosi��o());
System.out.println(f1.getSexo());
System.out.println(f1.getSalario());


f1.work();	
		
		
		
		
	}

}
