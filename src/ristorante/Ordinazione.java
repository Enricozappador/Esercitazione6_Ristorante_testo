package ristorante;

import java.util.LinkedList;

public class Ordinazione {
	private int numtavolo; 
	private LinkedList<Prodotto> prodottiordinati; 
	
	
	public Ordinazione(int numtavolo, LinkedList<Prodotto> prodottiordinati) {
		super();
		this.numtavolo = numtavolo;
		this.prodottiordinati = prodottiordinati;
	}


	public int getNumeroTavolo() {
		return numtavolo;
	}


	public int getNumtavolo() {
		return numtavolo;
	}


	public void setNumtavolo(int numtavolo) {
		this.numtavolo = numtavolo;
	}


	public LinkedList<Prodotto> getProdottiordinati() {
		return prodottiordinati;
	}


	public void setProdottiordinati(LinkedList<Prodotto> prodottiordinati) {
		this.prodottiordinati = prodottiordinati;
	}
	
}
