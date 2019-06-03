package br.com.zup.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner tabuada = new Scanner(System.in);
		
		
		int valor;
		System.out.println("Qual o numero que vc deseja multiplicar");
		valor= tabuada.nextInt();
		
		for (int i = 0; i <= 10; i++) {
			
		System.out.println(i + "x" + valor + " = " + i * valor);
		}
			
		
		
	}

}
