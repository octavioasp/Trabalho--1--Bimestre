package com.octavio.Exercicio05;

import java.util.Scanner; // Pacote para entrada do teclado.

/*
 Autor: Octavio Augusto da Silva Pereira
 
 21/02/2017
 
 */

public class Exercicio05 {
	private static Scanner sc;

	public static void main(String[] args) {

		System.out.println("-Avaliação de notas-"); // Exibe o titulo da
													// aplicação na tela.
		avaliacao(); // Chama a função "avaliação".

	}

	// Função para avaliação das notas
	private static void avaliacao() {
		System.out.println("Digite a nota do aluno:"); // Exibe mensagem para
														// digitar a nota.
		float notas = sc.nextInt(); // Atribui a entrada à variavale notas.

		// Comandos de decisão para entrada das notas.
		if (notas >= 7 && notas <= 10) {
			System.out.println("APROVADO\n");

		} else if (notas >= 4 && notas < 7) {
			System.out.println("EXAME\n");

		} else if (notas >= 0 && notas < 4) {
			System.out.println("REPROVADO\n");

		} else if (notas < 0 || notas > 10) {
			System.out.println("NOTA INCORRETA\n");
			avaliacao();
		}
		opcoes(); // Chama a função "opções" sempre após a avaliação de uma
					// nota.
		
	}

	// Função 1: Digitar outra nota, 0: Sair;
	private static void opcoes() {
		// Exibe mensagem para informar as opções.
		System.out.println("Digite 1 para informar outra nota ou 0 para sair!");
		Integer opcao = sc.nextInt(); // Atribui a entrada à variavel
										// opcao.

		// Comandos de decisão para entrada das opções.
		if (opcao == 1) {
			avaliacao();

		} else if (opcao == 0) {
			System.exit(0);
		} else if (opcao != 0 && opcao != 1) {

			System.out.println("Opcao incorreta!\n");
			opcoes();

		}
		sc.close();

	}

}
