package ristorante;

public class Primo extends Prodotto{
	
	private String descrizione; 

	public Primo(String nome, int prezzo) {
		super(nome, prezzo);
		this.descrizione = ""; 
		
	}

	public void setDescrizione(String descrizione){
		this.descrizione = descrizione; 
	}
	
	public String getDescrizione() {
		return descrizione;
	}	
	@Override
	public String toString() {
		return this.getNome()+ ", "+this.getDescrizione();
		
	}
}
