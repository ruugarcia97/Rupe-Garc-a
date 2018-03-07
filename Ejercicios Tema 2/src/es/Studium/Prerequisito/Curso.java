package es.Studium.Prerequisito;

public class Curso {
		private int idCurso;
		private int idAula;
		private String fechainicio;
		private String fechafin;
		
			public Curso ()
			{
				idCurso=0;
				idAula=0;
				fechainicio="";
				fechafin="";
			}
			public Curso (int C, int A, String fi, String ff) 
			{

				idCurso = C;
				idAula= A;
				fechainicio= fi;
				fechafin= ff;
			}
				
			public void setCurso (int C)
			{
				idCurso= C;
            }
				 
			public int getCurso() 

			{
				return idCurso;
			}	 
			public void setAula (int A)
			{
				idAula= A;
            }
				 
			public int getAula() 

			{
				return idAula;
			}	 
			public void setFechainicio (String fi)
			{
				fechainicio= fi;
            }
				 
			public String getFechainicio() 

			{
				return fechainicio;
			}	 
			public void set (String fi)
			{
				fechafin= fi;
            }
				 
			public String getFechafin() 

			{
				return fechafin;
			}	 


	



	


}	