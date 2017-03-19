package com.octavio.Exercicio04;

/*
 Autor: Octavio Augusto da Silva Pereira
 
 21/02/2017
 
 */

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		System.out.println("Calculo de exponenciacao");
		exponenciacao();

	}

	static void exponenciacao() {
		System.out.println("Digite um numero: ");
		Scanner sc = new Scanner(System.in);
		double numero1 = sc.nextInt();
		double resultado = Math.pow(numero1, numero1);
		System.out.println("O resultado da exponenciacao eh: " + resultado);
		sc.close();
	}

}
