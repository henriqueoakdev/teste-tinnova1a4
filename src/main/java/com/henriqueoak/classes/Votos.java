package com.henriqueoak.classes;

public class Votos {
	private double valor = 0;
	private String mensagem = "";
	
	public Votos() {
		
	}

	public Votos(double valor, String mensagem) {
		super();
		this.valor = valor;
		this.mensagem = mensagem;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public double calculoRelativo(double votos) {
		double total = 0;
		
		total = (votos / 1000) * 100;
		
		return total;
	}
}
