package model;

public class Carro {

	private String marca;
	private String modelo;
	private String placa;
	
	public Carro() {
		System.out.println("Classe carro");
	}
	
	public Carro(String marca, String modelo, String placa) {
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
	}
}
