package com.java.aula17;
public class acenderLampada {

	public static void main(String[] args) {
				
		Professor dudu = new Professor();
		Interruptor i1 = new Interruptor();
		Interruptor i2 = new Interruptor();
		
		
		dudu.desligarInterruptor(i1);
		dudu.ligarInterruptor(i2);
	}
}

class Professor {
	Interruptor interruptor = new Interruptor();
	
	void ligarInterruptor(Interruptor i) {
		interruptor.ligarLampada();
		
	}
	void desligarInterruptor(Interruptor i) {
		interruptor.desligarLampada();
		
	}

}
class Interruptor {
	
	Lampada lampada1 = new Lampada();
	Lampada lampada2 = new Lampada();
	
	void ligarLampada() {
		
		lampada1.ligada = true;
		lampada2.ligada = true;
		lampada1.escrever();
	}
	void desligarLampada() {
		lampada1.ligada = false;
		lampada2.ligada = false;
		lampada1.escrever();
	}
}
class Lampada {
	
	boolean ligada = false;
		
	void escrever() {
			
		if (ligada == true)
			System.out.println("As lampadas estão ligadas ");
		else
			System.out.println("As lampadas estão desligadas");
	}		
}


