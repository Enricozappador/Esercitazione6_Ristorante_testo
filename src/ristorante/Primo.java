package ristorante;

public class Primo extends Prodotto{
	
	private String descrizione; 

	public Primo(String nome, int prezzo, String tipologia, String descrizione) {
		super(nome, prezzo, tipologia);
		descrizione = ""; 
		
	}

	public void setDescrizione(String descrizione){
		this.descrizione = descrizione; 
	}
	
	public String getDescrizione() {
		return descrizione;
	}	
}
