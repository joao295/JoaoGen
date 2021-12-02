package OrientacaoObjetos3;

public class SmartPhone 

{
  
	
	
	private String  Modelo; 
	private String  Cor;
	private int Memória;
	private int Bateria;
	
	public void call () {

		System.out.println("call for my mother..");

		}


		public void message () {

		System.out.println("Senda a message for my boss");

		
		
	
		}


		public String getModelo() {
			return Modelo;
		}


		public void setModelo(String modelo) {
			Modelo = modelo;
		}


		public String getCor() {
			return Cor;
		}


		public void setCor(String cor) {
			Cor = cor;
		}


		public int getMemória() {
			return Memória;
		}


		public void setMemória(int memória) {
			Memória = memória;
		}


		public int getBateria() {
			return Bateria;
		}


		public void setBateria(int bateria) {
			Bateria = bateria;
		}
	
	
	
}
