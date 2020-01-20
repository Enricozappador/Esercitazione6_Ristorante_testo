package ristorante;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;





public class Ristorante {
	private Map<String ,Cuoco> cuochi;  
	private int numcuochi; 
	private Map<String ,Prodotto> prodotti; 
	private int numprodotti; 
	private LinkedList <Bevanda> bevande; 
	private int numbevande; 
	private LinkedList <Primo> primi; 
	private int numprimi; 
	private LinkedList<Dolce> dolci; 
	private int numdolci; 
	private Map <Integer ,Ordinazione> ordinazioni; 
	private int numordinazioni; 
	
	public Ristorante (){
		cuochi = new TreeMap<String, Cuoco>();  
		numcuochi = 0 ;
		prodotti = new TreeMap<String, Prodotto>();
		numprodotti = 0; 
		bevande = new LinkedList<Bevanda>(); 
		numbevande = 0; 
		primi = new LinkedList<Primo>();
		numprimi = 0; 
		dolci = new LinkedList<Dolce>();
		numdolci = 0; 
		ordinazioni = new TreeMap<Integer , Ordinazione>();
		numordinazioni = 0; 
		
	}
	
	
	public Cuoco creaCuoco(String nome, String cognome, String email, String numeroTelefono) {
	Cuoco ctemp = null;  
	
	
	if (cuochi.containsKey(email)==true) {
		return null; 
	}
	
	else if(cuochi.containsKey(email)!=true)
		{ctemp = new Cuoco(nome, cognome, email, numeroTelefono);
		cuochi.put(email, ctemp);
		numcuochi++; 
		}
		
		/*{
			System.out.print("no"); 
			return null; 
		}
		else {
			cuochi.add(numcuochi++, ctemp);
		}*/
		return ctemp;
	}
	
	public Cuoco cercaCuoco(String email) {
		Cuoco ctemp =null; 
		
		if(cuochi.containsKey(email))
		{
			ctemp = cuochi.get(email); 
		}
		
		return ctemp;
	}
	
	public Collection<Cuoco> elencoCuochi() {
		LinkedList <Cuoco> ctemp = new LinkedList<Cuoco>(cuochi.values());
		/*LinkedList <Cuoco> tostring = null;  
		LinkedList<String>nomeordinato = new LinkedList <String>();
		int tostringcount = 0; 
		int nomeordinatocount = 0; 
		boolean flag = false; 
		int x=0; 
		
		for (Cuoco c: cuochi)
		{
			nomeordinato.add(nomeordinatocount++, c.toString());
		}
		Collections.sort(nomeordinato); 

		
		for (int k = 0; k<nomeordinatocount++; k++)
		{ if(nomeordinato.get(k)!=null)
			for (int i = 0 ;i<numcuochi; i++)
			{
				if (cuochi.get(i)!=null)
				{
					if(cuochi.get(i).toString().compareTo(nomeordinato.get(k))==0)
						flag = true; 
					x=i; 
				}
				
					
			}
		}
		
		if(flag == true)
			tostring.add(tostringcount++, cuochi.get(x));
		
		*/
		
		return ctemp;
	}
	
	public Prodotto creaProdotto(String nome, String tipologia, int prezzo) {
		Prodotto ptemp = new Prodotto(nome, prezzo); 
		Primo prtemp = null; 
		Dolce dtemp = null; 
		Bevanda btemp = null; 
		//boolean flag = false;
		
		if(prodotti.containsKey(nome)) {
			this.prodotti.get(nome).setPrezzo(prezzo);
		}
		
		
		else {
//			this.p.put(nome, )
			if (tipologia.compareTo("PR")==0) {
				this.prodotti.put(nome, new Primo(nome, prezzo));
			}
			else if (tipologia.compareTo("D")==0) {
				this.prodotti.put(nome, new Dolce(nome, prezzo));
			}
			else
				this.prodotti.put(nome, new Bevanda(nome, prezzo));
		}
		
		return this.prodotti.get(nome);
	}
	
	public Prodotto cercaProdotto(String nome) {
		Prodotto ptemp = null; 
		
		if (prodotti.containsKey(nome))
			{ptemp = prodotti.get(nome);
			
			}
		return ptemp;
	}
	
