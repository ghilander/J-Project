package com.banca;

public class Main {
	public static void main(String[] args){
		Account conto = new Account(30, "Davide");
		
		System.out.println("Il tuo conto è di: "+conto.getConto());
		System.out.println("Il proprietario è: "+conto.getProperty());
	}
}
