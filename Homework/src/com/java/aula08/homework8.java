package com.java.aula08;
import java.util.Scanner;

public class homework8 {
	public static void main(String[] args) {
				
		char escolaridade;
		boolean matricula = false;
		int periodo;
		float media;
		int status;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite Status da matricula: (1) ativo, (2) inativo");
		status = sc.nextInt();
		System.out.println("Escolaridade: (F) Fundaental, (M) M�dio, (S) Superior");
		escolaridade = sc.next().charAt(0);
		System.out.println("Digite a m�dia:");
		media = sc.nextInt();
		System.out.println("Dgite per�odo: 1, 2, 3, ou 4");
		periodo = sc.nextInt();
		
		sc.close();
		
		if (status == 1)
			matricula = true;
		
		if (escolaridade == 'F') {
			System.out.println("Escolaridade do aluno: Ensino Fundamental");
		} if (escolaridade == 'M') {
			System.out.println("Escolaridade do aluno: Ensino M�dio");
		} if ((escolaridade == 'S') && ((periodo == 1) || (periodo == 2))) {
			System.out.println("Escolaridade do aluno: Ensino Superior");
			System.out.println("O aluno se encontra no inicio do curso");
		} if ((escolaridade == 'S') && (periodo == 3)) {
			System.out.println("Escolaridade do aluno: Ensino Superior");
			System.out.println("O aluno se encontra no meio do curso");
		} if ((escolaridade == 'S') && (periodo == 4)) {
			System.out.println("Escolaridade do aluno: Ensino Superior");
			System.out.println("O aluno se encontra no final do curso");
		}
											
		if (matricula == true) {
			System.out.println("A matricula do aluno esta ativa.");			
		} else {
			System.out.println("A matricula do aluno esta inativa.");
		}
							
		if ((escolaridade == 'F') && (media < 3))
			System.out.println("A m�dia do aluno est� ruim");
			if ((escolaridade == 'F') && ((media == 3) || (media < 5)))
				System.out.println("A m�dia do aluno esta regular");
				if ((escolaridade == 'F') && (media > 5))
					System.out.println("A media do aluno esta boa");
					if (((escolaridade == 'M') || (escolaridade == 'S')) && (media < 5))
						System.out.println("A m�dia do aluno est� ruim");
						if (((escolaridade == 'M') || (escolaridade == 'S')) && ((media == 5) || (media < 7)))
							System.out.println("A media do aluno esta regular");
								if (((escolaridade == 'M') || (escolaridade == 'S')) && (media > 7))
									System.out.println("A media do aluno esta boa");
									
	}
}
