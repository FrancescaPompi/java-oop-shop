package it.shop;

public class Main {

	public static void main(String[] args) {
		
		// creazione nuovo prodotto
		Prodotto prodotto1 = new Prodotto();
		
		System.out.println("Prodotto: " + prodotto1.nomeEsteso());
		
		System.out.println("Il prezzo di questo prodotto �: " + prodotto1.prezzoBase() + ", con iva �: " + prodotto1.prezzoCompresaIva());
		
		
		
	}

}
