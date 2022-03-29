package model;

import java.util.ArrayList;

public class Concessionaria {
	
	private ArrayList<Carro> carros = new ArrayList<>();
	private ArrayList<Clientes>cliente = new ArrayList<>();
	private ArrayList<Funcionario>funcionarios = new ArrayList<>();
	
	private Oficina oficina = new Oficina();
	
	public Concessionaria() {
		System.out.println("Criando Concessionaria");
		
	}
	
	public Concessionaria(Carro carro, Clientes cliente, Funcionario funcionario) {
		this.carros.add(carro);
		this.cliente.add(cliente);
		this.funcionarios.add(funcionario);
	}
	
}
