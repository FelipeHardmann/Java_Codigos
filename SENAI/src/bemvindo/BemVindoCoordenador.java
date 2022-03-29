package bemvindo;

import java.util.HashMap;
import java.util.Scanner;

public class BemVindoCoordenador {
	
	public static void main (String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		
		
		
		 secretaria sec = new secretaria();
		 Integer result = 0;
		 result = sec.calculadora(1, 2);
		 System.out.println(result);
		 
		 
		System.out.println(sec.nome);
		System.out.println(sec.qtdCursos);
		 
		sec.curso("Matemática");
		System.out.println(sec.curso);
		
		
		System.out.println("Qual o seu nome? ");
		String nomeCoordenador = scanner.nextLine();
		
		System.out.println("Qual a sua matrícula? ");
		Integer matricula = scanner.nextInt();scanner.nextLine();
		
		
		
		/*Hashmap*/
		HashMap<Integer, String> hashcoordenador = new HashMap <Integer, String>();
		hashcoordenador.put(matricula, nomeCoordenador);
		
		
		
		System.out.println("digite qual a sua coordenação\n 1-- mecânica: \n 2-- elétrica: \n 3-- desenvolvimento de sistemas: ");
		
		Integer opcao = scanner.nextInt();
		
		
		double media = 0;
		
		
		switch(opcao) {
		case 1:
			System.out.println("Mecânica");
			media = 6.0;
			break;
			
			
		case 2:
			System.out.println("Elétrica");
			media = 7.0;
			break;
			
			
		case 3:
			System.out.println("Dev. Sistemas");
			media = 8.0;
			break;
		
			
			default:
				System.out.println("opção invalida");
				break;
		}
		
		Double soma = 0.0;
		Double mediaAluno = 0.0;
		Double [][] matrizAlunos = new Double[3][3];
		Double[] notas = new Double[3];
		for(int x =0; x < 3; x++) {
			notas = new Double[3];
			for(int y =0; y < 3; y++) {
				System.out.println("Digite a nota" + (y+1) + " do aluno" + (x+1));
				Double nota = scanner.nextDouble();scanner.nextLine();
				notas[y] = nota;
				soma+=nota;
			}
			mediaAluno = soma / notas.length;
			matrizAlunos[x] = notas;
			if(mediaAluno >= media) {
				System.out.println("Aluno passou!!!");
			}else {
				System.out.println("Aluno não passou!!!");
			}
		}
		
		
			int x = 0; 
			while(x < matrizAlunos.length) {
				int y = 0;
				while(y < matrizAlunos[x].length) {
					System.out.println(matrizAlunos[x][y]);
					y++;
				}
				x++;
			}
			Double mediana = ((matrizAlunos [0][0])+(matrizAlunos [0][1])+(matrizAlunos [0][2]))/3;	
			System.out.println(mediana);
		}
	}

	
