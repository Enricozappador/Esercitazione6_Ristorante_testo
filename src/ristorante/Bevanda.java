package ristorante;

public class Bevanda extends Prodotto{
	
	private int gradi; 

	public Bevanda(String nome, int prezzo, String tipologia, int gradi) {
		super(nome, prezzo, tipologia);
		gradi = -1;
		
	}

	public void setGradi(int gradi) {
	}	
	
	public int getGradi() {
		return gradi;
	}
}
