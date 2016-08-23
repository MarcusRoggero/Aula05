package br.com.marcusroggero;

import java.lang.invoke.SwitchPoint;

public class Carro {

	private String cor;
	private String modelo;
	private int velocidadeAtual;
	private int velocidadeMaxima;
	private Motor motor;
	private boolean carroLigado;
	private int marcha;

	public Carro(String cor, String modelo, int velocidadeMaxima) {
		this.cor = cor;
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.velocidadeAtual = 0;
		this.carroLigado = false;
		this.marcha = 0;
	}

	public void defineMotor(double potencia, String tipo) {
		this.motor = new Motor(potencia, tipo);
	}

	public void ligar() {
		this.carroLigado = true;
		System.out.println("O carro está ligado? " + this.carroLigado);
	}

	public void desligar() {
		this.carroLigado = false;
		this.velocidadeAtual = 0;
		System.out.println("O carro está ligado? " + this.carroLigado);
		System.out.println("Velocidade: " + this.velocidadeAtual + " km/h");
	}

	public void pegaMarcha(boolean sobeDesceMarcha) {
		if (sobeDesceMarcha == false & this.marcha == 0) {
			System.out.println("Carro já está em ponto morto");
		} else if (sobeDesceMarcha == false) {
			this.marcha = this.marcha - 1;
		} else if (sobeDesceMarcha == true & this.marcha == 5) {
			System.out.println("Carro já está na quinta marcha");
		} else {
			this.marcha = this.marcha + 1;
		}
	}

	public void acelera() {
		if (this.carroLigado == true) {
			switch (this.marcha) {
			case 0:
				velocidadeAtual = 0;
				System.out.println("Carro em ponto morto");
				break;
			case 1:
				velocidadeAtual = 20;
				System.out.println("Velocidade: " + velocidadeAtual + " km/h");
				break;
			case 2:
				velocidadeAtual = 40;
				System.out.println("Velocidade: " + velocidadeAtual + " km/h");
				break;
			case 3:
				velocidadeAtual = 60;
				System.out.println("Velocidade: " + velocidadeAtual + " km/h");
				break;
			case 4:
				velocidadeAtual = 100;
				System.out.println("Velocidade: " + velocidadeAtual + " km/h");
				break;
			case 5:
				velocidadeAtual = this.velocidadeMaxima;
				System.out.println("Velocidade: " + velocidadeAtual + " km/h");
				break;
			}
		} else {
			System.out.println("Carro desligado");
		}

	}

}
