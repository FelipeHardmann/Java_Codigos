package model;

import java.util.ArrayList;

public class Instituicao {

	private String name;
	
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	private ArrayList<Servico> servicos = new ArrayList<Servico>();
	
	
	
	public Instituicao(String name){
		this.name = name;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public ArrayList<Cliente> getClientes() {
		return clientes;
	}



	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}



	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}



	public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}



	public ArrayList<Servico> getServicos() {
		return servicos;
	}



	public void setServicos(ArrayList<Servico> servicos) {
		this.servicos = servicos;
	}
	
	
	
}
