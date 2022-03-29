package model;


public class Funcionario {
	
	 private String name;
	 private Double salario;
	 
	 
	 public Funcionario() {
		 System.out.println("Criando classe funcionário");
	 }
	 
	 public Funcionario(String name, Double salario) {
		 this.name = name;
		 this.salario = salario;
	 }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

}
