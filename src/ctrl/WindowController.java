package ctrl;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.SwingUtilities;

import model.Plante;
import model.Serre;
import view.Window;

public class WindowController implements Runnable, Observer, ActionListener {

	private Serre serre;
	private Window view;


	public WindowController(Serre serre) {
		super();
		this.serre = serre;
		for(Plante p : serre.getPlante())
		{
			p.addObserver(this);
		}
	}
	
	public Serre getModel(){
		return this.serre;
		//On s'inscrit aux events de ttes les plantes
		
	}
	
	@Override
	public void run()
	{
		//Création de la vue, affectation dans attribut View et création d'un getter sur view
		if(!SwingUtilities.isEventDispatchThread())
		{
			System.err.println("Erreur, le lancement du controller doit se faire dans lel thread de l'IHM.");
		}
		this.view = new Window();
		this.view.getBtnSwitchLumiere().addActionListener(this);
		this.view.setVisible(true);
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof Plante)
		{
			//On la caste en plante
			Plante p = (Plante) o;
			// TODO On retient la 1ère plante seulement
			if(p.getIDPLante() != 1)return;
			System.out.println("La plante " + arg + " a été mis à jour.");
			
			//Mise à jour de la vue
			
			String humAir = String.format("%.2f %%", p.getHumiditeAir());
			view.getLblHair().setText(humAir);
			String humSol = String.format("%.2f %%", p.getHumiditeSol());
			view.getLblHsol().setText(humSol);
			String temp = String.format("%.2f °C", p.getTemperatureExt());
			view.getLblT().setText(temp);
			String lumi = String.format("%.2f lux", p.getLuminosite());
			view.getLblLuminosit().setText(lumi);
			
			if(p.getLuminosite() <20)
			{
				view.getBtnSwitchLumiere().setText("Allumer");
			}
			else
			{
				view.getBtnSwitchLumiere().setText("Eteindre");

			}
			
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton btn = (JButton) e.getSource();
		if(btn.getText().equals("Eteindre"))
		{
			this.serre.getPlante(1).setLuminosite(0);
		}
		else
		{
			this.serre.getPlante(1).setLuminosite(80);
		}
		
		this.serre.getPlante(1).hasBeenChanged();
		this.serre.getPlante(1).notifyObservers(1);
	}
}
