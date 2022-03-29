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

}
