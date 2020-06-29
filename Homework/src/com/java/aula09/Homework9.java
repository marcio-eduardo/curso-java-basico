package com.java.aula09;
import java.util.Scanner;

public class Homework9 {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String operador;
		float n1, n2, r; 
		r = 0;
		
		System.out.print("Informe o primeiro n�mero: ");
		n1 = sc.nextFloat();
		System.out.print("Informe o segundo n�mero: ");
		n2 = sc.nextFloat();
		System.out.print("Informe o operador: ");
		operador = sc.next();
		
		sc.close();
			
			switch (operador) {
				case "+":
					r = (n1 + n2);
					break;
				case "-":
					r = (n1 - n2);
					break;
				case "*":
					r = (n1 * n2);
					break;
				case "/":
					r = (n1 / n2);
					break;
				default:
					System.out.println("Operador Inv�lido");
			}
	
		System.out.printf("O resultado da opera��o � %.2f \n", r);
	}
}
