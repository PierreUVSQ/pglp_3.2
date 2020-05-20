package uvsq21601104;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employe {

  private List<Employe> employeList;

  /**
   * Objet Manager.
   * @param nom Chaine du nom
   * @param adresse Chaine de l'adresse
   * @param anciennete Entier de l'ancienneté
   */
  public Manager(String nom, String adresse, int anciennete) {

    super(nom, adresse, anciennete);
    employeList = new ArrayList<Employe>();
  }

  public void addEmploye(Employe e) {

    this.employeList.add(e);
  }

  public double calculSalaire() {

    return super.calculSalaire() + (employeList.size() * 100);
  }
}
