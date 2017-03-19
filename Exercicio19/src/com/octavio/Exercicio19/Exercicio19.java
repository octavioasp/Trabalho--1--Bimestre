package com.octavio.Exercicio19;

public class Exercicio19 {

	public static void main(String[] args) {

		for (double numeros : mediaAluno()) {
			System.out.println(numeros);
		}
	}

	private static double[] mediaAluno() {
		double media = 7.5;
		double soma = 0;

		double[] notas = { 8.0, 9.0, 7.0, 7.0, 7.0 };

		for (Integer i = 0; i < notas.length; i++) {
			soma = soma + notas[i];
		}
		double mediaAluno = soma / notas.length;
		System.out.println("Sua media eh: " +mediaAluno);

		if (mediaAluno >= media) {
			System.out.println("Voce está na media!\n");
			System.out.println("Suas notas:");
			return notas;
		}
		if (mediaAluno < media) {

			System.out.println("Notas abaixo da media");
			return notas;
		}

		return null;
	}
}