package ristorante;

import java.util.LinkedList;

public class Cuoco {
	
	private String nome; 
	private String cognome; 
	private String email; 
	private String telefono;
	private LinkedList<Ordinazione> ordinazioni; 
	
	

	public Cuoco(String nome, String cognome, String email, String telefono, LinkedList<Ordinazione> ordinazioni) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.telefono = telefono;
		this.ordinazioni = ordinazioni; 
	}

	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}

	public String getEmail() {
		return email;
	}

	public String getNumeroTelefono() {
		return telefono;	
	}

	@Override 
	public String toString()
	{
		return nome+" "+cognome+" "+email;
		
	}

	public LinkedList<Ordinazione> getNumeroordini() {
		return ordinazioni;
	}

	public LinkedList<Ordinazione> getOrdinazioni() {
		return ordinazioni;
	}

	public void setOrdinazioni(LinkedList<Ordinazione> ordinazioni) {
		this.ordinazioni = ordinazioni;
	}

	/*public void setNumeroordini(int numeroordini) {
		this.ordinazioni = ordinazioni;
	}
	*/
}

