package com.octavio.Exercicio14;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio14 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		opcoes();
		
	}

	static void opcoes() {
		System.out.println("CALCULADORA");
		System.out.println("Digite 1 para operacoes basicas");
		System.out.println("Digite 2 para Fatorial");
		System.out.println("Digite 3 para Potenciacao");
		System.out.println("Digite 0 para Sair");
		Integer opcao = sc.nextInt();

		if (opcao == 1) {
			calculadoraBasica();

		} else if (opcao == 2) {
			fatorial();

		} else if (opcao == 3) {
			potenciacao();

		} else if (opcao == 0) {
			System.exit(0);

		} else
			System.out.println("Opcao invalida");
			opcoes();

	}

	static void calculadoraBasica() {

		System.out.println("Digite 1 para Soma");
		System.out.println("Digite 2 para Subtracao");
		System.out.println("Digite 3 para Multiplicacao");
		System.out.println("Digite 4 para Divisao");
		System.out.println("Digite 0 para Voltar");

		Integer opcao = sc.nextInt();

		if (opcao == 1) {
			System.out.println("Digite um numero");
			double numero1 = sc.nextDouble();
			System.out.println("Digite outro numero");
			double numero2 = sc.nextDouble();
			double resultado = numero1 + numero2;

			DecimalFormat df = new DecimalFormat("##.##");
			System.out.println("A Soma eh: " + df.format(resultado));

		} else if (opcao == 2) {
			System.out.println("Digite um numero");
			double numero1 = sc.nextDouble();
			System.out.println("Digite outro numero");
			double numero2 = sc.nextDouble();
			double resultado = numero1 - numero2;

			DecimalFormat df = new DecimalFormat("##.##");
			System.out.println("A Subtracao eh: " + df.format(resultado));

		} else if (opcao == 3) {
			System.out.println("Digite um numero");
			double numero1 = sc.nextDouble();
			System.out.println("Digite outro numero");
			double numero2 = sc.nextDouble();
			double resultado = numero1 * numero2;

			DecimalFormat df = new DecimalFormat("##.##");
			System.out.println("A Multiplicacao eh: " + df.format(resultado));

		} else if (opcao == 4) {
			System.out.println("Digite um numero");
			double numero1 = sc.nextDouble();
			System.out.println("Digite outro numero");
			double numero2 = sc.nextDouble();
			double resultado = numero1 / numero2;

			DecimalFormat df = new DecimalFormat("##.##");
			System.out.println("A Divisao eh: " + df.format(resultado));

		} else if (opcao == 0) {
			opcoes();

		} else
			System.out.println("Opcao Invalida, Digite novamente");

		calculadoraBasica();

	}

	static void fatorial() {
		System.out.println("Digite um numero");
		Integer fatorial = 1;
		Integer numero = sc.nextInt();

		for (Integer contador = 2; contador <= numero; contador++) {
			fatorial *= contador;
		}
		DecimalFormat df = new DecimalFormat("##.##");
		System.out.println("O fatorial de " + numero + " é " + df.format(fatorial)+"\n");
	}

	static void potenciacao() {

		System.out.println("Digite um numero");
		double numero = sc.nextDouble();
		System.out.println("Digite a potencia");
		double potencia = sc.nextDouble();
		double resultado = Math.pow(numero, potencia);

		DecimalFormat df = new DecimalFormat("##.##");
		System.out.println(
				df.format(numero) + " elevado à " + df.format(potencia) + " eh: " + df.format(resultado) + "\n");
	}

}
