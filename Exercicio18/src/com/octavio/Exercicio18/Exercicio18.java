package com.octavio.Exercicio18;

public class Exercicio18 {

	public static void main(String[] args) {
		
		Integer[] matrizA = {1,7,8};
		Integer[] matrizB = {1,4};
		comparaMatrizes(matrizA, matrizB);
	}

	private static void comparaMatrizes(Integer[] matrizA, Integer[] matrizB) {
		
		if(matrizA.length > matrizB.length){
			System.out.println("Matriz A eh maior!");
			
		} else if(matrizB.length > matrizA.length){
			System.out.println("Matriz B eh maior");
			
		}else{
			System.out.println("As matrizes são do mesmo tamanho!");
		}
		
		
	}

}
