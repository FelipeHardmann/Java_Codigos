package teste;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class testeHashmap {

	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> matriculas = new LinkedHashMap <String,Integer>(); /* LinkedHashMap mostra de forma ordenada 
		ao que foi colocado e TreeMap é por ordem de alfabética*/
		
		matriculas.put("Rebeca", 123);
		matriculas.put("Fernando", 456);
		matriculas.put("Rebeca", 126);
		matriculas.put("Taís", 126);
		
		
		
		for(Entry<String, Integer> entradaMatricula : matriculas.entrySet()) { /*processo de entrada*/
		String chave = entradaMatricula.getKey(); /*getKey faz com que apareça os nomes */
		Integer matricula = entradaMatricula.getValue();
		System.out.println(chave + " " + matricula);
		}
		
		
	}
}
