package es.Studium.Prerequisito;

public class Departamentos {
	private int idDepartamentos;
	private int idcolegio;
	private int subvencion;
	
	
	public Departamentos ()
	{
		idDepartamentos=0;
		idcolegio=0;
		subvencion=0;
		
	}
	
	public Departamentos (int De, int col, int sub)
	{
		idDepartamentos= De;
		idcolegio= col;
		subvencion= sub;
		
	}
	public void setDepartamentos (int De)
	{
		idDepartamentos= De;
	}
	public int getDepartamentos ()
	{
		return idDepartamentos;
	}
	
	public void setcolegio (int col)
	{
		idcolegio=col;
	}
	public int getcolegio ()
	{
		return idcolegio;
	}
	public void setsubvencion (int sub)
	{
		subvencion= sub;
	}
	public int getsubvencion ()
	{
		return subvencion;
		
	}
	
	
	
	
	
	
}