package programaJava;

import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
		String nome, senha;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o nome: ");
		nome = teclado.next();
		
		System.out.println("Informe a senha: ");
		senha = teclado.next();
		
		while(nome.equals(senha)) {// para verificar se duas STRINGS são iguais
			System.out.println("ERRO: O nome de usuário e senha devem ser diferentes!");
			
			System.out.println("Informe o nome: ");
			nome = teclado.next();
			
			System.out.println("Informe a senha: ");
			senha = teclado.next();
		}
		
	}

}
