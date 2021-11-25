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
//		this.nome = nome;
//		this.descrizione = descrizione;
//		this.prezzo = prezzo;
//		this.iva = iva;
	}
	
	
	// metodi getter e setter
	public int getCodice() {
		return codice;
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDescrizione() {
		return descrizione;
	}


	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}


	public double getPrezzo() {
		return prezzo;
	}


	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}


	public int getIva() {
		return iva;
	}


	public void setIva(int iva) {
		this.iva = iva;
	}


	// metodo per generare un codice random
	private int generaCodice() {
		Random random = new Random();
		return random.nextInt();
	}
	
	// metodo per il prezzo base
	public double prezzoBase() {
		return prezzo;
	}
	
	// metodo per il prezzo con iva
	public double prezzoCompresaIva() {
		return prezzo + (prezzo * 0.22);
	}
	
	// metodo per il nome esteso
	public String nomeEsteso() {
		return codice + ",  " + nome;
	}
	

}
