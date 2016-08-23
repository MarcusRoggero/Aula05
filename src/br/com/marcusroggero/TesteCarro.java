package br.com.marcusroggero;

import org.omg.PortableServer.ServantManagerOperations;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro("Amarelo", "VW Crossfox", 150);
		carro1.defineMotor(1.6,"Aspirado");

		carro1.ligar();
		//carro1.desligar();
		//carro1.ligar();
		carro1.pegaMarcha(true);
		carro1.acelera();
		carro1.pegaMarcha(true);
		carro1.acelera();
		carro1.pegaMarcha(false);
		carro1.acelera();
	}

}
