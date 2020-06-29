package com.java.aula09;
import java.util.Scanner;

public class Homework9b {
	public static void main(String[] args) {
		String nomeAluno;
		char escolaridadeAluno;
		int idadeAluno;
		float nota1, nota2, nota3, media;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Infome o nome do aluno: ");
		nomeAluno = sc.nextLine();
		System.out.print("Informe a escolaridade do aluno (F, M ou S): ");
		escolaridadeAluno = sc.next().charAt(0);
		System.out.print("Informe a idade do aluno (numero inteiro): ");
		idadeAluno = sc.nextInt();
		System.out.print("Nota1 do aluno (um n�mero real): ");
		nota1 = sc.nextFloat();
		System.out.print("Nota2 do aluno (um n�mero real): ");
		nota2 = sc.nextFloat();
		System.out.print("Nota3 do aluno (um n�mero real): ");
		nota3 = sc.nextFloat();
		// sempre feche o scanner quando n�o precisar mais dele
		sc.close();
		
		media = (nota1 + nota2 + nota3) /3;
		System.out.println("Nome do aluno: " + nomeAluno);
		System.out.println("Idade do aluno: " + idadeAluno);
		System.out.print("Escolaridade do aluno: ");
		
		switch (escolaridadeAluno) {
			case 'F':
				System.out.println("Ensino fundamental");
			case 'M':
				System.out.println("Ensino m�dio");
			default:			
				System.out.println("Ensino Superior");				
		}
		
		System.out.println("Nota 1 do aluno: " + nota1);
		System.out.println("Nota 2 do aluno: " + nota2);
		System.out.println("Nota 3 do aluno: " + nota3);
		System.out.println("M�dia do aluno: " + media);
		
		/*if (escolaridadeAluno == 'F')
			System.out.println("Ensino fundamental");
		else
		if (escolaridadeAluno == 'M')
			System.out.println("Ensino m�dio");
		else
			System.out.println("Ensino Superior");
			System.out.println("Nota 1 do aluno: " + nota1);
			System.out.println("Nota 2 do aluno: " + nota2);
			System.out.println("Nota 3 do aluno: " + nota3);
			System.out.println("M�dia do aluno: " + media);
		 */
		if (idadeAluno >= 18) {
			System.out.println("o aluno � maior de idade");
		} else {
			System.out.println("o aluno � menor de idade");
		}
	}
}

