package uvsq21601104;

import static org.junit.Assert.*;

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
}
