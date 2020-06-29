package com.java.aula13;
import java.util.Scanner;

public class Homework13 {
	public static void main(String[] args) {
		
		/*
		 * Abaixo vai um c�digo de uma balan�a que pesa alguma coisa e informa se est� cosa est�
		 *dentro de uma faixa de pesos. A balan�a s� pesa uma coisa, depois encerra. Refa�a o c�digo
		 *de modo que uma execu��o neste c�digo me�a 5 coisas, uma de cada vez .
		 */
		int peso1, peso2, peso3; // pesos que a balan�a usa
		peso1 = 100;
		peso2 = 200;
		peso3 = 500;
		int cont = 0;
		double coisaASerMedida = 100.699879;
		Scanner sc = new Scanner(System.in);
		
		while (cont < 5) {
		System.out.println("Digite o peso:");
		coisaASerMedida = sc.nextDouble(); 	// aten��o, esse comando pode estar dando erro, 
											// e se estiver, como voc� faria
											// para receber um n�mero e convert�-lo para double?
		String msg = ""; // vari�veis de trabalho (auxiliares)
		String msgMI = " maior ou igual ";
		String extensoCem = "100 gramas";
		String extensoDuzentas = "200 gramas";
		String extensoQuinhentas = "500 gramas";
		//note que os pesos s�o int, a coisa a ser medida, double
		// esta vari�vel � mais uma auxiliar, ser� que est�
		// convertendo direito?
		float medidaDaBalanca = (float) coisaASerMedida;
		
		System.out.println("O peso informado foi " + coisaASerMedida);
		System.out.println("O peso medido foi " + medidaDaBalanca);
		// a partir daqui procure entender o �algoritmo� de pesagem abaixo
		System.out.println("Registro da balan�a:");
		float limiteBalanca = peso1 + peso2 + peso3;
		sc.close();
		if (coisaASerMedida > limiteBalanca || coisaASerMedida < 0) 
			msg = "Voc� explodiu a balan�a";
				if (coisaASerMedida >= peso3) 
					msg = msgMI + extensoQuinhentas;
						if ((coisaASerMedida >= peso2) && (coisaASerMedida < peso3)) 
							msg = msgMI + "200 e menor que 500g";		
								if (coisaASerMedida < peso2 && coisaASerMedida >= peso1) 
									msg = msgMI + "100 e menor que " +extensoDuzentas;
		else						
			msg = "Menor que " + extensoCem;
		
				System.out.println(msg);
		cont++;
		}
	}

}
