package bemvindo;

import java.util.Scanner;

public class BemVindo {
	
	public static void main(String []args) {
		
		Scanner teclado = new Scanner(System.in);
		Boolean alunoEspecial = true;
		Float[] notas = new Float[10];
		
		System.out.println("digite seu nome ");
		String nome = teclado.nextLine();
		
		System.out.println("digite sua idade ");
		String idade = teclado.nextLine(); 
		
		System.out.println("digite seu sexo com a primeira letra ");
		Character sexo = teclado.nextLine().charAt(0);
		
		for (int i=0; i<5; i++) {
		System.out.println("digite sua " + (i+1) + " nota");
		 notas[i] = teclado.nextFloat();teclado.nextLine();
		}
		
		if ((nome.contains("a") || nome.contains("A"))) {
			System.out.println("BEM VINDO AO SENAI " + nome );
			
		}else {
			System.out.println("BEM VINDO AO SENAI " + nome + ". Você tem " + idade + " anos ");
			
		}
		if(alunoEspecial == true) {
			System.out.println("o aluno é especial ");
		}
	}
}