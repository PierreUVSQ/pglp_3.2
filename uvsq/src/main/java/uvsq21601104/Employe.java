package uvsq21601104;

public class Employe {

	private final String nom;
	private final String adresse;
	private final int anciennete;
	
	public Employe(String nom, String adresse, int anciennete) {
		
		this.nom = nom;
		this.adresse = adresse;
		this.anciennete = anciennete;
		
	}
	
	public double calculSalaire() {
		
		return 1200 + (20 * this.anciennete);  
		
	}
	
}
