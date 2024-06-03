package main;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		/*
		 * 1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na
		 * tela se a soma entre A e B é mostre se a soma é menor que C
		 */

		Scanner tcd = new Scanner(System.in);
		int valores[] = new int[3];

		for (int i = 0; i < valores.length; i++) {
			System.out.printf("Escreva o %dº valor\n", i + 1);
			valores[i] = tcd.nextInt();
		}

		tcd.close();
		int resultado = valores[0] + valores[1];
		System.out.printf("Soma do primeiro e segundo valor: %d\n", resultado);
		String isMaior = (resultado > valores[2]) ?  "A soma entre A e B é maior que C"
				: "A soma entre A e B é menor que C";
		System.out.println(isMaior);
	}
}
