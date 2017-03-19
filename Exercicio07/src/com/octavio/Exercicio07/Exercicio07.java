package com.octavio.Exercicio07;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		usuario();
	}

	static void usuario() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Login: ");
		String login = sc.nextLine();

		System.out.println("Senha: ");
		String senha = sc.nextLine();

		if (login.equals("admin") && senha.equals("admin")) {
			System.out.printf("Login efetuado com sucesso!", login);
		} else {
			System.out.println("Usuário e/ou senha incorretos!");
		}
		sc.close();
	}
}