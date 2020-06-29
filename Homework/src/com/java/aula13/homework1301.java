package com.java.aula13;
import java.util.Scanner;

public class homework1301 {
public static void main(String[] args) {
		
		int peso1, peso2, peso3, cont;
		peso1 = 100;
		peso2 = 200;
		peso3 = 500;
		cont = 0;
		double coisaASerMedida = 100.699879;
		
		Scanner sc = new Scanner(System.in);
		
		String msg = "";
		String msgMI = "maior ou igual ";
		String extensoCem = "100 gramas";
		String extensoDuzentas = "200 gramas";
		String extensoQuinhentas = "500 gramas";
		
		
		float medidaDaBalanca = (float) coisaASerMedida;
		
		System.out.println("O peso informado foi " + coisaASerMedida);
		System.out.println("O peso medido foi " + medidaDaBalanca);
		
		float limiteBalanca = ((float) peso1 + peso2 + peso3);
		
		do {
			cont++;
			if (coisaASerMedida > limiteBalanca || coisaASerMedida < 0)
				msg = "Voc� explodiu a balan�a";
				else {
					if (coisaASerMedida >= peso3) {
						msg = msgMI + extensoQuinhentas;
					} else {
						if ((coisaASerMedida >= peso2) && (coisaASerMedida < peso3)) {
							msg = msgMI + "200 e menor que 500g";
						} else {
							if (coisaASerMedida < peso2 && coisaASerMedida >= peso1) {
								msg = msgMI + "100 e menor que "
										+extensoDuzentas;
							} else
								msg = "Menor que " + extensoCem;
						}
					}
				}
			System.out.println("\nRegistro da balan�a:\n"+msg);
			
			System.out.print("\nPeso da Coisa a Ser Medida: ");
			coisaASerMedida = sc.nextDouble();
		} while (cont < 5); 
		
		sc.close();
	}
}

