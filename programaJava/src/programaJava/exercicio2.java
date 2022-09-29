package programaJava;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
	
		int quantidade_min, quantidade_max;
		float estoque;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe a quantidade mínima: ");
		quantidade_min = teclado.nextInt();
		
		System.out.println("Informe a quantidade máximas: ");
		quantidade_max = teclado.nextInt();
		
		estoque =  (quantidade_max + quantidade_min) / 2;
		
		System.out.println("O estoque é: " + estoque);
	}
}
