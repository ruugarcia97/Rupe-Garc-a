package es.Studium.Prerequisito;

public class Aulas {
	
	private int idAulas;
	private int numeroaulas;
	private Colegio colegio;
	//Este comentario t lo dedico ruugarcia97
	

	public Aulas() {
		idAulas=0;
		colegio= new Colegio ();
	    numeroaulas=0;
	}
	
	public Aulas (int a, int na, Colegio c)
	{
		idAulas= a;
		numeroaulas= na;	
		setColegio(c); 
		// colegio = c;
	}
	
	public void setIdaulas (int a)
	{
		idAulas= a;
	}
	public int getIdaulas ()
	{
		return idAulas;
	}
	
	public void setNumeroAulas (int na)
	{
		numeroaulas= na;
	}
	public int getNumeroaulas ()
	{		
		return numeroaulas;
	}

	public void setColegio (Colegio c)
	{
		colegio= c;
	}
	
	public Colegio getColegio () 
	{
		return colegio; 
	}
	
	





}
