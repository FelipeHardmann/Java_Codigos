package programaJava;

import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
		
		int num1, num2, soma, multiplicacao;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		num1 = teclado.nextInt();
		
		System.out.println("Informe o segundo número: ");
		num2 = teclado.nextInt();
		
		soma = num1 + num2;
		multiplicacao = num1 * num2;
		
		System.out.println("A soma de " + num1 + " e " + num2 + " é igual a " + soma);
		System.out.println("A multiplicação de " + num1 + " e " + num2 + " é igual a " + multiplicacao);
		
		
	}
}
