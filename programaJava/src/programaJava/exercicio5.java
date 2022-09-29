package programaJava;

import java.util.Scanner;

public class exercicio5 {
	public static void main(String[] args) {
		int contador_total = 0, contador_situacao1_= 0, contador_situacao2_= 0, contador_situacao3_= 0,
				contador_situacao4_= 0, identificacao, defeito;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe a identificação: ");
		identificacao = teclado.nextInt();
		
		while (identificacao != 0) {
			System.out.println("1 - Necessita de esfera.");
			System.out.println("2 - Necessita de limpeza.");
			System.out.println("3 - Necessita de troca de cabo ou conector.");
			System.out.println("4 - Quebrado ou inutilizado");
			System.out.println("Informe um defeito: ");
			defeito = teclado.nextInt();
		
			if(defeito == 1) {
				contador_situacao1_= contador_situacao1_ + 1;
			}
			if(defeito == 2) {
				contador_situacao2_= contador_situacao2_ + 1;
			}
			if(defeito == 3) {
				contador_situacao3_= contador_situacao3_ + 1;
			}
			if(defeito == 4) {
				contador_situacao4_= contador_situacao4_ + 1;
			}
			contador_total = contador_total + 1;
			System.out.println("Informe a identificação: ");
			identificacao = teclado.nextInt();
		}
		float p1, p2, p3, p4;
		p1 = ((float)contador_situacao1_ / (float)contador_total) * (float)100.00;
		p2 = ((float)contador_situacao2_ / (float)contador_total) * (float)100.00;
		p3 = ((float)contador_situacao3_ / (float)contador_total) * (float)100.00;
		p4 = ((float)contador_situacao4_ / (float)contador_total) * (float)100.00;
		
		System.out.printf("Quantiade de mouses %d\n", contador_total);
		System.out.println("Situação \t\t\tQuantidade \tPercentual");
		System.out.printf("1 - Necessidade de esfera \t\t\t%d \t\t%.2f\n", contador_situacao1_, p1);
		System.out.printf("2 - Necessidade de limpeza \t\t\t%d \t\t%.2f\n", contador_situacao2_, p2);
		System.out.printf("3 - Necessita troca de cabo ou conector \t\t\t%d \t\t%.2f\n", contador_situacao3_, p3);
		System.out.printf("4 - Quebrado ou inutilizado \t\t\t%d \t\t%.2f\n", contador_situacao4_, p4);
	}
	
}











