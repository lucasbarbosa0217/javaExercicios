package main;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		/*
		 * 5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário
		 * de um usuário, calcule quantos salários mínimos esse
		 * 
		 * usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$
		 * 1.293,20).
		 * 
		 */
		
		Scanner tcd = new Scanner(System.in);

		
		double salarioMinimo = 1293.20;
		
		System.out.println("Qual seu salário?");
		double salario = tcd.nextDouble();
		
		double result = salario/salarioMinimo;
		
		System.out.printf("\nVocê recebe %.2f salários minimos.", result);


		tcd.close();

	}
}
