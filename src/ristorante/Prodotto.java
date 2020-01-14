package ristorante;

public class Prodotto {
	private String nome; 
	private int prezzo; 
	private String tipologia; 
	private String descrizione; 
	private int gradi; 
	
	
	



	public Prodotto(String nome, int prezzo, String tipologia) {
		super();
		this.nome = nome;
		this.prezzo = prezzo;
		this.setTipologia(tipologia); 
	}
	
	

	public String getNome() {
		return nome;
	}
	
	public int getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}

	public String getTipologia() {
		return tipologia;
	}



	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}

	@Override
	public String toString()
	{
		return null;
		
	}



	public String getDescrizione() {
		return descrizione;
	}



	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}



	public int getGradi() {
		return gradi;
	}



	public void setGradi(int gradi) {
		this.gradi = gradi;
	}
}
