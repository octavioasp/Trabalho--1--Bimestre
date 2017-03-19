package com.octavio.Exercicio23;
import java.util.Arrays;

public class Exercicio23 {

	public static void main(String[] args) {
		Integer[][] matrizDeOrigem = { { 2, 5, 24, 32, 4 }, { 7, 30, 47, 12, 1 } };
		Integer[][] matrizDeDestino = new Integer[5][5];
		
		matrizDeDestino = matrizDeOrigem;
		
		System.out.println("Origem: ");
		for (Integer contador=0; contador < matrizDeOrigem.length ; contador++)
		{
			System.out.println(Arrays.toString(matrizDeOrigem[contador]));
			
		}
		System.out.println("Destino: ");
		
		for (Integer contador=0; contador < matrizDeOrigem.length ; contador++)
		{
			
			System.out.println(Arrays.toString(matrizDeDestino[contador]));
		}
				
	}
		

	}


