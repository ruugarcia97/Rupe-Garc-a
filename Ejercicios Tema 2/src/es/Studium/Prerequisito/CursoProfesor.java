package es.Studium.Prerequisito;

public class CursoProfesor {


	private int idCurso;
	private int idProfesor;
	
	public CursoProfesor()
	{
		idCurso=0;
		idProfesor=0;
	}
	public CursoProfesor(int c, int p)
	{
		idCurso=c;
		idProfesor=p;
	}
	public void setidCurso(int c)
	{
		idCurso=c;
	}
	public int getidCurso()
	{
		return idCurso;
	}
	public void setidProfesor(int p)
	{
		idProfesor=p;
	}
	public int getidProfesor()
	{
		return idProfesor;
	}
}
