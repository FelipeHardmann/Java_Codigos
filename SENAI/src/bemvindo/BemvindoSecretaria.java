package bemvindo;

import java.util.Scanner;

public class BemvindoSecretaria {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		secretaria sec = new secretaria(); //Inst�ncia (new secretaria) / class: secretaria
		
		
		for(int x = 0 ; x < 3; x++) {
			System.out.println("Digite o nome do seu curso");
			String nomeCurso = scanner.nextLine();
			sec.curso(nomeCurso);
		}
	}
}
//m�todo construtor------Criando uma inst�ncia ou objeto........

//