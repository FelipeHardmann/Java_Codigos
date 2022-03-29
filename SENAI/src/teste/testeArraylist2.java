package teste;

import java.util.ArrayList;

public class testeArraylist2 {

	public static void main(String[] args) {
		
		ArrayList<String> Lista = new ArrayList<>();
		
		Lista.add("abacate");
		Lista.add("Banana");
		Lista.add("Maça");
		Lista.add("Uva");
		
		Lista.add(1, "Pera");
		System.out.println("Elemento da lista: " + Lista.toString());
		
		
		
	}
}
