package com.octavio.Exercicio24;
import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {

		Integer[] vetor = { 1, 4, 7, 15, 14, 25 };

		System.out.println("Vetor");

		for (Integer contador = 0; contador < vetor.length; contador++) {
			System.out.println(+vetor[contador]);
		}

		System.out.println("\nA contagem de posicoes começa do 0\n Ex: 0,1,2,3... ");
		System.out.println("\nEscolha a posição que deseja alterar: ");
		Scanner v1 = new Scanner(System.in);
		Integer posicao = v1.nextInt();

		switch (posicao) {
		case 0:
			System.out.println("Escolha um novo valor: ");
			Integer novoNumero = v1.nextInt();
			vetor[0] = novoNumero;
			break;

		case 1:
			System.out.println("Escolha um novo valor: ");
			novoNumero = v1.nextInt();
			vetor[1] = novoNumero;
			break;

		case 2:
			System.out.println("Escolha um novo valor: ");
			novoNumero = v1.nextInt();
			vetor[2] = novoNumero;
			break;

		case 3:
			System.out.println("Escolha um novo valor: ");
			novoNumero = v1.nextInt();
			vetor[3] = novoNumero;
			break;

		case 4:
			System.out.println("Escolha um novo valor: ");
			novoNumero = v1.nextInt();
			vetor[4] = novoNumero;
			break;

		case 5:
			System.out.println("Escolha um novo valor: ");
			novoNumero = v1.nextInt();
			vetor[5] = novoNumero;
			break;
				
		}

		if(posicao < vetor.length){
		System.out.println("Seu novo vetor");

		for (Integer contador = 0; contador < vetor.length; contador++) {
		
			System.out.println(+vetor[contador]);
			}
		
		}else{
			System.out.println("Opcao invalida!!!");
		}
		v1.close();
	}
}
