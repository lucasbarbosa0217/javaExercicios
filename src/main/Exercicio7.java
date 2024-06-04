package main;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		/*
		 * 7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine
		 * se ambos são VERDADEIRO ou FALSO.
		 * 
		 */

		Scanner tcd = new Scanner(System.in);
		
		System.out.println("Escreva dois valores booleanos");
		boolean val1 = tcd.nextBoolean();
		boolean val2 = tcd.nextBoolean();
		
		System.out.println("Ambos juntos são: " + (val1 && val2));
		
		tcd.close();

	}
}
