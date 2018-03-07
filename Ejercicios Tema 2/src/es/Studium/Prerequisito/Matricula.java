package es.Studium.Prerequisito;



	public class Matricula 
	{
		private int idEstudiante;
		private int idCurso;
		private String creditosconcedidos;
		
		public Matricula()
		{
			idEstudiante=0;
			idCurso=0;
			creditosconcedidos="";
		}
		public Matricula(int e,int c, String cred)
		{
			idEstudiante=e;
			idCurso=c;
			creditosconcedidos=cred;
		}
		public void setidEstudiante(int e)
		{
			idEstudiante=e;
		}
		public int getidEstudiante()
		{
			return idEstudiante;
		}
		public void setidCurso(int c)
		{
			idCurso=c;
		}
		public int getidCurso()
		{
			return idCurso;
		}
		public void setcreditosconcedidos(String cred)
		{
			creditosconcedidos=cred;
		}
		public String getcreditosconcedidos()
		{
			return creditosconcedidos;
		}
	}


