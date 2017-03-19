package com.octavio.Exercicio06;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		usuario();
	}

	static void usuario() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Login: ");
		String login = sc.nextLine();
		if (login.equals("admin")) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		sc.close();
	}

}
