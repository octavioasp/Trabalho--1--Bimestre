package com.octavio.Exercicio08;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio08 {
	private static Scanner sc = new Scanner(System.in);

	// Exibe na tela as opções de 1 a 5 para calcular diferentes areas.
	public static void main(String[] args) {
		System.out.println("1 - Calcular área do Triângulo");
		System.out.println("2 - Calcular área do Quadrado");
		System.out.println("3 - Calcular área do Retângulo");
		System.out.println("4 - Calcular área do Circulo");
		System.out.println("5 - Calcular área do Trapézio\n");
		opcao();

	}

	// Função para entrada da opção desejada.
	static void opcao() {
		System.out.println("Digite a opção para calcular: ");
		Integer opcao = sc.nextInt();
		if (opcao == 1) {
			triangulo();
		} else if (opcao == 2) {
			quadrado();
		} else if (opcao == 3) {
			retangulo();
		} else if (opcao == 4) {
			circulo();
		} else if (opcao == 5) {
			trapezio();
		}
		
	}

	// Função para calcular a area de um triângulo.
	static void triangulo() {

		System.out.println("Digite as laterais do triangulo");
		System.out.println("Lado 01: ");
		double lado01 = sc.nextDouble();

		System.out.println("Lado 02: ");
		double lado02 = sc.nextDouble();

		System.out.println("Lado 03: ");
		double lado03 = sc.nextDouble();

		double areaDoTriangulo = lado01 * lado02 * lado03;
		DecimalFormat df = new DecimalFormat("##.##");
		System.out.println("A área do Triangulo eh: " + df.format(areaDoTriangulo) + "M²");
		
	}

	// Função para calcular a area de um quadrado.
	static void quadrado() {
		System.out.println("Digite as laterais do quadrado em metros");
		System.out.println("Lado 01: ");
		double lado01 = sc.nextDouble();

		System.out.println("Lado 02: ");

		double lado02 = sc.nextDouble();

		double areaDoQuadrado = lado01 * lado02;
		DecimalFormat df = new DecimalFormat("##.##");
		System.out.println("A área do quadrado eh: " + df.format(areaDoQuadrado) + " M²");
		
	}

	// Função para calcular a area de um retângulo.
	static void retangulo() {
		System.out.println("Digite as laterais do retângulo em metros");
		System.out.println("Lado 01: ");
		double lado01 = sc.nextDouble();

		System.out.println("Lado 02: ");
		double lado02 = sc.nextDouble();

		double areaDoRetangulo = lado01 * lado02;
		DecimalFormat df = new DecimalFormat("##.##");
		System.out.println("A área do retangulo eh: " + df.format(areaDoRetangulo) + " M²");
		
	}

	// Função para calcular a area de um circulo.
	static void circulo() {

		System.out.println("Digite o raio do circulo em metros");
		System.out.println("Raio: ");
		double raio = sc.nextDouble();

		double areaDoCirculo = Math.pow(raio, 2) * Math.PI;
		DecimalFormat df = new DecimalFormat("##.##");
		System.out.println("A área do circulo eh: " + df.format(areaDoCirculo) + " M²");
		
	}

	// Função para calcular a area de um trapézio.
	static void trapezio() {

		System.out.println("Digite as medidas do trapezio");
		System.out.println("Altura do trapezio: ");
		double altura = sc.nextDouble();

		System.out.println("Base maior: ");
		double baseMaior = sc.nextDouble();

		System.out.println("Base menor: ");
		double baseMenor = sc.nextDouble();

		double areaDoTrapezio = (altura * (baseMaior + baseMenor)) / 2;
		DecimalFormat df = new DecimalFormat("##.##");
		System.out.println("A área do trapezio eh: " + df.format(areaDoTrapezio) + "M²");
		
	}

}
