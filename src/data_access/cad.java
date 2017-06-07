package data_access;

import model.Serre;

public interface cad extends Runnable {

	public float getTemperatureExt(int idPlante);
	public float getHumiditeAir(int idPlante);
	public float getHumiditeSol(int idPlante);
	public float getLuminosite(int idPlante);
	
	public void setModel(Serre serre);
	
}
