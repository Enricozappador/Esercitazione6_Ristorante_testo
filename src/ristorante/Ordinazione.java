package ristorante;

import java.util.Collection;
import java.util.Collections;
//import java.util.Collection;
import java.util.LinkedList;

public class Ordinazione {
	private int numtavolo; 
	private LinkedList<Prodotto> prodottiordinati; 
	private String cuocoass;
	
	public Ordinazione(int numtavolo, Collection <Prodotto> prodottiordinati) {
		super();
		this.numtavolo = numtavolo;
		this.prodottiordinati = new LinkedList <Prodotto> (prodottiordinati);
		this.setCuocoass(cuocoass); 
	}


	public int getNumeroTavolo() {
		return numtavolo;
	}


	/*public int getNumtavolo() {
		return numtavolo;
	}*/


	public void setNumtavolo(int numtavolo) {
		this.numtavolo = numtavolo;
	}


/*	public LinkedList<Prodotto> getProdottiordinati() {
		return prodottiordinati;
	}


	public void setProdottiordinati(LinkedList<Prodotto> prodottiordinati) {
		this.prodottiordinati = prodottiordinati;
	}


	public String getCuocoass() {
		return cuocoass;
	}*/


	public void setCuocoass(String cuocoass) {
		this.cuocoass = cuocoass;
	}
	public Collection<Prodotto> getProdottiordinati(){
		return this.prodottiordinati;
	}


	public void setProdottiordinati(LinkedList<Prodotto> prodottiordinati) {
		this.prodottiordinati = prodottiordinati;
	}


	public void aggiungiProdotti(Collection<Prodotto> p) {
		this.prodottiordinati.addAll(p);
	}
	
	
}
