package OrientacaoObjetos3;

public class GerenciamentoSmartphone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	
	SmartPhone p1 = new SmartPhone();
	p1.setModelo("Iphone");
	p1.setCor("Preto");
	p1.setMemória(80);
	p1.setBateria(90);
	

	
	
	
	System.out.println(p1.getModelo());
	System.out.println(p1.getCor());
	System.out.println(p1.getMemória());
	System.out.println(p1.getBateria());
	
	p1.call();

	}

}
