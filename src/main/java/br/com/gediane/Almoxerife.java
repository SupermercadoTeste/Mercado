package br.com.gediane;

public class Almoxerife {

	private String name="Carlos";
	private String CPF;
	
	public void  Almoxerife() {
		System.out.println(" Nome do Almoxerife responsável: "+ (name));;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCPF() {
		return CPF;
	}
	
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	
	
}
