package br.com.gediane;

public class Retirada {
	private int produto1=16;
	
	
	public void Retirar() {
		System.out.println("Quantidade de produtos restantes:"+ (produto1));
	}


	public int getProduto1() {
		return produto1;
	}


	public void setProduto1(int produto1) {
		this.produto1 = produto1;
	}


}
