package com.octavio.Exercicio21;

public class Exercicio21 {
	public static void main(String[] args) {

		Integer matriz[][][][] = new Integer[10][10][10][10];
		Integer contador = 1;

		for (Integer i = 0; i < 10; i++) {
			for (Integer j = 0; j < 10; j++) {
				for (Integer k = 0; k < 10; k++) {
					for (Integer l = 0; l < 10; l++) {
						matriz[i][j][k][l] = contador;
						System.out.print(" ");
						contador++;
						System.out.print(matriz[i][j][k][l]);
					}
					System.out.println();
				}

			}
		}
	}
}
