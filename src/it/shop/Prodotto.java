package it.shop;

import java.util.Random;

public class Prodotto {
	
	// attributi
	private int codice;
	private String nome;
	private String descrizione;
	private double prezzo;
	private double iva;
	
	
	// costruttori
	public Prodotto(String nome, String descrizione, double prezzo, double iva) {
		this.codice = generaCodice();
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = generaPrezzo();
		this.iva = 0.22;
	}
	
	
	// metodi getter e setter
	public int getCodice() {
		return codice;
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		if(isNomeNullOrEmpty(nome)) {
			System.out.println("Il nome non può essere vuoto.");
		} else {
			this.nome = nome;
		}
	}


	public String getDescrizione() {
		return descrizione;
	}


	public void setDescrizione(String descrizione) {
		if(isDescrizioneNullOrEmpty(descrizione)) {
			System.out.println("La descrizione non può essere vuota.");
		} else {
			this.descrizione = descrizione;
		}
	}


	public double getPrezzo() {
		return prezzo;
	}


	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}


	public double getIva() {
		return iva;
	}


	public void setIva(double iva) {
		this.iva = iva;
	}


	
	// metodo per generare un codice random
	private int generaCodice() {
		Random random = new Random();
		return random.nextInt();
	}
	
	// metodo per generare prezzo random
	private double generaPrezzo() {
		Random random = new Random();
		return random.nextDouble() * 1000;
	}
	
	// metodo per il prezzo base
	public double prezzoBase() {
		return this.prezzo;
	}
	
	// metodo per il prezzo con iva
	public double prezzoCompresaIva() {
		return this.prezzo + (this.prezzo * this.iva);
	}
	
	// metodo per il nome esteso
	public String nomeEsteso() {
		return this.codice + ",  " + this.nome;
	}
	
	// metodo per validare che il nome non sia null o lunghezza 0
	private boolean isNomeNullOrEmpty(String nome) {
		return nome == null || nome.length() == 0;
	}
	
	// metodo per validare la descrizione
	private boolean isDescrizioneNullOrEmpty(String descrizione) {
		return descrizione == null || descrizione.length() == 0;
	}
	

}
