package com.java.aula11;
import java.util.Scanner;

public class homework11 {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		int maior; 
		int menor;
		int par = 0;
		int impar = 0;
					
		System.out.println("Informe -1 para encerrar");
		System.out.print("Numero: ");
		numero = sc.nextInt();
		menor = numero;
		maior = numero;
		
		while (numero != -1) {
								
			System.out.print("Numero: ");
			numero = sc.nextInt();										
			  			
			if ((numero > maior) && (numero != -1))
				maior = numero;
				if ((numero < menor) && (numero != -1))
					menor = numero;
					if (numero % 2 == 0)
						par++;
					else
						impar++;					
		}		
		sc.close();	
		System.out.println("O menor n�mero �: " + menor);
		System.out.println("O maior n�mero �: " + maior);
		System.out.println("Quantidade numeros pares �: " + par);
		System.out.println("Quantidade numeros impares �: " + impar);		
	}
}
