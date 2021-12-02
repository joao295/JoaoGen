package OrientacaoObjetos7;

public class Paciente {




private String Nome;
private String Sexo; 
private int idade;
private int convênio;



public void Sintomas() {

System.out.println("Falar os Sintomass");



}



public String getNome() {
	return Nome;
}



public void setNome(String nome) {
	Nome = nome;
}



public String getSexo() {
	return Sexo;
}



public void setSexo(String sexo) {
	Sexo = sexo;
}



public int getIdade() {
	return idade;
}



public void setIdade(int idade) {
	this.idade = idade;
}



public int getConvênio() {
	return convênio;
}



public void setConvênio(int convênio) {
	this.convênio = convênio;
}


}