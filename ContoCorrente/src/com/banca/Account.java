package com.banca;

public class Account {
	private double conto;
	
	public Account(double conto) {
		this.setConto(conto);
	}

	public double getConto() {
		return conto;
	}

	public void setConto(double conto) {
		this.conto = conto;
	}
	
}
