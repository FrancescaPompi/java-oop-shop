package it.shop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Inserisci nome prodotto: ");
		String nome = scan.nextLine();
		System.out.print("Inserisci la descrizione del prodotto: ");
		String descrizione = scan.nextLine();
		
		Prodotto prodotto1 = new Prodotto(nome, descrizione, 0, 0.22);
		System.out.println("Il prezzo è: " + prodotto1.getPrezzo() + " €");
		System.out.println("Il prezzo compreso di iva al " + prodotto1.getIva() + " è: " + prodotto1.prezzoCompresaIva() + " €");
		
		
		scan.close();

	}

}
