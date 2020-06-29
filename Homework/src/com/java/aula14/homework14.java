package com.java.aula14;
import java.util.Scanner;

public class homework14 {
	public static void main (String[] args) {
		
		String nome;
		int sala, ano, quantAluno, quantSala, quantNota;
		float nota, somaNota, mediaAluno, somaMediaAluno, mediaSala, somaMediaSala, mediaAno;
		char proximoAno, proximaSala, proximoAluno;
		nome="s";
		quantAluno=0;
		quantSala=0;
		quantNota=0;
		somaNota=0;
		somaMediaAluno=0;
		somaMediaSala=0;
		proximoAno='s';
		proximaSala='s';
		proximoAluno='s';
		
		Scanner sc = new Scanner(System.in);
		//Enquanto for informado "s" para proximo ano, este bloco ser� executado
		while(proximoAno=='s') {
			System.out.print("\nAno o Aluno: ");
			ano = sc.nextInt();
			//Enquanto for informado "s" para proxima sala, este bloco ser� executado
			while(proximaSala=='s') {
				System.out.print("Sala do Aluno: ");
				sala = sc.nextInt();
				//Enquanto for informado "s" para proximo aluno, este bloco ser� executado
				while(nome!="n") {
					System.out.print("\nNome do Aluno: ");
					nome = sc.next();
					//Loop para informar as 4 notas do aluno
					for(int i=1; i<=4; i++) {
						System.out.print("Nota "+i+" :");
						nota=sc.nextFloat();
						quantNota=i;
						somaNota+=nota;
					}
					quantAluno++; //Contador para guardar a quantidade de alunos informadas
					mediaAluno=somaNota/quantNota;
					somaMediaAluno+=mediaAluno; //Soma das m�dias dos alunos para calcular a m�dia da turma
					somaNota=0; //Quantidade de notas zeradas para n�o interferir no resultado do loop
					System.out.printf("A m�dia do aluno � %.2f\n", mediaAluno); //informa a m�dia do aluno
					System.out.print("\nLan�ar novo Aluno? (s/n)"); //Pergunta se ser� lan�ado um novo aluno
					proximoAluno=sc.next().charAt(0);
					
					if(proximoAluno!='s') 
						break;
				}
				quantSala++; //Contador para guardar a quantidade de salas informadas
				mediaSala=somaMediaAluno/quantAluno;
				somaMediaAluno=0;//Soma das m�dias zeradas para n�o interferir no resultado da m�dia da proxima turma
				somaMediaSala+=mediaSala; //Soma das m�dias das salas para calcular a m�dia do ano
				quantAluno=0; //Quantidade de alunos zerados para n�o interferir no resultado do loop
				System.out.printf("\nA m�dia da Sala " +sala+ " � %.2f\n", mediaSala);
				System.out.print("\nLan�ar nova Sala? (s/n) ");
				proximaSala=sc.next().charAt(0);
				
				if(proximaSala!='s') 
					break;
			}
			mediaAno=somaMediaSala/quantSala;
			System.out.printf("\nA m�dia do "+ano+"� ano � %.2f\n", mediaAno);
			System.out.print("\nLan�ar novo Ano? (s/n)");
			proximoAno=sc.next().charAt(0);
			
			if(proximoAno!='s') 
				System.out.print("\nPrograma Finalizado");
				break;
		}
		sc.close();
	}
}


