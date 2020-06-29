package com.java.aula15;
import java.util.Scanner;

public class homework1502 {

	public static void main(String[] args) {
		
		String nome;
		char codigo;
		String escolaridade;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a escolaridade do aluno: ");
		codigo = nivelEscolar(sc);		
		System.out.println("Digite o nome do Aluno: ");
		nome = nomeAluno(sc);		
		escolaridade = escolaridadeAluno(codigo);
		System.out.println("Nome do Aluno: " + nome);
		System.out.println("Escolaridade: " + escolaridade);
		sc.close();
	}
	
	
 	static String escolaridadeAluno(char periodo) {
		String escolaridade = null;
		if ((periodo == 'F') || (periodo == 'f'))
			escolaridade = "Ensino Fundamental";
			if ((periodo == 'M') || (periodo == 'm'))
				escolaridade = "Ensino M�dio";
				if ((periodo == 'S') || (periodo == 's'))
					escolaridade = "Ensino Superior";		
		return escolaridade;
	}
	
	static String nomeAluno(Scanner s1) {
		s1 = new Scanner(System.in);
		String nome = s1.next();
		s1.close();
		return nome;
	}
	
	static char nivelEscolar(Scanner s2) {
		s2 = new Scanner(System.in);
		char codigo = s2.next().charAt(0);
		s2.close();
		return codigo;
	}

}
