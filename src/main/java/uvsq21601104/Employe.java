package uvsq21601104;

public class Employe {

  protected final String nom;
  protected final String adresse;
  protected final int anciennete;

  /**
   * Désigne l'objet employé.
   * @param nom Nom de l'employé
   * @param adresse String donnant l'adress
   * @param anciennete Entier donnant le nombre d'ancienneté
   */
  public Employe(String nom, String adresse, int anciennete) {

    this.nom = nom;
    this.adresse = adresse;
    this.anciennete = anciennete;
  }

  public double calculSalaire() {

    return 1500 + (20 * this.anciennete);
  }
}
