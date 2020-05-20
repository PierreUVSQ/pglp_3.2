package uvsq21601104;

public class Vendeur extends Employe {

  private final int commission;

  /**
   * Objet vendeur.
   * @param nom Chaine du nom
   * @param adresse Chaine de l'adresse
   * @param anciennete Entier de l'ancienneté
   * @param commission Entier de la commission
   */
  public Vendeur(String nom, String adresse, int anciennete, int commission) {

    super(nom, adresse, anciennete);
    this.commission = commission;
  }

  public double calculSalaire() {

    return super.calculSalaire() + this.commission;
  }
}
