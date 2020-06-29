package com.java.aula06;
import java.util.Scanner;

public class homework6 {
	
	public static void main(String[] args) {
				
		int n1, n2, n3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero");
		n1 = sc.nextInt();
		System.out.println("Digite o segundo n�mero");
		n2 = sc.nextInt();
		System.out.println("Digite o terceiro n�mero");
		n3 = sc.nextInt();
		sc.close();
		
		if (n1 == n2)
			System.out.println("Numeros 1 e 2 s�o iguais");
			if (n1 == n3)
				System.out.println("N�meros 1 e 3 s�o iguais");
				if (n2 == n3)
					System.out.println("N�meros 2 e 3 s�o iguais");
					if ((n1 + n2) > n3)
						System.out.println("A soma dos dois primeiros n�meros � maior que o terceiro");
					else
						System.out.println("A soma dos dois primeiros n�meros � menor ou igual ao terceiro");
						
		System.out.println("O primeiro n�mero �: " + n1);
		System.out.println("O segundo n�mero �: " + n2);
		System.out.println("O terceiro n�mero �: " + n3);
			
	}
}
