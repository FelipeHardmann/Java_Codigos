package bemvindo;

import java.util.Scanner;

public class BemvindoSecretaria {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		secretaria sec = new secretaria(); //Instância (new secretaria) / class: secretaria
		
		
		for(int x = 0 ; x < 3; x++) {
			System.out.println("Digite o nome do seu curso");
			String nomeCurso = scanner.nextLine();
			sec.curso(nomeCurso);
		}
	}
}
//método construtor------Criando uma instância ou objeto........

//