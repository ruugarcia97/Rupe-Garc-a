package es.Studium.Prerequisito;

public class Colegio {


	
		private int idColegio;
		private String nombrecolegio;
	
		
		public Colegio () 
		{

			idColegio=0;
			nombrecolegio="";

		}
		
			
			public Colegio (int c, String nc)
			{
				idColegio = c;
				nombrecolegio="nc";
			}	
			
			public void setColegio (int c)
			{
				idColegio = c;
			}
			public int getColegio() 

			{
				return idColegio;
			}
			
				public void setnombreColegio (String nc)
				{
					nombrecolegio = nc;

				}	 
				public String getnombreColegio() 

				{
					return nombrecolegio;
				
				

		}
	}



