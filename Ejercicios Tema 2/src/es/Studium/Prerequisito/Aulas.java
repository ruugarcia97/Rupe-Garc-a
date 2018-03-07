package es.Studium.Prerequisito;

public class Aulas {
	
	private int idAulas;
	private int numeroaulas;
	private String nombreAulas;
	private Colegio colegio;
	
	

	public Aulas() {
		idAulas=0;
		colegio= new Colegio ();
		nombreAulas="";
	    numeroaulas=0;
	}
	
	public Aulas (int a, int na, string n, Colegio c)
	{
		idAulas= a;
		nombreAulas="";
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
	public void setNombreAulas (NombreAulas n)
	{
		NombreAulas=n;
	}
	
	public Colegio getNombreAulas () 
	{
		return NombreAulas; 
	}
	





}
