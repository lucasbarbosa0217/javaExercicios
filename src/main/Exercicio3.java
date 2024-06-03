package main;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		/*
		 * 3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de
		 * A e B forem iguais, deverá somar os dois valores,
		 * 
		 * caso contrário devera multiplicar A por B. Ao final de qualquer um dos
		 * cálculos deve-se atribuir o resultado a uma variável C e
		 * 
		 * imprimir seu valor na tela.
		 */

		Scanner tcd = new Scanner(System.in);

		System.out.println("Escreva um número A:");
		int numeroA = tcd.nextInt();
		System.out.println("Escreva um número B:");
		int numeroB = tcd.nextInt();
		
		int numeroC = (numeroA == numeroB) ? numeroA + numeroB : numeroA * numeroB;
		tcd.close();

		System.out.printf("Valor de C: %d", numeroC);
		


	}
}
