package es.Studium.Prerequisito;

public class Curso {
		private int idCurso;
		private int idAula;
		private String fechainicio;
		private String fechafin;
		//Este es el primer cambio que se tiene que ver desde el repositorio online para la practica de entorno de desarrollo.
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
			//este es el segundo cambio de entorno pero ahora al reves desde el repositorio a local	 
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
