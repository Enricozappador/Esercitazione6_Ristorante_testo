package ristorante;

//import java.util.Collection;
import java.util.LinkedList;

public class Ordinazione {
	private int numtavolo; 
	private LinkedList<String> prodottiordinati; 
	private String cuocoass;
	
	public Ordinazione(int numtavolo, LinkedList<String> nomiProdotti ,String cuocoass) {
		super();
		this.numtavolo = numtavolo;
		this.prodottiordinati = nomiProdotti;
		this.setCuocoass(cuocoass); 
	}


	public int getNumeroTavolo() {
		return numtavolo;
	}


	/*public int getNumtavolo() {
		return numtavolo;
	}*/


	/*public void setNumtavolo(int numtavolo) {
		this.numtavolo = numtavolo;
	}
*/

	public LinkedList<String> getProdottiordinati() {
		return prodottiordinati;
	}


	public void setProdottiordinati(LinkedList<String> prodottiordinati) {
		this.prodottiordinati = prodottiordinati;
	}


	public String getCuocoass() {
		return cuocoass;
	}


	public void setCuocoass(String cuocoass) {
		this.cuocoass = cuocoass;
	}
	
}
