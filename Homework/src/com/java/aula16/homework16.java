package com.java.aula16;
import java.util.Scanner;

public class homework16 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		int total;
		int maiorNum;
		int menorNum;
		int diferencaLista;
		int cont = 1;
		int maiorQueDez;
		int somaTresMaioresLista;
	
		System.out.println("Quantos numeros deseja analisar?");
		total = sc.nextInt();
		int[] numero = new int [total];
		
		for(int i = 0; i < numero.length; i++) {			
			System.out.println("N�mero da passada: " + cont);
			numero[i] = sc.nextInt();
			cont++;
		}
		sc.close();
		
		maiorNum = buscarMaior(numero);
		menorNum = buscarMenor(numero);
		diferencaLista = calcularDiferenca(numero);
		maiorQueDez = maiorQue(numero);
		somaTresMaioresLista = calcularTresMaiores(numero); 
						
		System.out.println("O maior n�mero da lista �: " + maiorNum);
		System.out.println("O menor n�mero da lista �: " + menorNum);
		System.out.println("A diferen�a dos elementos da lista �: " + diferencaLista);
		System.out.println("Alista possui " + maiorQueDez + " n�mero(os) maior(es) que 10");
		System.out.println("A soma dos 3 maiores n�meros da lista �: " + somaTresMaioresLista);		
	}
	
	static int buscarMaior(int[] num) {		
		int maior = 0;
		int p;
		for (int i = 0; i < num.length; i++) {
			p = num[i];
			if (p > maior)
				maior = p;
		}
		return maior;			
	}
	static int buscarMenor(int[] num) {		
		int p;
		int menor = num[0];
		for (int i = 0; i < num.length; i++) {
			p = num[i];
			if (p < menor)
				menor = p;									
		}
		return menor;			
	}	
	static int calcularDiferenca(int[] num) {		
		int diferenca = 0;
		int subtrair;
		for (int i = 0; i < num.length; i++) {
			subtrair = num[i];
			if (diferenca < 0)
				diferenca = (diferenca * (-1)) - subtrair;
			else
				diferenca = diferenca - subtrair;
		}
		return diferenca;	
	}
	static int maiorQue(int[] num) {		
		int dez = 10;
		int p;
		int contador = 0;
		for (int i = 0; i < num.length; i++) {
			p = num[i];
			if (p > dez)
				contador++;
		}
		return contador;			
	}	
	static int calcularTresMaiores(int[] num) {
		int soma = 0;		
		ordenarLista(num);	
		
		for (int i = 0; i < num.length; i++) {				
			soma = num[0] + num[1] + num[2];						
		}							
		return soma;		
	}
	static int[] ordenarLista(int num[]) {	

		int trocaDePosicao = 0;
		int index = 0;
		while (index < num.length -1) {			
			if (num[index] < num[index + 1])  {
				trocaDePosicao = num[index];
				num[index] = num[index + 1];
				num[index + 1] = trocaDePosicao;
				//index = 0;
				continue;
			}		
			index++;			
		}
		return num;
	}	
	

}
