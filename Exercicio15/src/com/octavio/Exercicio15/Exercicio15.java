package com.octavio.Exercicio15;

import java.util.Scanner;

public class Exercicio15 {
	private static Scanner sc = new Scanner(System.in);
	private static Integer espaco = 0;
	private static String[] nome = new String[10];
	private static String[] telefone = new String[10];
	private static String[] email = new String[10];

	public static void main(String[] args) {

		cadastro();

	}

	public static void cadastro() {

		System.out.println("■■■■■■■■   CADASTRO   ■■■■■■■■");
		System.out.println("|    1 - Novo Cliente        |");
		System.out.println("|    2 - Exibir Clientes     |");
		System.out.println("|    3 - Sair                |");
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");

		System.out.println("Escolha uma opcao: ");
		Integer opcao = sc.nextInt();
		switch (opcao) {
		case 1:
			novoCliente();
			break;
		case 2:
			exibirClientes();
			voltar();
			break;
		case 3:
			System.exit(0);
		default:
			System.out.println("Opcao Invalida");
			cadastro();

		}

	}

	// Funcao para inserir clientes...
	private static void novoCliente() {
		if (espaco > 9) { // Determina o numero maximo de clientes...
			System.out.println("Cadastro cheio!!");
			voltar();
		} else {
			System.out.print("Nome: ");
			nome[espaco] = sc.nextLine();
			if (nome[espaco].equals("")) {   //Exibe somente nome ate ser confirmado...
				nome[espaco] = sc.nextLine();
			}

			System.out.print("Telefone (Somente numeros): ");
			telefone[espaco] = sc.nextLine();

			System.out.print("E-mail: ");
			email[espaco] = sc.nextLine();

		}

		espaco++;

		System.out.println();
		cadastro();
	}

	// Funcao que exibe os clientes...
	private static void exibirClientes() {

		System.out.println("Nome                    |Telefone           |E-mail           ");
		for (int i = 0; i < nome.length; i++) {
			if (nome[i] == null) //Nao exibe null para espacos vazios...
				break;
			System.out.print((i+1)+ " - " +nome[i]);  // Enumera os nomes...

			for (int j = 0; j <= (20 - nome[i].length()); j++) //Posicionamento das informacoes...
				System.out.print(" ");
			System.out.print(telefone[i]);

			for (int k = 0; k < (20 - telefone[i].length()); k++)//Posicionamento das informacoes...
				System.out.print(" ");
			System.out.print(email[i]);

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
