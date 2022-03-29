package main;

public class Criptomoeda {
	public String nome;
	public Double cotacao = 0.0;
	public Double qtd = 0.0;
	public static void main(String[] args) {

	}

	public Double comprarbtc(Double qtd) {
		return qtd * cotacao;
	}

}