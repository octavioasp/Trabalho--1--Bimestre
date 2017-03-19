package com.octavio.Exercicio10;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		System.out.println("Verifique a existencia do triangulo");
		existenciaDoTriangulo();
	}

	static void existenciaDoTriangulo() {

		System.out.println("Lado 01: ");
		Scanner sc = new Scanner(System.in);
		double lado01 = sc.nextDouble();

		System.out.println("Lado 02: ");
		double lado02 = sc.nextDouble();

		System.out.println("Lado 03: ");
		double lado03 = sc.nextDouble();
		
		double existencia01 = lado02 - lado03;
		double existencia02 = lado01 - lado03;
		double existencia03 = lado01 - lado02;
		
		double resultado01 = Math.abs(existencia01);
		double resultado02 = Math.abs(existencia02);
		double resultado03 = Math.abs(existencia03);

		if (lado01 > resultado01 && lado01 < lado02 + lado03) {
			System.out.println("As medidas formam um triangulo!");

		} else if (lado02 > resultado02 && lado02 < lado01 + lado03) {
			System.out.println("As medidas formam um triangulo!");

		} else if (lado03 > resultado03 && lado03 < lado01 + lado02) {
			System.out.println("As medidas formam um triangulo!");

		} else {
			System.out.println("As medidas não formam um triangulo!");

		}
		sc.close();
	}
}
