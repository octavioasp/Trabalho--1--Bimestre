package com.octavio.Exercicio09;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		System.out.println("Descubra o tipo do triangulo");
		System.out.println("Digite as laterais do triangulo");
		triangulo();

	}

	static void triangulo() {
		System.out.println("Lado 01: ");
		Scanner sc = new Scanner(System.in);
		double lado01 = sc.nextDouble();

		System.out.println("Lado 02: ");
		double lado02 = sc.nextDouble();

		System.out.println("Lado 03: ");
		double lado03 = sc.nextDouble();

		if (lado01 == lado02 && lado02 == lado03) {
			System.out.println("Esse eh um traingulo Equilatero! ");

		}

		else if (lado01 == lado02 && lado02 != lado03 || lado01 == lado03 && lado03 != lado02
				|| lado02 == lado03 && lado03 != lado01) {
			System.out.println("Esse eh um traingulo Isosceles! ");
		}

		else if (lado01 != lado02 && lado02 != lado03) {
			System.out.println("Esse eh um traingulo Escaleno! ");

		}
		sc.close();
	}
	

}
