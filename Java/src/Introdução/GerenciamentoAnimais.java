package Heran�aPolimorfismo;

public class GerenciamentoAnimais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Animal a = new Animal();	
	Cachorroo dog = new Cachorroo();	
	Cavalo hourse = new Cavalo();
	Pregui�a laziness = new Pregui�a();	
		
	
	dog.setNome("Leona");
	dog.setTipo("Pitbull");
	
	
	hourse.setTipo("Mustang");
	hourse.setNome("P� de Pano");

	

	laziness.setNome("Antonela");
	laziness.setTipo("Pregui�a Comum");

	
	
	System.out.println(dog.getNome());
	System.out.println(dog.getTipo());
	dog.correr();
	dog.sons();


	System.out.println(hourse.getNome());
	System.out.println(hourse.getTipo());
	hourse.correr();
	hourse.sons();
	
	
	System.out.println(laziness.getNome());
	System.out.println(laziness.getTipo());
	laziness.correr();
	laziness.sons();
	
	}

}
