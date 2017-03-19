package com.octavio.Exercicio16;

import java.util.Scanner;

public class Exercicio16 {
	private static Scanner sc = new Scanner(System.in);
	private static Integer espaco = 0;
	private static String[] nome = new String[10];

	public static void main(String[] args) {

		cadastro();

	}

	public static void cadastro() {

		System.out.println("■■■■■■■■   CADASTRO   ■■■■■■■■");
		System.out.println("|    1 - Cadastrar Nome      |");
		System.out.println("|    2 - Listar Nomes        |");
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");

		System.out.println("Escolha uma opcao: ");
		Integer opcao = sc.nextInt();
		switch (opcao) {
		case 1:
			novoNome();
			break;
		case 2:
			listarNomes();
			voltar();
			break;
		default:
			System.out.println("Opcao Invalida");
			cadastro();

		}

	}

	// Funcao para inserir nomes...
	private static void novoNome() {
		if (espaco > 9) { // Determina o numero maximo de clientes...
			System.out.println("Cadastro cheio!!");
			voltar();
		} else {
			System.out.print("Nome: ");
			nome[espaco] = sc.nextLine();
			if (nome[espaco].equals("")) { // Exibe somente nome ate ser
											// confirmado...
				nome[espaco] = sc.nextLine();
			}

		}

		espaco++;

		System.out.println();
		cadastro();
	}

	// Funcao que exibe os nomes...
	private static void listarNomes() {

		System.out.println("Nome");
		System.out.println();
		for (int i = 0; i < nome.length; i++) {
			if (nome[i] == null) // Nao exibe null para espacos vazios...
				break;
			System.out.print((i+1)+ " - " +nome[i]);

			System.out.println();
		}

	}

	// Funcao para voltar ao menu principal...
	private static void voltar() {

		System.out.println();
		System.out.println("Escolha uma opcao!");
		System.out.println("1 - Voltar");
		System.out.println("2 - Sair");
		Integer opcao = sc.nextInt();
		switch (opcao) {
		case 1:
			cadastro();
			break;
		case 2:
			System.exit(0);
			break;
		default:
			System.out.println("Opcao Invalida");
			voltar();

		}

	}
}
