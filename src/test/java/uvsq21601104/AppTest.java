package uvsq21601104;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/** Unit test for simple App. */
public class AppTest {
  /** Rigorous Test :-) */
  @Test
  public void shouldAnswerWithTrue() {
    assertTrue(true);
  }

  @Test
  public void testCalculSalaireEmploye() {

    Employe e = new Employe("Toto", "totoland", 10);

    assertEquals(1700, e.calculSalaire(), 0);
  }

  @Test
  public void testVendeur() {

    Vendeur v = new Vendeur("Toto", "totoland", 10, 100);
    assertEquals(1800, v.calculSalaire(), 0);
  }

  @Test
  public void testListCalcul() {

    List<Employe> l = new ArrayList<>();
    Vendeur v = new Vendeur("Toto", "totoland", 10, 100);
    Employe e = new Employe("Toto", "totoland", 10);
    l.add(e);
    l.add(v);
    int res = 0;
    for (Employe tmp : l) {

      res += tmp.calculSalaire();
    }
    assertEquals(3500, res, 0);
  }

  @Test
  public void testManagerCalcul() {

    Manager m = new Manager("Bidule", "Somewhere", 10);
    Vendeur v = new Vendeur("Toto", "totoland", 10, 100);
    Employe e = new Employe("Toto", "totoland", 10);
    m.addEmploye(e);
    m.addEmploye(v);
    assertEquals(1900, m.calculSalaire(), 0);
  }
}
