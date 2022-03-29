package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		

		
		
		Scanner scanner = new Scanner(System.in);
		//Filial
		Filial filial1 = new Filial();
		filial1.id = 1234;
		//Empresa
		Empresa empresas = new Empresa();
		
		//Pessoa 1
		Pessoa pessoa1 = new Pessoa();
		
		
		
		pessoa1.nome = "Felipe";
		pessoa1.altura = 1.90;
		pessoa1.corCabelo = "Preto";
		pessoas.add(pessoa1);
		filial1.funcionarios.add(pessoa1);
		empresas.filiais.add(filial1);
		
		//pessoa2
		Pessoa pessoa2 = new Pessoa();
		
		

		pessoa2.nome = "TT";
		pessoa2.altura = 1.80;
		pessoa2.corCabelo = "Preto";
		pessoas.add(pessoa2);
		filial1.funcionarios.add(pessoa2);
		
		
		//pessoa3
		Pessoa pessoa3 = new Pessoa();
		
		

		pessoa3.nome = "Jonas";
		pessoa3.altura = 1.40;
		pessoa3.corCabelo = "Preto";
		pessoas.add(pessoa3);
		filial1.funcionarios.add(pessoa3);
		
		
		Double media;
		
		media = (pessoa1.altura + pessoa2.altura + pessoa3.altura)/3;
		
		System.out.println(media);
		
		Double soma = 0.0;//variável criada para entrar no for
		
		for(Filial P1 : empresas.filiais) {
			for(Pessoa P2 : filial1.funcionarios){
				 System.out.println(P2.nome);//= for(int x=0; x < filial1.funcionarios.seize(){ Pessoa p1 = filial1.funcionarios.get(x); soma = soma + P1.altura;
			}
			
		}
		
		
		
		
		
		
		
	}
}










