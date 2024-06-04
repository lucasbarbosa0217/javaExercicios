package main;

import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;



public class Exercicio8 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		/*
		 * 8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na
		 * tela os valores em ordem decrescente.
		 * 
		 */
		Scanner tcd = new Scanner(System.in);

		int valores[] = new int[3];

		for (int i = 0; i < valores.length; i++) {
			System.out.printf("Escreva o %dº valor\n", i + 1);
			valores[i] = tcd.nextInt();
		}
		
		for(int i = 0; i < valores.length ; i++){
			for(int j = 0; j < valores.length ; j++) {
				if(valores[j] < valores[i]) {
					int swap = valores[i];
					valores[i] = valores[j];
					valores[j] = swap;
				}
			}
		}
		
		System.out.println(Arrays.toString(valores));
		

		tcd.close();

	}
}
