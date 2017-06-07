package model;

import java.util.Observable;

public class Plante extends Observable {

	private int IDPLante;
	private Espece espece;
	
	private float temperatureExt;
	private float HumiditeAir;
	private float HumiditeSol;
	private float Luminosite;
	
	
	public Plante(int iDPLante, Espece espece, float temperatureExt, float humiditeAir, float humiditeSol,
			float luminosite) {
		super();
		IDPLante = iDPLante;
		this.espece = espece;
		this.temperatureExt = temperatureExt;
		HumiditeAir = humiditeAir;
		HumiditeSol = humiditeSol;
		Luminosite = luminosite;
	}

	
	public Plante(int IDPlante, Espece esp)
	{
		this(IDPlante, esp, 0,0,0,0);
	}
	
	public int getIDPLante() {
		return IDPLante;
	}	
	public Espece getEspece() {
		return espece;
	}
	
	

	
	
	public float getTemperatureExt() {
		return temperatureExt;
	}
	public void setTemperatureExt(float temperatureExt) {
		this.temperatureExt = temperatureExt;
	}
	public float getHumiditeAir() {
		return HumiditeAir;
	}
	public void setHumiditeAir(float humiditeAir) {
		HumiditeAir = humiditeAir;
	}
	public float getHumiditeSol() {
		return HumiditeSol;
	}
	public void setHumiditeSol(float humiditeSol) {
		HumiditeSol = humiditeSol;
	}
	public float getLuminosite() {
		return Luminosite;
	}
	public void setLuminosite(float luminosite) {
		Luminosite = luminosite;
	}


	public void hasBeenChanged() {
		setChanged();
		
	}
	
	
}
