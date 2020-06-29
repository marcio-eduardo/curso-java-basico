package com.java.aula15;
import java.util.Scanner;

public class homework15 {
	public static void main(String[] args) {
		 
		int [] numero = new int [6];		
		Scanner sc = new Scanner(System.in);		
		System.out.println("Digite 6 n�meros");
		for(int i = 0; i < 6; i++) {
			numero[i] = sc.nextInt();
		}
		sc.close();
		
			qtdPar(numero);
			qtdImpar(numero);
			somarImpar(numero);
			ocorreZeros(numero);
			listMedia(numero);
			numLista(numero);
			
	}
	//m�todos com array
	static void qtdPar(int[] num) {
		int contPar = 0;
		for (int linha = 0; linha < 6; linha++)
			if ((num[linha] !=0) && (num[linha]%2 == 0))
				contPar++;
		System.out.println("Quantidade par " + contPar);						
	}	
	static void qtdImpar(int[] num) {
		int contImpar = 0;
		for (int linha = 0; linha < 6; linha++)
			if ((num[linha] !=0) && (num[linha]%2 != 0))
				contImpar++;
		System.out.println("Quantidade Impar " + contImpar);
	}	
	static void somarImpar(int[] num) {
		int soma = 0;
		for (int linha = 0; linha < 6; linha++)
			if ((num[linha] !=0) && (num[linha]%2 != 0))
				soma = num[linha] + soma;
		System.out.println("Soma dos n�meros impares: " + soma);
	}	
	static void ocorreZeros (int[] num) {
		int contZero = 0;
		
		for (int linha = 0; linha < 6; linha++) {			
			if (num[linha] == 0) {	
				contZero = 1;
			}
		}
		if (contZero == 1)
			System.out.println("Ocorreu Zero");
		else
			System.out.println("N�o ocorreu Zeros");
	}	
	static void listMedia(int[] num) {
		float media;
		int soma = 0;
		for (int linha = 0; linha < 6; linha++)
			soma = num[linha] + soma;
		media = (float)soma / 6;
		System.out.println("Media dos valores da lista: " + media);
	}
	static void numLista(int[] num) {
		int cont = 1;
		for (int linha = 0; linha < 6; linha++) {		
			System.out.println("Elemento " + (cont) + " da lista: " + num[linha]);
			cont++;
		}
	}
	
	//m�todos sem array				
	static void quantidadePar(int num1, int num2, int num3, int num4, int num5, int num6) {
		int contPar = 0;		
		if (num1 %2 == 0) 
			contPar++;
			if(num2 %2 == 0)
				contPar++;
				if(num3 %2 == 0)
					contPar++;
					if(num4 %2 == 0)
						contPar++;
						if(num5 %2 == 0)
							contPar++;
							if(num6 %2 == 0)
								contPar++;	
	System.out.println("Quantidade par: " + contPar);
	}
	
	static void quantidadeImpar(int num1, int num2, int num3, int num4, int num5, int num6) {
		int contImpar = 0;
		if (num1 %2 != 0) 
			contImpar++;
			if(num2 %2 != 0)
				contImpar++;
				if(num3 %2 != 0)
					contImpar++;
					if(num4 %2 != 0)
						contImpar++;
						if(num5 %2 != 0)
							contImpar++;
							if(num6 %2 != 0)
								contImpar++;	
	System.out.println("Quantidade impar: " + contImpar);
					
	}
	
	static void somaImpar(int num1, int num2, int num3, int num4, int num5, int num6) {
		int soma = 0;
		if (num1 %2 != 0) 
			soma = num1 + soma;
			if(num2 %2 != 0)
				soma = num2 + soma;
				if(num3 %2 != 0)
					soma = num3 + soma;
					if(num4 %2 != 0)
						soma = num4 + soma;
						if(num5 %2 != 0)
							soma = num5 + soma;
							if(num6 %2 != 0)
								soma = num6 + soma;
	System.out.println("Soma impar: " + soma);
	}	
	
	static int verificarZero(int num1, int num2, int num3, int num4, int num5, int num6) {
		int contZero = 0;
		if (num1 == 0) 
			contZero++;
			if(num2 == 0)
				contZero++;
				if(num3 == 0)
					contZero++;
					if(num4 == 0)
						contZero++;
						if(num5 == 0)
							contZero++;
							if(num6 == 0)
								contZero++;
		return contZero;
		
		
			
	}
	
	static void verificarMedia(int num1, int num2, int num3, int num4, int num5, int num6) {
		float media = (float)(num1 + num2 + num3 + num4 + num5 + num6) / 6;
		System.out.println("M�dia dos n�meros da lista: " + media);
			
	}
	
	static void elementosLista(int num1, int num2, int num3, int num4, int num5, int num6) {
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
			
	}
	
}
