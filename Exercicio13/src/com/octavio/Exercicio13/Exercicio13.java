package com.octavio.Exercicio13;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		System.out.println("-- Escolha 5 opcoes para o Menu --)");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha o 1º Titulo");
		String titulo1 = sc.nextLine();
		System.out.println("Escolha o 2º Titulo");
		String titulo2 = sc.nextLine();
		System.out.println("Escolha o 3º Titulo");
		String titulo3 = sc.nextLine();
		System.out.println("Escolha o 4º Titulo");
		String titulo4 = sc.nextLine();
		System.out.println("Escolha o 5º Titulo");
		String titulo5 = sc.nextLine();
		sc.close();
		
		System.out.println("\nMenu");
		System.out.println("1 - " +titulo1);
		System.out.println("2 - " +titulo2);
		System.out.println("3 - " +titulo3);
		System.out.println("4 - " +titulo4);
		System.out.println("5 - " +titulo5);
		

	}

}
