package com.java.aula18;
import java.util.Scanner;

public class homework18 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que tenha os seguintes métodos para contar o número de um determinado
		 *elemento (‘0’s ou ‘1’s)
		 *- na horizontal de uma determinada linha
		 *- na vertical de uma determinada linha
		 *- em uma determinada diagonal (faça a diagonal normal - “da esquerda para a direita” -,
		 *não precisa fazer a inversa)
		 *- na matriz inteira
		 */
		
		char[][] matrizBinaria = {	
				{'1', '0', '1', '1', '0'},
				{'0', '1', '1', '0', '1'},
				{'0', '1', '1', '0', '0'},
				};
		
		//int qtdUm = 0;
		//int qtdZero = 0;
		//int verificarLinha = 0;
		int numero = 0;
		numero = verificaDiagonalPrincipal(matrizBinaria);
		exibeMatriz(matrizBinaria);
		//qtdUm = verificaUm(matrizBinaria);
		//qtdZero = verificaZero(matrizBinaria);
		//verificarLinha = verificaUmLinha(matrizBinaria, numero);
		//System.out.println("A quantidade de '1' na linha " + numero + " é " + verificarLinha);
		System.out.println("Matriz principal " + numero);
		//System.out.println(qtdZero);
		
	}
	
	static int recebeNumero(int num) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma linha");
		num = sc.nextInt();
		sc.close();
		return num;
	}
	static void exibeMatriz(char[][] m) {
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 5; coluna++) { 
				System.out.print("|"+m[linha][coluna]+"|");
			}
			System.out.println();
		}	
	}
	static int verificaUm(char[][] m) {
		//verifica a quantidade de números "um"	
		int contador;
		contador = 0;
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 5; coluna++) {
				if (m[linha][coluna] == '1')
					contador++;
			}				
		}
		return contador;
	}
	static int verificaZero(char[][] m) {
		//verifica a quantidade de números "0"
		int contador = 0;;	
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 5; coluna++) {
				if (m[linha][coluna] == '0')
					contador++;
			}				
		}
		return contador;
	}
	static int verificaDiagonalPrincipal(char[][] m) {
		
		int contador = 0;
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				if ((linha == coluna) && (m[linha][coluna] == '1'))
					contador++;
					//if (m[linha][linha+1] == '1')
					//	fechou = true;
					//	if(m[linha][linha+2] == '1')
					//		fechou = true;
			}
		}
		return contador;
	}
	static int verificaZeroLinha(char[][] m, int num) {
	
	int contZero = 0;
	for (int linha = num; linha == num; linha++) {
		for(int coluna = 0; coluna < 5; coluna++) {
			if (m[linha][coluna] == 0)
				contZero++;
		}
	}	
	return contZero;
	}
	static int verificaUmLinha(char[][] m, int num) {
		recebeNumero(num);
		int contUm = 0;		
		for (int linha = num; linha == num; linha++) {
			for(int coluna = 0; coluna < 5; coluna++) {
				if (m[linha][coluna] == '1')
					contUm++;
			}
		}	
		return contUm;
		}
	
}
