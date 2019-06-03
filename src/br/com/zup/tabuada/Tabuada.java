package br.com.zup.tabuada;

import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		Scanner tabuada = new Scanner(System.in);

		int ínicio;
		int valor;
		System.out.println("Qual o numero que vc deseja multiplicar");
		valor = tabuada.nextInt();
		System.out.println("Informe por qual número que deseja iniciar a multiplicação");
		ínicio = tabuada.nextInt();

		for (int i = ínicio; i <= 10; i++) {

			System.out.println(i + "x" + valor + " = " + i * valor);
		}

	}

}
