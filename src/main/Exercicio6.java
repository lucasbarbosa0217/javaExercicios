package main;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		/*
		 * 6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.
		 */

		Scanner tcd = new Scanner(System.in);

		System.out.println("Digite um valor qualquer");
		double valor = tcd.nextDouble();
		
		valor = valor * 1.05;
		
		System.out.printf("Valor reajustado: %.2f", valor);
		
		tcd.close();

	


	}
}
