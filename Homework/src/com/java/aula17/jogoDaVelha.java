package com.java.aula17;

public class jogoDaVelha {

	public static void main(String[] args) {
			
			char[][] jogoVelha = {	
									{'_', '_', 'x'},
									{'_', 'x', '_'},
									{'x', '_', '_'},
			}; 	
			
			exibeJogada(jogoVelha);
			
			boolean ganhou;
							
			ganhou = verificaLinha(jogoVelha);
			if (ganhou)
				System.out.println("Jogada vencedora na horizontal");
			
			ganhou = verificaColuna(jogoVelha);
			if (ganhou)
				System.out.println("Jogada vencedora na vertical");

			ganhou = verificaDiagonalPrincipal(jogoVelha);	
			if(ganhou)
				System.out.println("Jogada vencedora na diagonal primária");
			ganhou = verificaDiagonalSecundaria(jogoVelha);
			if(ganhou)
				if(ganhou)
					System.out.println("Jogada vencedora na diagonal secundária");			
	}
	static void exibeJogada(char[][] jogo) {
		for (int linha = 0; linha < jogo.length; linha++) {
			for (int coluna = 0; coluna < jogo.length; coluna++) { 
				System.out.print("|"+jogo[linha][coluna]+"|");
			}
			System.out.println();
		}
	}	
	static boolean verificaLinha(char[][] jogada) {
		boolean fechou = false;
		int contador;
		for (int linha = 0; linha < jogada.length; linha++) {
			contador = 0;
			for (int coluna = 0; coluna < jogada.length; coluna++) {
				if (jogada[linha][coluna] == 'x')
					contador++;
			}
			if (contador == 3) {
				
				fechou = true;
				break;
			}
		}
		return fechou;
	}
	static boolean verificaColuna(char[][] jogada) {
		boolean fechou = false;
		int contador;
		for (int coluna = 0; coluna < jogada.length; coluna++) {
			contador = 0;
			for (int linha = 0; linha < jogada.length; linha++) {
				if (jogada[linha][coluna] == 'x')
					contador++;
			}
			if (contador == 3) {
				
				fechou = true;
				break;
			}
		}
		return fechou;
	}
	static boolean verificaDiagonalPrincipal(char[][] jogada) {
		boolean fechou = false;
		int contador = 0;
		for (int linha = 0; linha < jogada.length; linha++) {
			for (int coluna = 0; coluna < jogada.length; coluna++) {
				if ((linha == coluna) && (jogada[linha][coluna] == 'x'))
						contador++;								
			}
		}
		if (contador == 3)		
			fechou = true;
		
		return fechou;
	}
	static boolean verificaDiagonalSecundaria(char[][] jogada) {
		boolean fechou = false;
		for (int linha = 0; linha < jogada.length; linha++) {
			for (int coluna = 0; coluna < jogada.length; coluna++) {
				if ((jogada[2][0] == 'x') && (jogada[1][1] == 'x') && (jogada[0][2] == 'x'))
						fechou = true;								
			}
		}
		return fechou;
	}
}
