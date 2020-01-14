package ristorante;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
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
		
	}
	
	
	public Cuoco creaCuoco(String nome, String cognome, String email, String numeroTelefono) {
	Cuoco ctemp = new Cuoco(nome, cognome, email, numeroTelefono); 
	
	
	if (cuochi.containsKey(email)) {
		ctemp = null; 
	}
	
	else 
		{cuochi.put(email, ctemp);
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
		Prodotto ptemp = new Prodotto(nome, prezzo, tipologia); 
		Primo prtemp = null; 
		Dolce dtemp = null; 
		Bevanda btemp = null; 
		//boolean flag = false;
		
		if(prodotti.containsKey(nome))
			ptemp=null; 
		
		else 
		{
			if(tipologia.compareTo("PR")==0)
			{ prtemp = new Primo (nome, prezzo, tipologia, ""); 
			
				primi.add(numprimi++, prtemp); 
					 prodotti.put(nome, ptemp);
					 numprodotti++;
			}
			else if(tipologia.compareTo("D")==0)
			{dtemp = new Dolce(nome, prezzo, tipologia, "");
				dolci.add(numdolci, dtemp);
				prodotti.put(nome, ptemp);
			}
			else if(tipologia.compareTo("B")==0)
			{
				btemp= new Bevanda(nome, prezzo, tipologia, -1); 
				bevande.add(numbevande, btemp);
				prodotti.put(nome, ptemp);
				
			}
			
		}
		
		/*for (Prodotto p : prodotti)
			if(p!=null && p.getNome().compareTo(nome)==0)
			{
				p.setPrezzo(prezzo);
				flag = true; 
			}*/
		
		/*if (flag == false)
		{
			if(tipologia.compareTo("PR")==0)
			{ ptemp = new Primo(nome, prezzo, tipologia, "");
				primi.add(numprimi++, prtemp); 
					ptemp = prtemp; 
				prodotti.add(numprodotti++, ptemp); 
			}
			else if(tipologia.compareTo("D")==0)
			{dtemp = new Dolce(nome, prezzo, tipologia, "");
				dolci.add(numdolci, dtemp);
				ptemp = dtemp; 
				prodotti.add(numprodotti++, ptemp); 
			}
			else if(tipologia.compareTo("B")==0)
			{
				btemp= new Bevanda(nome, prezzo, tipologia, -1); 
				bevande.add(numbevande, btemp);
				ptemp= btemp; 
				prodotti.add(numprodotti++, ptemp);
				
			}
			
		}*/
		
		return ptemp;
	}
	
	public Prodotto cercaProdotto(String nome) {
		Prodotto ptemp = null; 
		
		if (prodotti.containsKey(nome))
			ptemp = prodotti.get(nome);
		
		return ptemp;
	}
	
	public String elencoProdotti() {
		//LinkedList<Prodotto> ptemp = new LinkedList<Prodotto>(prodotti.values());
		String tostring =""; 
		
		/*for(Prodotto p : ptemp)
		{
			//if(p!=null)
			{
				if(p instanceof Primo)
				{
					for (Primo pr : primi)
						if(pr!=null && p.getNome().compareTo(pr.getNome())==0)
							tostring = tostring + pr.getNome()+", "+pr.getDescrizione();
				}
				else if (p instanceof Dolce)
				{
					for (Dolce d : dolci)
						if(d!=null && p.getNome().compareTo(d.getNome())==0)
							tostring = tostring + d.getNome()+ ", "+d.getDescrizione(); 
				}
				else if(p instanceof Bevanda)
				{
					for (Bevanda b : bevande)
						if(b!=null && p.getNome().compareTo(b.getNome())==0)
							tostring = tostring + b.getNome() + ", servire a "+b.getGradi()+" gradi"; 
				}
			}
		}*/
		for (Prodotto p : prodotti.values())
		{
			tostring += p.toString()+"\n";
		}
		
		return tostring;
	}
	
	public Ordinazione nuovaOrdinazione(int numeroTavolo, Collection<String> nomiProdotti) {
		return null;
	}
	
	public Ordinazione cercaOrdinazione(int numeroTavolo) {
		return null;
	}
	
	public Collection<Prodotto> getProdottiOrdinazione(int numeroTavolo) {
		return null;
	}
		
	public Collection<Ordinazione> getOrdinazioniCuoco(String email){
		return null;
	}
	
	public void leggiDatiRistorante(String nomeFile){
	}
}
