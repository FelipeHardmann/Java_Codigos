package main;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Criptomoeda bitcoin = new Criptomoeda();
		
		System.out.println("Digite o nome da criptomoeda");
		String nomeCriptoMoeda = scanner.nextLine();
		bitcoin.nome = nomeCriptoMoeda;
		
		
		System.out.println("Digite a cotação da criptomoeda");
		Double cotacaoDigitada = scanner.nextDouble(); scanner.nextLine();
		bitcoin.cotacao = cotacaoDigitada;
		
		System.out.println("Digite a quantidade de Criptomoedas");
		Double quantidade = scanner.nextDouble(); scanner.nextLine();
		bitcoin.qtd = quantidade;
		
		bitcoin.comprarbtc(quantidade);
		
		
	}
}
