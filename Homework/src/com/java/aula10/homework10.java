package com.java.aula10;

public class homework10 {
	public static void main (String[] args) {
			
			//Declara��o das variaves
			int soma, somaMedia, x, y;
			float media;
			
			//Inicializa��o das variaveis
			soma = 0;
			somaMedia = 0;
			media = 0;
			x = 0;
			y = 0;
			
				//Inicio da estrutura de repeti��o FOR, inicia em 0 e incrementa at� 1000
				for(int i = 0; i <= 1000; i++) {
				
					//Condi�ional i maior igual a 100
					if(i<=100) {
						soma=soma+i;
					}
						//Condicional i maior igual a 10, menor igual a 50 e resto da divis�o entre i e 2 diferente de 0
						if((i >= 10)&&(i <= 50)&&(i % 2 != 0)) {
							x++;
							somaMedia = somaMedia + i;
							media = somaMedia / x;
						}
							//Condicional resto da divis�o entre i e 7 igual a 0
							if(i % 7 == 0 && i != 0) {
								y++;
							}		
				}
		
			System.out.println("A Soma dos 100 primeiros inteiros �: " + soma);
			System.out.println("A m�dia dos numeros impares entre 10 e 50 �: " + media);
			System.out.println("A quantidade de divisiveis por 7 entre 0 e 1000 �: " + y);
				
				//Inicio da estrurua de repeti��o FOR, inicia em 10 e decrementa at� 0
				for(int c = 10; c >= 0; c--) {
				
					//Condicional caso variavel c seja igual a zero, imprima BUM, sen�o, imprima valor contido em c
					if(c == 0) {
						System.out.println("BUM");
					}else
						System.out.println(c);
				}
			
		}
}
