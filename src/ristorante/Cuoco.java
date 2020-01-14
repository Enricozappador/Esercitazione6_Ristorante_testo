package ristorante;

public class Cuoco {
	
	private String nome; 
	private String cognome; 
	private String email; 
	private String telefono;
	
	

	public Cuoco(String nome, String cognome, String email, String telefono) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.telefono = telefono;
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
	
}

