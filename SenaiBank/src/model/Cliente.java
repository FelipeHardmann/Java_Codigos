package model;

import java.util.ArrayList;

public class Cliente extends Pessoa {
	
	private ArrayList<Conta> contas = new ArrayList<Conta>();
	private ArrayList<ContaCorrente> corrente = new ArrayList<ContaCorrente>();
	private ArrayList<ContaPoupanca> poupanca = new ArrayList<ContaPoupanca>();
	
	
	
	
	public Cliente() {
		
	}
	
	
	public ArrayList<Conta> getContas(){
		return contas;
	}
	
	public void setContas(ArrayList<Conta> contas) {
		this.contas = contas;
	}


	public ArrayList<ContaCorrente> getCorrente() {
		return corrente;
	}


	public void setCorrente(ArrayList<ContaCorrente> corrente) {
		this.corrente = corrente;
	}


	public ArrayList<ContaPoupanca> getPoupanca() {
		return poupanca;
	}


	public void setPoupanca(ArrayList<ContaPoupanca> poupanca) {
		this.poupanca = poupanca;
	}
	
	
	
	
	
}
