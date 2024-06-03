package main;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		/*
		 * 2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o
		 * número é par ou ímpar, positivo ou negativo.
		 */

		Scanner tcd = new Scanner(System.in);

		System.out.println("Escreva um número:");
		int numero = tcd.nextInt();
		
		String parImpar = (numero %2 == 0) ? "Seu número é par.\n" : "Seu número é impar.\n";
		String negPos = (numero >= 0) ? "Seu número é positivo.\n" : "Seu número é negativo.\n";
		
		System.out.printf(parImpar+ negPos);

		
		tcd.close();

	}
}
