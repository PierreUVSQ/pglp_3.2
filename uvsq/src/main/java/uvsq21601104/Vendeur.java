package uvsq21601104;

public class Vendeur extends Employe {

	private final int commission;
	
	public Vendeur(String nom, String adresse, int anciennete, int commission) {
		
		super(nom, adresse, anciennete);
		this.commission = commission;
	}
	
	public double calculSalaire() {
		
		return super.calculSalaire() + this.commission;
		
	}
	
	
}
