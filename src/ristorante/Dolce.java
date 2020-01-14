package ristorante;

public class Dolce extends Prodotto{
	
	private String descrizione; 
	
public Dolce(String nome, int prezzo, String tipologia, String descrizione) {
		super(nome, prezzo, tipologia);
	descrizione = ""; 
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione; 
	}
	
	public String getDescrizione() {
		return descrizione;
	}

	
}
