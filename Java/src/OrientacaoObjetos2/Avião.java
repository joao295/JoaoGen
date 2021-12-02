package OrientacaoObjetos2;

public class Avião {
	
	
	

	
 private String Modelo;	
 private int Matricula;
 private String Manutenção; 
 private String Combustível;
 private String Destino;
 

 
  
public void Takeof () {

System.out.println("Take Offf..");

}


public void Land () {

System.out.println("Landing..");

}


public String getModelo() {
	return Modelo;
}


public void setModelo(String modelo) {
	Modelo = modelo;
}


public int getMatricula() {
	return Matricula;
}


public void setMatricula(int matricula) {
	Matricula = matricula;
}


public String getManutenção() {
	return Manutenção;
}


public void setManutenção(String manutenção) {
	Manutenção = manutenção;
}


public String getCombustível() {
	return Combustível;
}


public void setCombustível(String combustível) {
	Combustível = combustível;
}

 

public String getDestino() {
	return Destino;
}


public void setDestino(String destino) {
	Destino = destino;
}




 
 }
