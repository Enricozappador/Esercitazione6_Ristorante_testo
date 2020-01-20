package ristorante;

public class Bevanda extends Prodotto{
	
	private int gradi; 

	public Bevanda(String nome, int prezzo) {
		super(nome, prezzo);
		this.gradi = -1;
		
	}

		
	
	public int getGradi() {
		return gradi;
	}
	public void setGradi(int gradi) {
		this.gradi = gradi;
	}



	@Override
	public String toString() {
		return this.getNome()+ ", servire a "+gradi+" gradi";
		
	}
}
