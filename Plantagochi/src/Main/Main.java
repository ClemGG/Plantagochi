package Main;

import javax.swing.SwingUtilities;

import ctrl.WindowController;
import data_access.Injecteur;
import data_access.cad;
import model.Espece;
import model.Plante;
import model.Serre;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Modèle
		Serre serre = new Serre();
		//Alim du modèle
		Espece espece1 = new Espece("Tomate","Solanum lycopersicum");
		Espece espece2 = new Espece("Persil","Petroselinum crispum");
		Plante p1 = new Plante(1, espece1);
		Plante p2 = new Plante(2, espece2);
		serre.addPlante(p1);
		serre.addPlante(p2);
		
		//Contrôleur
		WindowController ctrl = new WindowController(serre);
		
		//On lance le contrôleur
		
		//Pas directement, via l'IHM
		
		//ctrl.run();
		SwingUtilities.invokeLater(ctrl);
		
		//On lance la cad
		cad dataAccess = new Injecteur();
		dataAccess.setModel(serre);
		Thread t = new Thread(dataAccess);
		t.start();
	}

}
