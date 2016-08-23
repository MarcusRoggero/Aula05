package br.com.marcusroggero.estoque;

public class Estoque {

	private String nome;
	private int quantidadeMinima;
	private int quantidadeAtual;

	public Estoque(String nome, int quantidadeMinima, int quantidadeAtual) {
		this.nome = nome;
		this.quantidadeMinima = quantidadeMinima;
		this.quantidadeAtual = quantidadeAtual;
	}

	public void mudarNome(String novoNome) {
		this.nome = novoNome;
	}

	public void mudarQuantidadeMinima(int novaQuantidadeMinima) {
		if (novaQuantidadeMinima < 0) {
			System.out.println("Quantidade mínima não pode ser negativa");
		} else {
			this.quantidadeMinima = novaQuantidadeMinima;
		}
	}

	public void reporEstoque(int quantidadeAdicional) {
		this.quantidadeAtual = this.quantidadeAtual + quantidadeAdicional;
	}

	public void darBaixa(int quantidadeSubtraida) {
		if (quantidadeSubtraida > quantidadeAtual) {
			System.out.println("Estoque insuficiente");
		} else {
			this.quantidadeAtual = this.quantidadeAtual - quantidadeSubtraida;
		}
	}

	public String mostra() {
		return("Nome: " + this.nome + "\n" +
				"Quantidade mínima: " + this.quantidadeMinima + "\n" +
				"Quantidade atual: " + this.quantidadeAtual);
	}

	public boolean precisaRepor() {
		if (this.quantidadeAtual < this.quantidadeMinima) {
			return true;
		} else {
			return false;
		}
	}

}
