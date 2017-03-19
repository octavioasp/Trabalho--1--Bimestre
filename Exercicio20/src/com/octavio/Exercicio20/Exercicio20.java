package com.octavio.Exercicio20;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		String[][] matriz = new String[2][2];

		matriz[0][0] = "Andre";
		matriz[0][1] = "Felipe";
		matriz[1][0] = "Tiago";
		matriz[1][1] = "Ana Paula";

		System.out.println("Nesse mes o(a) responsavel eh: " + retornaNomes(matriz));

	}

	public static String retornaNomes(String[][] matriz) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um mes: ");
		String mes = sc.nextLine();
		sc.close();
		
		if ((mes.equals("Janeiro") || mes.equals("Fevereiro") || mes.equals("Março"))) {
			return matriz[0][0];

		} else if ((mes.equals("Abril") || mes.equals("Maio") || mes.equals("Junho"))) {
			return matriz[0][1];

		} else if ((mes.equals("Julho") || mes.equals("Agosto") || mes.equals("Setembro"))) {
			return matriz[1][0];

		} else if ((mes.equals("Outubro") || mes.equals("Novembro") || mes.equals("Dezembro"))) {
			return matriz[1][1];

		} else {

			System.out.println("Mes invalido");
			System.exit(0);
		}
		return null;

	}
}