	public String elencoProdotti() {
		/*LinkedList<Prodotto> ptemp = new LinkedList<Prodotto>(prodotti.values());
		//int ntemp=0; 
		String tostring =""; 
		
		for(Prodotto p : ptemp)
		{
			if(p!=null)
			{
				if(p instanceof Primo)
				{
					for (Primo pr : primi)
						if(pr!=null && p.getNome().compareTo(pr.getNome())==0)
							tostring = tostring + pr.toString()+ "\n";
				}
				else if (p instanceof Dolce)
				{
					for (Dolce d : dolci)
						if(d!=null && p.getNome().compareTo(d.getNome())==0)
							tostring = tostring + d.toString()+"\n"; 
				}
				else if(p instanceof Bevanda)
				{
					for (Bevanda b : bevande)
						if(b!=null && p.getNome().compareTo(b.getNome())==0)
							tostring = tostring + b.toString()+"\n"; 
				}
			}
		}
		/*for(int i=0; i<numprodotti; i++)
			if()
		/*for (Prodotto p : prodotti.values())
		{
			tostring += p.toString()+"\n";
		}
		/*for (int i =0; i<ntemp ; i++)
		tostring = tostring + ptemp.get(i)+"\n";
		*/
String s = "";
		
		for (Prodotto pi : this.prodotti.values()) {
			s += pi.toString() + "\n";
		}
		
		return s;
	}
	
	public Ordinazione nuovaOrdinazione(int numeroTavolo, Collection<String> nomiProdotti) {
		//Ordinazione otemp= cercaOrdinazione(numeroTavolo); 
		//boolean flag = false; 
		//int nptemp =0;
		//int x = numeroTavolo;
		//LinkedList <String> prodottiordinati = new LinkedList <String>(); 
		//LinkedList<String> potemp = new LinkedList <String>();
		LinkedList <Prodotto> ptemp = new LinkedList <Prodotto>();
		//prodottiordinati.addAll(nomiProdotti);
		//LinkedList<Cuoco>ctemp = new LinkedList<Cuoco>(cuochi.values());
		
		/*if(otemp != null)
		for(String s : nomiProdotti)
		{
		if (s!=null && prodotti.containsKey(s))
		{
			prodottiordinati.add(s);
		}
		}
		
		
	/*	for(Prodotto p : ptemp) 
		{
			if(p!=null)
			{
				if(prodottiordinati.toString().compareTo(p.getNome())==0)
				{
					potemp.add(nptemp++,p);
				}
			}
		}
		
		//for (Ordinazione o : ordinazioni)
		{
		if(ordinazioni.containsKey(numeroTavolo))
			{
			return null; 
			}
		
		else
		{
			if(numprodotti>0)
			{
				otemp = new Ordinazione (numeroTavolo, prodottiordinati);
				ordinazioni.put(numeroTavolo, otemp );
				
			}
			
			else 
				return null;
		
		}
		}
		
		if(ctemp!=null)
		{  LinkedList<Ordinazione> otemp1 = new LinkedList<Ordinazione>(ordinazioni.values());
			ctemp.getFirst().setOrdinazioni(otemp1);
			otemp.setCuocoass(ctemp.get(1).getCognome());
		}
		
		
		
		*/
		
		if (this.prodotti.isEmpty())
			return null;
		
		for (String si : nomiProdotti) {
			if (this.prodotti.containsKey(si)) {
				ptemp.add(this.prodotti.get(si));
			}
		}
		
		if (ptemp.isEmpty()) {
			return null;
		}
		
		if (this.ordinazioni.containsKey(numeroTavolo)) {
			this.ordinazioni.get(numeroTavolo).aggiungiProdotti(ptemp);
		}
		else{
			this.ordinazioni.put(numeroTavolo, new Ordinazione(numeroTavolo, ptemp));
			if (this.cuochi.size() > 0) {
//				List<Cuoco> l = new LinkedList<Cuoco>(this.c.values());
//				Collections.sort(l, new ComparatoreCuocoOrdinazioni());
//				l.get(0).aggiungiOrdinazione(o.get(numeroTavolo));
				boolean assegnata = false;
				for (int i = 0; i<2; i++) {
					for (Cuoco ci : this.elencoCuochi()) {
						if (ci.getOrdinazioni().size() == i && !assegnata) {
							ci.aggiungiOrdinazione(this.ordinazioni.get(numeroTavolo));
							assegnata = true;
						}
					}
				}
			}
		}	
		
		return this.ordinazioni.get(numeroTavolo);
	}
	
