package com.octavio.Exercicio25;

import java.util.Scanner;

public class Exercicio25 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		menu();

	}

	public static void menu() {
		System.out.println("|                 BEM VINDO AO SITE                 |");
		System.out.println("|                                                   |");
		System.out.println("|                                                   |");
		System.out.println("|             TESTE CONTADOR DE ACESSOS             |");
		System.out.println("|                                                   |");
		System.out.println("|                1 - ATUALIZAR PAGINA               |");
		System.out.println("|                2 - SAIR                           |");
		System.out.println("|                                                   |");
		System.out.println("| Acessos: 1");
		contarAcessos();
	}

	public static void contarAcessos() {
		for (Integer i = 2; i <= 100000; i++) {
			Integer opcao = sc.nextInt();
			if (opcao == 1) {
				System.out.println("\n\n\n\n|                 BEM VINDO AO SITE                 |");
				System.out.println("|                                                   |");
				System.out.println("|                                                   |");
				System.out.println("|             TESTE CONTADOR DE ACESSOS             |");
				System.out.println("|                                                   |");
				System.out.println("|                1 - ATUALIZAR PAGINA               |");
				System.out.println("|                2 - SAIR                           |");
				System.out.println("|                                                   |");
				System.out.println("| Acessos: "+i+"");
				
					
				

			}

		}

	}
}
