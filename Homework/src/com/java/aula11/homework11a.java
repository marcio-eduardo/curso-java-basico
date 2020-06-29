package com.java.aula11;
import java.util.Scanner;

public class homework11a {
	public static void main(String[] args) {
		
		float temperatura = 0;
		double media = 0;
		int contador = 0;
		float soma = 0;
		
		Scanner sc = new Scanner(System.in);
				
		while (temperatura != -1) {
			System.out.print("Informe temperatura: ");
			temperatura = sc.nextFloat();
			
			soma = temperatura + soma;
			contador++;
			
			if (temperatura == -1)
				break;
			if ((temperatura > 10) || (temperatura < -10)) 
				System.out.println("O n�mero informado � invalido, informe novamente");
			if (temperatura == 0)
				continue;	
			else 
				media = soma / contador;						
		}	
		sc.close();
		System.out.printf("A m�dia das temperaturas �: %.2f ", media);		
	}
}
