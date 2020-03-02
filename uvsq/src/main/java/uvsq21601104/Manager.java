package uvsq21601104;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employe {

	private List<Employe> l; 
	
	public Manager(String nom, String adresse, int anciennete) {
		
		super(nom, adresse, anciennete);
		l = new ArrayList<Employe>();
	}
	
	
	public void AddEmploye(Employe e) {
		
		this.l.add(e);
		
	}
	
	
	public double calculSalaire() {
		
		return super.calculSalaire() + (l.size() * 100);
	}
	
}
