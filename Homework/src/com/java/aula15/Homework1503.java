package com.java.aula15;
import java.util.Scanner;

public class Homework1503 {
	public static void main(String[] args) {
		
		
		int numero1, numero2, numero3, numero4, numero5;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 5 n�meros");
		numero1 = sc.nextInt();
		numero2 = sc.nextInt();
		numero3 = sc.nextInt();
		numero4 = sc.nextInt();
		numero5 = sc.nextInt();
		sc.close();
		
		int maior2 = maiorDois(numero1, numero2);
		int menor2 = menorDois(numero1, numero2);
		int maior3 = maiorTres(numero1, numero2, numero3);
		int menor3 = menorTres(numero1, numero2, numero3);
		int maior4 = maiorQuatro(numero1, numero2, numero3, numero4);
		int menor4 = menorQuatro(numero1, numero2, numero3, numero4);
		int maior5 = maiorCinco(numero1, numero2, numero3, numero4, numero5);
		int menor5 = menorCinco(numero1, numero2, numero3, numero4, numero5);
		
		
		System.out.println("Maior de dois: " + maior2);
		System.out.println("Menor de dois: " + menor2);
		System.out.println("Maior de tr�s: " + maior3);
		System.out.println("Menor de tr�s: " + menor3);
		System.out.println("Maior de quatro: " + maior4);
		System.out.println("Menor de quatro: " + menor4);
		System.out.println("Maior de cinco: " + maior5);
		System.out.println("Menor de cinco: " + menor5);
		
				
	}
	
	static int maiorDois(int num1, int num2) {
		int maior = 0;
		if(num1 > num2)
			maior = num1;
		else
			maior = num2;
		return maior;		
	}
	
	static int menorDois(int num1, int num2) {
		int menor = 0;
		if(num1 < num2)
			menor = num1;
		else
			menor = num2;
		return menor;	
	}
	
	static int maiorTres(int num1, int num2, int num3) {
		int maior = 0;
		if ((num1 > num2) && (num1 > num3))
			maior = num1;
			if ((num2 > num1) && (num2 > num3))
				maior = num2;
				if ((num3 > num1) && (num3 > num2))
					maior = num3;
		
		return maior;		
	}
	
	static int menorTres(int num1, int num2, int num3) {
		int menor = 0;
		if ((num1 < num2) && (num1 < num3))
			menor = num1;
			if ((num2 < num1) && (num2 < num3))
				menor = num2;
				if ((num3 < num1) && (num3 < num2))
					menor = num3;
		
		return menor;		 
		
	}
	
	static int maiorQuatro(int num1, int num2, int num3, int num4) {
		int maior = 0;
		if ((num1 > num2) && (num1 > num3) && (num1 > num4))
			maior = num1;
			if ((num2 > num1) && (num2 > num3) && (num2 > num4))
				maior = num2;
				if ((num3 > num1) && (num3 > num2) && (num3 > num4))
					maior = num3;
					if ((num4 > num1) && (num4 > num2) && (num4 > num3))
						maior = num4;
		
		return maior;		
		
	}
	
	static int menorQuatro(int num1, int num2, int num3, int num4) {
		int menor = 0;
		if ((num1 < num2) && (num1 < num3) && (num1 < num4))
			menor = num1;
			if ((num2 < num1) && (num2 < num3) && (num2 < num4))
				menor = num2;
				if ((num3 < num1) && (num3 < num2) && (num3 < num4))
					menor = num3;
					if ((num4 < num1) && (num4 < num2) && (num4 < num3))
						menor = num4;
		return menor;
		
	}
	
	static int maiorCinco(int num1, int num2, int num3, int num4, int num5) {
		int maior = 0;
		if ((num1 > num2) && (num1 > num3) && (num1 > num4) && (num1 > num5))
			maior = num1;
			if ((num2 > num1) && (num2 > num3) && (num2 > num4) && (num2 > num5))
				maior = num2;
				if ((num3 > num1) && (num3 > num2) && (num3 > num4) && (num3 > num5))
					maior = num3;
					if ((num4 > num1) && (num4 > num2) && (num4 > num3) && (num4 > num5))
						if ((num5 > num1) && (num5 > num2) && (num5 > num3) && (num5 > num4))
						maior = num5;
		return maior;
	}
	
	static int menorCinco(int num1, int num2, int num3, int num4, int num5) {
		int menor = 0;
		if ((num1 < num2) && (num1 < num3) && (num1 < num4) && (num1 < num5))
			menor = num1;
			if ((num2 < num1) && (num2 < num3) && (num2 < num4) && (num1 < num5))
				menor = num2;
				if ((num3 < num1) && (num3 < num2) && (num3 < num4) && (num1 < num5))
					menor = num3;
					if ((num4 < num1) && (num4 < num2) && (num4 < num3) && (num1 < num5))
						menor = num4;
						if ((num5 < num1) && (num5 < num2) && (num5 < num3) && (num5 < num4))
							menor = num5;
		return menor;
	}

}
