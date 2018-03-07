package es.Studium.Prerequisito;

public class CursoSemestres {
	

	public class CursosSemestres 
	{
		private int idCursos;
		private int idSemestres;
		private int idPrerrequisitos;
		private String curso;
		
		public CursosSemestres()
		{
			idCursos=0;
			idSemestres=0;
			idPrerrequisitos=0;
			curso="";
		}
		public CursosSemestres(int c, int s, int p, String cur) 
		{

			idCursos = c;
			idSemestres= s;
			idPrerrequisitos= p;
			curso=cur;
		}
			
		public void setidCursos (int c)
		{
			idCursos= c;
	    }
			 
		public int getidCursos() 

		{
			return idCursos;
		}	 
		public void setidSemestres (int s)
		{
			idSemestres= s;
	    }
			 
		public int getidSemestres() 

		{
			return idSemestres;
		}	 
		public void setidPrerrequisitos(int p)
		{
			idPrerrequisitos= p;
		}
		public int getidPrerrequisitos()
		{
			return idPrerrequisitos;
		}
		public void setCurso (String cur)
		{
			curso=cur;
	    }
			 
		public String getCurso() 

		{
			return curso;
		}	 
		
		
	}

}
