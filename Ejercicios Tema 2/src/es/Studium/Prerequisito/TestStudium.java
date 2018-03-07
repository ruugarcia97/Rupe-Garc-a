package es.Studium.Prerequisito;

import java.awt.geom.Area;

public class TestStudium {
		public static void main (String[] args)
		{
			Colegio saharaui;
			Colegio sol;
			Aulas aula1saharaui;
			Aulas aula2saharaui;
			Aulas aula1sol;
			Aulas aula2sol;
			
		
		saharaui = new Colegio(1, "GrupoStudium Saharaui");
		sol = new Colegio();
		sol.setColegio(2);
		sol.setnombreColegio("GrupoStudium Sol");
		
		 aula1saharaui = new Aulas (1,35, saharaui);
		 aula2saharaui =new Aulas (2,40,saharaui);
		 aula1sol = new Aulas (3, 15, sol);
		 aula2sol = new Aulas (4,10,sol);
		 
		
		System.out.println("El numero del aula es: " + aula2sol.getIdaulas());
		aula1sol.setIdaulas(5);
		System.out.println("El numero del aula es: " + aula1sol.getIdaulas());
		
		
		saharaui.setnombreColegio(sol.getnombreColegio());
		System.out.println(sol.getnombreColegio());
		
		aula2sol.getColegio().getnombreColegio();
		System.out.println(aula2sol.getColegio().getnombreColegio());
	
		}
		}
