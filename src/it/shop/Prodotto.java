package it.shop;

import java.util.Random;

public class Prodotto {
	
	// attributi
	private int codice;
	private String nome;
	private String descrizione;
	private double prezzo;
	private int iva;
	
	// costruttori
	public Prodotto() {
		this.codice = generaCodice();
	}
	
	// metodo per generare un codice random
	private int generaCodice() {
		Random random = new Random();
		return random.nextInt();
	}

}
