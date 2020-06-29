package com.java.aula11;
import java.util.Scanner;

public class homework1101 {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero, maior, menor, par, impar;
		
		par = 0;
		impar = 0;
		
		System.out.println("-1 encerra o programa");
		
		System.out.print("Numero: ");
		numero=sc.nextInt();
		
		if (numero != -1) {
			menor = numero;
			maior = numero;		
		} else {
			menor = 0;
			maior = 0;
		}
			
		do {					
			if (numero == -1) break;				
			if (numero < menor)
				menor = numero;					
			if (numero > maior)
				maior = numero;					
			if (numero % 2 != 0) {
				impar++;
			} else {
					par++;
			}
			
			System.out.print("Numero: ");
			numero = sc.nextInt();
		
		} while (numero!=-1);
		
		sc.close();	
		
		System.out.println("O menor n�mero �: " + menor);
		System.out.println("O maior n�mero �: " + maior);
		System.out.println("Quantidade n�meros pares �: " + par);
		System.out.println("Quantidade n�meros impares �: " + impar);
		
	}
}

