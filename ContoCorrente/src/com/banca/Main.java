package com.banca;

public class Main {
	public static void main(String[] args){
		Account conto = new Account(30);
		
		System.out.println("Il tuo conto è di: "+conto.getConto());
	}
}
