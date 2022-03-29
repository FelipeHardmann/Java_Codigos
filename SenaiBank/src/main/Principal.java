package main;

import java.util.Scanner;

import model.Cliente;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;
import model.Instituicao;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Instituicao instituicao = new Instituicao("Instituição Paschoal");
		
		System.out.println(instituicao.getName());
		
		Cliente cliente = new Cliente();
		cliente.setNome("Rafael");
		
		
		
		ContaPoupanca poupanca = new ContaPoupanca();
		poupanca.setSaldo(100.00);
		poupanca.setTaxaPoupanca(1.0);
		poupanca.setId(1);
		
		
		
		ContaCorrente corrente = new ContaCorrente();
		corrente.setSaldo(3000.00);
		corrente.setId(2);
		
		cliente.getContas().add(corrente);
		cliente.getContas().add(poupanca);
		
		
		System.out.println("Quantos meses seu dinheiro ficará na poupança?");
		Integer qtdMeses = scanner.nextInt();
		
		
		System.out.println(poupanca.rendimento(qtdMeses));
		
		
	}
	
	
}
