package es.Studium.Prerequisito;

public class Profesores {

	public int idprofesores;
	public int idapartamentos;
	 
	public Profesores ()
	{
		idprofesores=0;
		idapartamentos = 0;
	}
	
	public Profesores (int Pr, int Ap)
	{
		idprofesores=Pr;
		idapartamentos=Ap;
	}
	public void setProfesores (int Pr)
	{
		idprofesores= Pr;
	}
	public int getProfesores ()
	{
		return idprofesores;
	}
	public void setApartamentos (int Ap)
	{
		idapartamentos= Ap;
	}
	public int getApartamentos ()
	{
		return idapartamentos;
	}
}








