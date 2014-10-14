
package nl.rsvier.icaras.core.relatiebeheer;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.GregorianCalendar;

import org.junit.Before;
import org.junit.Test;

public class PersoonTest {
	
	Persoon thomas;
	Persoon thomasTweeling;
	Persoon thomasAfwijkend;
	
	// Persoon leroy; // Zonder tussenvoegsel
	
	@Before
	public void initialiseerAdressen() {
		
		thomas = new Persoon();
		thomas.setVoornaam("Thomas");
		thomas.setAchternaam("Slippens");
		thomas.setGeboorteDatum(new GregorianCalendar());
		
		thomasTweeling = new Persoon();
		thomasTweeling.setVoornaam("Thomas");
		thomasTweeling.setAchternaam("Slippens");
		thomasTweeling.setGeboorteDatum(new GregorianCalendar());
		
		thomasAfwijkend = new Persoon();
		thomasAfwijkend.setVoornaam("Crius");
		thomasAfwijkend.setAchternaam("the Devastator");
		// thomasAfwijkend.setGeboorteDatum(new GregorianCalendar());
		
		/*
		 * leroy = new Persoon();
		 * leroy.setVoornaam("Leroy");
		 * leroy.setAchternaam("Hoogen");
		 * leroy.setTussenVoegsels("van den");
		 * leroy.setGeboorteDatum(new GregorianCalendar());
		 */
		
	}
	
	@Test
	public void testEquals() throws InterruptedException {
		assertTrue("Vergeleken met zichzelf", thomas.equals(thomas));
		assertTrue("Vergeleken met adres met dezelfde attributen",
				thomas.equals(thomasTweeling));
		assertFalse("Vergeleken met ander soort object",
				thomas.equals(thomasAfwijkend));
	}
	
}
