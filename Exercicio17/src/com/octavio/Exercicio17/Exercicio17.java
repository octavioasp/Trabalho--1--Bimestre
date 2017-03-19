package com.octavio.Exercicio17;

//Imprime Impares
public class Exercicio17 {

	public static void main(String[] args) {
		Integer [] vetorA = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,33,44,57,99,73,54,84,86,89,91,23};
		imprimirImpar(vetorA);

	}

	private static void imprimirImpar(Integer [] vetorA) {
		System.out.println("Os impares desse vetor são: ");
		for (Integer i = 0; i < vetorA.length; i++) {
			if (i % 2 == 0) {
				
				System.out.println(vetorA[i]);

			}

		}

	}

}
