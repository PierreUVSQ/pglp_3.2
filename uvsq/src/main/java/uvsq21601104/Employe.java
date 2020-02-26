package uvsq21601104;

public class Employe {

	protected final String nom;
	protected final String adresse;
	protected final int anciennete;
	
	public Employe(String nom, String adresse, int anciennete) {
		
		this.nom = nom;
		this.adresse = adresse;
		this.anciennete = anciennete;
		
	}
	
	public double calculSalaire() {
		
		return 1500 + (20 * this.anciennete);  
		
	}
	
}
