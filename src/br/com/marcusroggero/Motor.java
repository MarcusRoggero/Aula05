package br.com.marcusroggero;

public class Motor {

	private double potencia;
	private String tipo;

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Motor(double potencia, String tipo) {
		this.potencia = potencia;
		this.tipo = tipo;
	}
	
	

}
