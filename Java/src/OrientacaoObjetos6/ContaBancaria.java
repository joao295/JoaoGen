package OrientacaoObjetos6;

public class ContaBancaria {



private String banco;	
	
private String nomedodono;	

private int conta;

private double dinheirodaconta;



public void Saque(){ 
	
	System.out.println("Retirando dinheiro...");
	
}


public void Deposito(){ 
	
	System.out.println("Retirando dinheiro...");
	
}


public String getBanco() {
	return banco;
}


public void setBanco(String banco) {
	this.banco = banco;
}


public String getNomedodono() {
	return nomedodono;
}


public void setNomedodono(String nomedodono) {
	this.nomedodono = nomedodono;
}


public int getConta() {
	return conta;
}


public void setConta(int conta) {
	this.conta = conta;
}


public double getDinheirodaconta() {
	return dinheirodaconta;
}


public void setDinheirodaconta(double dinheirodaconta) {
	this.dinheirodaconta = dinheirodaconta;
}




}