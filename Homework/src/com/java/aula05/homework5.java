package com.java.aula05;
import java.util.Scanner;

public class homework5 {
	
	public static void main(String[] args) {
		
		String nomeAluno;
		int idade;
		float nota;
		float soma = 0f;
		double media;
		int total = 1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno");
		nomeAluno = sc.nextLine();
		System.out.println("Digite a idade");
		idade = sc.nextInt();
		
		while (total < 6 ) { 
			
			System.out.println("Informe Nota " + total);
			nota = sc.nextFloat();
			soma = soma + nota;
			total++;		
		}		
		sc.close();
		
		total--;
		media = soma / total;
		
		System.out.println("Aluno: " + nomeAluno);
		System.out.println("Idade: " + idade);
		System.out.printf( "Somatório das notas = %.2f \nA Média do aluno = %.2f", soma, media);			
	}

}

