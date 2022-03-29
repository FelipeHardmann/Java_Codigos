package model;

import java.util.ArrayList;

public class Concessionaria {
	
	private ArrayList<Carro> carros = new ArrayList<>();
	private ArrayList<Clientes>cliente = new ArrayList<>();
	private ArrayList<Funcionario>funcionarios = new ArrayList<>();
	
	public Oficina oficina = new Oficina();
	
	public Concessionaria() {
		System.out.println("Criando Concessionaria");
		
	}
	
	public ArrayList<Carro> getCarros() {
		return carros;
	}

	public void setCarros(ArrayList<Carro> carros) {
		this.carros = carros;
	}

	public ArrayList<Clientes> getCliente() {
		return cliente;
	}

	public void setCliente(ArrayList<Clientes> cliente) {
		this.cliente = cliente;
	}

	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public Concessionaria(Carro carro, Clientes cliente, Funcionario funcionario) {
		this.carros.add(carro);
		this.cliente.add(cliente);
		this.funcionarios.add(funcionario);
	}
	
}
