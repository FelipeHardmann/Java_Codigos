package model;

import java.util.ArrayList;

public class Oficina {

	public ArrayList<Servico>servicos = new ArrayList<>();
	public Integer id;
	
	
	private ArrayList<Servico> getServicos(){
		return servicos;
	}
	
	public void setServicos(ArrayList<Servico> servicos) {
		this.servicos = servicos;
	}
}
