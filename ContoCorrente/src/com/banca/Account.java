package com.banca;

public class Account {
	private double conto;
	private String property;
	
	public Account(double conto, String prop) {
		this.setConto(conto);
		this.setProperty(prop);
	}

	public double getConto() {
		return conto;
	}

	public void setConto(double conto) {
		this.conto = conto;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}
	
}
