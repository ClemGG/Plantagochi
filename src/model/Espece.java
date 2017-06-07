package model;

public class Espece {

	private String nomCommun;
	private String nomScientifique;
	
	
	public Espece(String nomCommun, String nomScientifique)
	{
		super();
		this.nomCommun = nomCommun;
		this.nomScientifique = nomScientifique;
	}	
	
	
	public String getNomCommun() {
		return nomCommun;
	}

	public String getNomScientifique() {
		return nomScientifique;
	}

	
	
	
}