	public Ordinazione cercaOrdinazione(int numeroTavolo) {
		/*Ordinazione otemp = null;
		/*for (Ordinazione o : ordinazioni)
		{
			if(o!=null && o.getNumeroTavolo() == numeroTavolo)
			return o; 
		}
		
		if (ordinazioni.containsKey(numeroTavolo))
			otemp = ordinazioni.get(numeroTavolo);
		
		return otemp;*/
		return this.ordinazioni.get(numeroTavolo);
	}
	
	public Collection<Prodotto> getProdottiOrdinazione(int numeroTavolo) {
		/*Ordinazione otemp = cercaOrdinazione(numeroTavolo);
		LinkedList <Prodotto> ptemp = new LinkedList<Prodotto>(prodotti.values()); 
		LinkedList <Prodotto> temp = new LinkedList <Prodotto>();
		
		for(String s :otemp.getProdottiordinati())
		{
			if(s!=null)
			{
				for(Prodotto p :ptemp)
				{
					if(p!=null && (p.getNome().compareTo(s)==0))
					{
						temp.add(p);
					}
				}
			}
			
				
		}
		
		
		
		
		
		
		
		return temp;*/
		if(ordinazioni.containsKey(numeroTavolo)) {
			return ordinazioni.get(numeroTavolo).getProdottiordinati();
		}
		
		return null;
	}
		
	public Collection<Ordinazione> getOrdinazioniCuoco(String email) throws CuocoNonEsistenteException{
		/*LinkedList <Cuoco>ctemp = new LinkedList <Cuoco>(cuochi.values());
	LinkedList<Ordinazione> otemp = new LinkedList <Ordinazione>(ordinazioni.values());
	
	/*for(Cuoco c : ctemp) {
		if(c!=null )
		{
			for(Ordinazione o : otemp)
				if(o!=null && o.getNumeroTavolo())
		}
	}
	*/
		if(!this.cuochi.containsKey(email))
			throw new CuocoNonEsistenteException();
		
		return this.cuochi.get(email).getOrdinazioni();
	}
	
	public void leggiDatiRistorante(String nomeFile) throws IOException {
		
		BufferedReader in = new BufferedReader(new FileReader(nomeFile));
		String linea; 
		
		String nomecuoco = null; 
		String cognome = null; 
		String email = null; 
		String numeroTelefono = null; 
		
		String nomeprodotto = null ;
		String prezzo = null; 
		String descrizione = null; 
		String gradi = null; 
		
		while ((linea = in.readLine()) != null )
		{
			try {
				StringTokenizer st = new StringTokenizer (linea , ";");
				String iniziale = st.nextToken().trim();
				if(iniziale.toUpperCase().equals("C"))
				{
					nomecuoco = st.nextToken().trim();
					cognome = st.nextToken().trim();
					email = st.nextToken().trim();
					numeroTelefono = st.nextToken().trim();
					
					this.creaCuoco(nomecuoco, cognome, email, numeroTelefono);
					
				}
				else if (iniziale.toUpperCase().equals("B"))
				{
					nomeprodotto = st.nextToken().trim();
					prezzo = st.nextToken().trim();
					gradi = st.nextToken().trim();
					Prodotto p = this.creaProdotto(nomeprodotto, "B", Integer.parseInt(prezzo));
					((Bevanda) p).setGradi(Integer.parseInt(gradi));
				}
				else if (iniziale.toUpperCase().equals("PR"))
				{
					nomeprodotto = st.nextToken().trim();
					prezzo = st.nextToken().trim();
					descrizione = st.nextToken().trim();
					Prodotto p = this.creaProdotto(nomeprodotto, "PR", Integer.parseInt(prezzo));
					((Primo) p).setDescrizione(descrizione);
				}
				else if (iniziale.toUpperCase().equals("D"))
				{
					nomeprodotto = st.nextToken().trim();
					prezzo = st.nextToken().trim();
					descrizione = st.nextToken().trim();
					Prodotto p = this.creaProdotto(nomeprodotto, "D", Integer.parseInt(prezzo));
					((Dolce) p).setDescrizione(descrizione);
				}
			}
		catch (Exception e) {
			e.printStackTrace();
		}
			
		
		
	}
	in.close(); 

}
}
