package main;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		/*
		 * 4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu
		 * antecessor e o seu sucessor.
		 * 
		 */

		Scanner tcd = new Scanner(System.in);

		System.out.println("Escreva um número:");
		int numero = tcd.nextInt();
		
		System.out.printf("Seu número: %d, o sucessor dele: %d, o antecessor dele: %d", numero, numero+1, numero-1);
		tcd.close();

	}
}
