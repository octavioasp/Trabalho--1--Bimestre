package com.octavio.Exercicio12;

public class Exercicio12 {

	public static void main(String[] args) {
		Integer[] vetor = { 6, 3, 1, 10, 5, 14, 21, 14, 2, 12 };

		Integer somaDosVetores = 0;
		for (Integer i = 0; i < vetor.length; i++) {
			somaDosVetores = somaDosVetores + vetor[i];
		}
		System.out.println("A soma dos valores eh: " + somaDosVetores);
	}
}
