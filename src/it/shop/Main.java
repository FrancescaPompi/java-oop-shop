package it.shop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Inserisci nome prodotto: ");
		String nomeProdotto = scan.nextLine();
		System.out.print("Inserisci la descrizione del prodotto: ");
		String descrizioneProdotto = scan.nextLine();
		
		Prodotto prodotto1 = new Prodotto(nomeProdotto, descrizioneProdotto, 0, 0.22);
		System.out.println("Codice prodotto: " + prodotto1.getCodice());
		System.out.println("Nome esteso: " + prodotto1.nomeEsteso());
		System.out.println("Prezzo: " + prodotto1.getPrezzo() + " €");
		System.out.println("Prezzo con iva al 22%: " + prodotto1.prezzoCompresaIva() + " €");
		
		
		scan.close();

	}

}
