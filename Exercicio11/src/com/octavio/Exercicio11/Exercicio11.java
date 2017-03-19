package com.octavio.Exercicio11;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		data();

	}

	public static void data() {
		System.out.println("Digite uma data no formato: dd/mm/aaaa: ");

		String[] mesExtenso = { "Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho", "Julho", "Agosto",
				"Setembro", "Outubro", "Novembro", "Dezembro" }; // String com
																	// os meses

		Scanner sc = new Scanner(System.in);
		String dataEntrada = sc.nextLine();

		char[] dataToChar = new char[10];
		for (Integer i = 0; i < 10; i++) {
			dataToChar[i] = dataEntrada.charAt(i); // Passa a String pro array
													// de char
		}
	
		String ano = dataToChar[6] + "" + dataToChar[7] + "" + dataToChar[8] + "" + dataToChar[9];

		String x;
		x = "" + dataEntrada.charAt(0) + dataEntrada.charAt(1);
		Integer diaValido = Integer.parseInt(x);

		String y;
		y = "" + dataEntrada.charAt(3) + dataEntrada.charAt(4);
		Integer mesValido = Integer.parseInt(y);

		String z;
		z = "" + dataEntrada.charAt(6) + dataEntrada.charAt(7) + dataEntrada.charAt(8) + dataEntrada.charAt(9);
		Integer anoBissexto = Integer.parseInt(z);

		// Comparaçoes
		// Janeiro
		if (mesValido == 1 && (diaValido >= 1 && diaValido <= 31)) {

			System.out.println(diaValido + " de " + mesExtenso[0] + " de " + ano);

		}
		;
		if (mesValido == 1 && (diaValido <= 0 || diaValido >= 32)) {

			System.out.println("Dia Invalido");

		}
		;
		// Fevereiro
		if (mesValido == 2 && (anoBissexto % 400 == 0)
				|| (anoBissexto % 4 == 0 && anoBissexto % 100 != 0) && (diaValido >= 1 && diaValido <= 29)) {

			System.out.println(diaValido + " de " + mesExtenso[1] + " de " + ano);

		}
		;
		if (mesValido == 2 && !((anoBissexto % 400 == 0) || (anoBissexto % 4 == 0 && anoBissexto % 100 != 0))
				&& (diaValido >= 1 && diaValido <= 28)) {

			System.out.println(diaValido + " de " + mesExtenso[1] + " de " + ano);

		}
		;
		if (mesValido == 2 && !((anoBissexto % 400 == 0) || (anoBissexto % 4 == 0 && anoBissexto % 100 != 0))
				&& (diaValido > 28)) {

			System.out.println("Dia Invalido");

		}
		;

		if (mesValido == 2 && (diaValido < 1 || diaValido > 29)) {

			System.out.println("Dia Invalido!");

		}
		;
		// Março
		if (mesValido == 3 && (diaValido >= 1 && diaValido <= 31)) {

			System.out.println(diaValido + " de " + mesExtenso[2] + " de " + ano);

		}
		;
		if (mesValido == 3 && (diaValido <= 0 || diaValido >= 32)) {

			System.out.println("Dia Invalido");

		}
		;
		// Abril
		if (mesValido == 4 && (diaValido >= 1 && diaValido <= 30)) {

			System.out.println(diaValido + " de " + mesExtenso[3] + " de " + ano);

		}
		;
		if (mesValido == 4 && (diaValido <= 0 || diaValido >= 31)) {

			System.out.println("Dia Invalido");

		}
		;
		// Maio
		if (mesValido == 5 && (diaValido >= 1 && diaValido <= 31)) {

			System.out.println(diaValido + " de " + mesExtenso[4] + " de " + ano);

		}
		;
		if (mesValido == 5 && (diaValido <= 0 || diaValido >= 32)) {

			System.out.println("Dia Invalido");

		}
		;
		// Junho
		if (mesValido == 6 && (diaValido >= 1 && diaValido <= 30)) {

			System.out.println(diaValido + " de " + mesExtenso[5] + " de " + ano);

		}
		;
		if (mesValido == 6 && (diaValido <= 0 || diaValido >= 31)) {

			System.out.println("Dia Invalido");

		}
		;
		// Julho
		if (mesValido == 7 && (diaValido >= 1 && diaValido <= 31)) {

			System.out.println(diaValido + " de " + mesExtenso[6] + " de " + ano);

		}
		;
		if (mesValido == 7 && (diaValido <= 0 || diaValido >= 32)) {

			System.out.println("Dia Invalido");

		}
		;
		// Agosto
		if (mesValido == 8 && (diaValido >= 1 && diaValido <= 31)) {

			System.out.println(diaValido + " de " + mesExtenso[7] + " de " + ano);

		}
		;
		if (mesValido == 8 && (diaValido <= 0 || diaValido >= 32)) {

			System.out.println("Dia Invalido");

		}
		;
		// Setembro
		if (mesValido == 9 && (diaValido >= 1 && diaValido <= 30)) {

			System.out.println(diaValido + " de " + mesExtenso[8] + " de " + ano);

		}
		;
		if (mesValido == 9 && (diaValido <= 0 || diaValido >= 31)) {

			System.out.println("Dia Invalido");

		}
		;
		// Outubro
		if (mesValido == 10 && (diaValido >= 1 && diaValido <= 30)) {

			System.out.println(diaValido + " de " + mesExtenso[9] + " de " + ano);

		}
		;
		if (mesValido == 10 && (diaValido <= 0 || diaValido >= 31)) {

			System.out.println("Dia Invalido");

		}
		;
		// Novembro
		if (mesValido == 11 && (diaValido >= 1 && diaValido <= 30)) {

			System.out.println(diaValido + " de " + mesExtenso[10] + " de " + ano);

		}
		;
		if (mesValido == 11 && (diaValido <= 0 || diaValido >= 31)) {

			System.out.println("Dia Invalido");

		}
		;
		// Dezembro
		if (mesValido == 12 && (diaValido >= 1 && diaValido <= 31)) {

			System.out.println(diaValido + " de " + mesExtenso[11] + " de " + ano);

		}
		;
		if (mesValido == 12 && (diaValido <= 0 || diaValido >= 32)) {

			System.out.println("Dia Invalido");

		}
		;
		sc.close();

	}

}