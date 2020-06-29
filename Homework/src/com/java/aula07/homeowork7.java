package com.java.aula07;
import java.util.Scanner;

public class homeowork7 {
	public static void main(String[] args) {		
				
		int idade;
		int carHab;
		int carro;
		int acompanhante;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite idade: ");
		idade = sc.nextInt();
		System.out.println("Digite Validade da Habilita��o: ");
		carHab = sc.nextInt();
		System.out.println("Esta em um automovel? (1) Sim e (2) N�o");
		carro = sc.nextInt();
		System.out.println("Digite a quantidade de passageiros: ");
		acompanhante = sc.nextInt();
		sc.close();
		
		if ((idade >= 18) && (carHab == 2005) && (carro == 1) && (acompanhante == 0)) {
			System.out.println("Ok, Pode passar pela fronteira!");
			System.out.println("Seja bem vindo, pois 2005 � o ano da nossa independ�ncia!");
		} if ((idade >= 18) && (carHab != 2005) && (carro == 1) && (acompanhante == 0)) {
			System.out.println("Ok, Pode passar pela fronteira!");
		} if ((idade >= 18) && (carHab == 2005) && (carro == 2) && (acompanhante == 0)){
				System.out.println("Seja bem vindo, mas volte com um carro!");
		} if ((idade >= 18) && (carHab == 2005) && (carro == 1) && (acompanhante != 0)){
					System.out.println("Seja Bem vindo, mas volte com " + acompanhante +  " carros!");							
		} else {
			System.out.println("Voc� n�o pode passar fronteira, pois n�o atende os requisitos minimos.");
		}
	}
}
