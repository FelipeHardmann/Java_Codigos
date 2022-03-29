package bemvindo;

import java.util.ArrayList;
import java.util.Scanner;

public class secretaria {
	
	public String nome = "Secretaria Senai";
	public Integer qtdCursos = 5;
	public ArrayList<String> curso = new ArrayList<String>();

	
	public static void main(String[] args) {
		
	
		
		Integer calculadora = new secretaria().calculadora(2, 3);
		Boolean par = new secretaria().par(calculadora);
		
		
		if(par == true) {
			System.out.println(calculadora + " é par");
		}else {
			System.out.println(calculadora + " é ímpar");
		}
	}
	
	public Integer calculadora(Integer A1, Integer A2) {
		return A1+A2;
	}
	
	public Boolean par(Integer numero){
		
		Boolean par = false; //Atribui o número a ímpar
		if(numero % 2 == 0) { //O % serviu para mostrar que o número é par, resto da divisão, exemplos 5%2 o resto é 1, 6%2 o resto é 0
			par = true;
		}
		return par;
	}
	
	public void curso(String nomecurso) {
		
		
		curso.add(nomecurso);
		
		
		
	}
}




