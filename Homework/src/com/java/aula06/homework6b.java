package com.java.aula06;
import java.util.Scanner;

public class homework6b {	
	public static void main(String[] args) {
		
		int codigo;
		int idade;
		float nota;
		char sexo;
		String genero;
		int nacionalidade;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("C�digo do aluno");
		codigo = sc.nextInt();
		System.out.println("Idade");
		idade = sc.nextInt();
		System.out.println("Nacionalidade: (1)Brasileiro e (2)Estrangeiro");
		nacionalidade = sc.nextInt();
		System.out.println("Nota:");
		nota = sc.nextFloat();
		System.out.println("Digite o sexo do aluno");
		sexo = sc.next().charAt(0);
		
		sc.close();
									
		if ((sexo == 'M' ) || (sexo == 'm')) {   
			genero = "Masculino";
			System.out.println("O aluno � do sexo " + genero);
		} else {
				genero = "Feminino";
				System.out.println("O aluno � do sexo " + genero);
		}
		
		if ((idade >= 18) && (nacionalidade == 1)) 
			System.out.println("O aluno � maior de idade e brasileiro");
			if ((idade < 18) && (nacionalidade == 1)) 
				System.out.println("O aluno � maior de idade e brasileiro");
				if ((idade >= 18) && (nacionalidade == 2)) 
					System.out.println("O aluno � maior de idade e estrangeiro");
					if ((idade < 18) && (nacionalidade == 2)) 
						System.out.println("O aluno � menor de idade e estrangeiro");
				
		if (nota >= 5) {
			System.out.println("O Aluno est� acima da m�dia");
		} else {
			System.out.println("O Aluno n�o esta na m�dia");
		}
		System.out.println("C�digo: " + codigo);
		System.out.println("Idade: " + idade);
		System.out.println("Nota: " + nota);						
	}
}
