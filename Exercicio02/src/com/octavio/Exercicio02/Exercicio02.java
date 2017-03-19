package com.octavio.Exercicio02;
import java.util.Scanner;

/*
 Autor: Octavio Augusto da Silva Pereira
 21/02/2017
 */

public class Exercicio02 {

	public static void main(String[] args) {
		System.out.println("Multiplicacao");
		multiplicacao();
	}

	static void multiplicacao() {
		System.out.println("Digite um numero: ");
		Scanner sc = new Scanner(System.in);
		double numero1 = sc.nextInt();
		System.out.println("Digite outro numero: ");
		double numero2 = sc.nextInt();
		double resultado;
		resultado = numero1 * numero2;
		System.out.println("O resultado da exponenciacao eh: " + resultado);
		sc.close();
	}
	

}
