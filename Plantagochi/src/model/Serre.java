package model;

import java.util.ArrayList;
import java.util.List;

public class Serre {
	
	private List<Plante> plantes;

	public Serre() {
		super();
		this.plantes = new ArrayList<>();
	}

	public List<Plante> getPlante() {
		return plantes;
	}
	
	
	public Plante getPlante(int idPlante)
	{
		for(Plante p : this.plantes)
		{
			if(p.getIDPLante() == idPlante)
			{
				return p;
			}
		}
		return null;
	}

	public void addPlante(Plante plante) {
		this.plantes.add(plante);
	}
	public void removePlante(Plante plante) {
		this.plantes.remove(plante);
	}
	
	public List<Plante> getPlanteByEspece(Espece esp)
	{
		List<Plante> output = new ArrayList<>();
		
		//Cette boucle for équivaut à la suivante
		
//		for(int i = 0 ; i<plantes.size(); i++)
//		{
//			Plante p = plantes.get(i);
//			if(p.getEspece() == esp)
//			{
//				output.add(p);
//			}
//		}
		
		// Les deux sont les mêmes
		
		for(Plante p : plantes)
		{
			if(p.getEspece() == esp)
			{
				output.add(p);
			}
		}
		return output;
	}

}
