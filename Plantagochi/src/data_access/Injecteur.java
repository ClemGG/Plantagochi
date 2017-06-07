package data_access;

import model.Plante;
import model.Serre;

public class Injecteur implements cad, Runnable {

	private Serre model  = null;
	
	
	@Override
	public float getTemperatureExt(int idPlante) {
		// TODO Auto-generated method stub
		return (float)(Math.random()*100);
	}

	@Override
	public float getHumiditeAir(int idPlante) {
		// TODO Auto-generated method stub
		return (float)(Math.random()*50);
	}

	@Override
	public float getHumiditeSol(int idPlante) {
		// TODO Auto-generated method stub
		return (float)(Math.random()*100);
	}

	@Override
	public float getLuminosite(int idPlante) {
		// TODO Auto-generated method stub
		return (float)(Math.random()*100);
	}

	@Override
	public void setModel(Serre serre) {
		this.model = serre;
		
	}

	@Override
	public void run() {
		
		while(true){
		int i = 1;
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			return;
		}
		for(Plante p : model.getPlante())
		{
			//Lecture des données de la cad
			p.setHumiditeAir(getHumiditeAir(i));
			p.setHumiditeSol(getHumiditeSol(i));
			p.setTemperatureExt(getTemperatureExt(i));
			//p.setLuminosite(getLuminosite(i));
			
			
			//Informer les observateurs
			p.hasBeenChanged();
			p.notifyObservers(i);
			i++;
		}
		
		
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			return;
		}
		
		
	}
	}
}
