package uvsq21601104;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void testCalculSalaireEmploye() {
    	
    	Employe e = new Employe("Toto", "totoland", 10);
    	
    	assertEquals(1400, e.calculSalaire(), 0);
    	
    	
    }
    
    @Test
    public void testVendeur() {
    	
    	Vendeur v = new Vendeur("Toto", "totoland", 10, 100);
    	assertEquals(1500, v.calculSalaire(), 0);
    	
    }
    
    
    @Test
    public void testListCalcul() {
    	
    	List <Employe>l = new ArrayList<>();
    	Vendeur v = new Vendeur("Toto", "totoland", 10, 100);
    	Employe e = new Employe("Toto", "totoland", 10);
    	l.add(e);
    	l.add(v);
    	int res = 0;
    	for(Employe tmp : l) {
    		
    		res += tmp.calculSalaire();
    		
    	}
    	assertEquals(2900, res, 0);
    }
    
    
}
