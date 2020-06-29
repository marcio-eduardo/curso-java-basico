package com.java.aula12;
import java.util.Scanner;

public class homework12 {
	public static void main(String[] args) {
			
		char escolaridade = 0;
		String nome;
		int idade;
		float nota;
		float totNota = 0;
		double media;
		
		Scanner sc = new Scanner(System.in);
		
		while (escolaridade != '*') {
			System.out.println("Digite a escolaridade do aluno: (F), (M), (S) ou (*) para encerrar");
			escolaridade = sc.next().charAt(0);
			
			if (escolaridade == '*') {
				System.out.println("Programa encerrado");
				break;
			}
			int contNota = 1;		
			System.out.println("Digite o nome do aluno:");
			nome = sc.next();
			System.out.println("Digite a idade do aluno:");
			idade = sc.nextInt();
			while (contNota <= 3) { 
				System.out.println("Digite nota " + contNota + " do aluno:");
				nota = sc.nextFloat();
				totNota = nota + totNota;
				contNota++;	
			}
			contNota--;
			media = totNota / contNota;
			
			System.out.println("Nome do aluno: " + nome);
			System.out.println("Idade: " + idade);
			if (idade >= 18) {
				System.out.println("Maior de idade");				
			} else {
				System.out.println("Menor de idade");
			}
			System.out.println("A m�dia do aluno �: " + media);					 			
			if ((escolaridade == 'f') || (escolaridade == 'F'))
				System.out.println("Aluno do ensino fundamental ");
					if ((escolaridade == 'm') || (escolaridade == 'M'))
						System.out.println("Aluno do ensino m�dio ");
							if ((escolaridade == 's') || (escolaridade == 'S'))
								System.out.println("Aluno do ensino superior ");							
			System.out.println("________________________________________");
		}
		sc.close();						
	}	
}
