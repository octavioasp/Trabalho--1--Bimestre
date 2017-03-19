package com.octavio.Exercicio22;

public class Exercicio22 {

	public static void main(String[] args) {
		Integer[] vetorDeOrigem = { 10, 14, 23, 6, 12, 15, 21, 25 };
		Integer[] vetorDeDestino = new Integer[8];

		System.arraycopy(vetorDeOrigem, 0, vetorDeDestino, 0, 8);
		
		System.out.println("Origem: ");
		for (Integer contador=0; contador < vetorDeOrigem.length ; contador++)
		{
			System.out.println(vetorDeOrigem[contador]+" ");
			
		}
		System.out.println("Destino: ");
		
		for (Integer contador=0; contador < vetorDeOrigem.length ; contador++)
		{
			
			System.out.println(vetorDeDestino[contador]+" ");
		}
				
	}
}