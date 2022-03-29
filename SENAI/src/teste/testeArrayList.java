package teste; 

import java.util.ArrayList;

public class testeArrayList {

		public static void main(String[] args) {
			
			ArrayList<String> nomes = new ArrayList<>();
			
			nomes.add("Rafael");
			nomes.add("João");
			nomes.add("Fernando");
			
			for(String nome : nomes) {
				System.out.println(nome);
			}
			
			for(int x=0; x < nomes.size(); x++) {
				System.out.println(nomes.get(x));
			}
			
			ArrayList<Double> notas = new ArrayList<Double>();
			
			notas.add(8.0);
			notas.add(9.0);
			notas.add(6.0);
			
			Double soma = 0.0;
			for(Double nota : notas){
				soma += nota;
			}
			Double media = soma / notas.size();
			System.out.println(media);
		}
		
	}


