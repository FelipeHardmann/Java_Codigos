package main;

import java.util.Scanner;

import javax.net.ssl.SSLServerSocketFactory;

import model.Concessionaria;
import model.Funcionario;
import model.Oficina;
import model.Servico;

public class Principal {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		Concessionaria cons1 = new Concessionaria();
		
		Oficina ofc = new Oficina(); 
		
		Servico serv = new Servico();
		
		System.out.println("Digite a quantidade de funcionários");
		Integer qtdFuncionarios = scanner.nextInt();scanner.nextLine();
		
		
		for(int x = 0; x < qtdFuncionarios; x++) {
			System.out.println("Digite o nome dos funcionários");
			String nomeTeclado = scanner.nextLine();
			Funcionario func = new Funcionario();
			func.name = nomeTeclado;
			cons1.funcionarios.add(func);
		}
		
		
		System.out.println("Digite a quantidade de serviços");
		Integer servicos = scanner.nextInt();scanner.nextLine();
		
		for(int y = 0; y < servicos; y++) {
			System.out.println("Digite o nome dos serviços solicitados");
			String servicosTeclado = scanner.nextLine();
			System.out.println("Digite o valor dos serviços");
			Double valorTeclado = scanner.nextDouble();scanner.nextLine();
			
			serv.setName(servicosTeclado); 
			serv.setvalor(valorTeclado); 
			ofc.servicos.add(serv);
		}
		
		System.out.println("Digite a classifição do serviço");
		Integer classificacaoServico = scanner.nextInt();scanner.nextLine();
		serv.setClassificacao(classificacaoServico);
		
		cons1.oficina = ofc;
		
		
		for(Servico servi : cons1.oficina.servicos) {
			System.out.println(servi.getName());
			System.out.println(servi.getValor());
		}
		
		
		System.out.println("Fim do programa");
	}
}


















