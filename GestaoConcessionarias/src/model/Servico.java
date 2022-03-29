package model;

public class Servico {

	private String name;
	private Double valor;
	private Integer classificacao = 0;
	
	
	
	
	
	
	public Servico() {
		System.out.println("Criando servico");
	}
	
	
	
	
	public Servico(String name, Double valor, Integer classific) {
		this.name = name;
		this.valor = valor;
		this.classificacao = classific;
	}
	
	
	
	//                        ---------------------Encapsulamento---------------Esconder o jogo---------------------------------
	public Integer getClassificacao() {
		return classificacao;
	}



	public void setClassificacao(Integer classificacao) {
		this.classificacao = classificacao;
	}



	public void setvalor(Double valorParametro) {
		valor = valorParametro;
		
	}
	
	
	
	public Double getValor() {
		if(classificacao == 1) {
			return valor * 2;
		}else if (classificacao == 2){
			return valor * 3;
		}
		return valor;
	}
	
	
	
	public void setName(String nameparametro) {
		name = nameparametro;
	}
	
	public String getName() {
		return name;
 		}
	
	
	
}
