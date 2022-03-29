package model;

public class ContaPoupanca extends Conta {

	
	private Double taxaPoupanca;
	
			


	public Double getTaxaPoupanca() {
		return taxaPoupanca;
	}

	public void setTaxaPoupanca(Double taxaPoupanca) {
		this.taxaPoupanca = taxaPoupanca;
	}

	
	public Double rendimento (Integer qtdMeses) {
		return this.getSaldo()*(taxaPoupanca*qtdMeses)/100;
	}
	


	
}
