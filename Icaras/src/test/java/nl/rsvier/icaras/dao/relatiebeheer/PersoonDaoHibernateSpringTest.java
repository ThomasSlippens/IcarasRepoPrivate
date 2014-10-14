
package nl.rsvier.icaras.dao.relatiebeheer;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.transaction.Transactional;

import nl.rsvier.icaras.core.relatiebeheer.Adres;
import nl.rsvier.icaras.core.relatiebeheer.Persoon;

import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate4.HibernateObjectRetrievalFailureException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
	"classpath:icarasdb-context.xml"
})
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
public class PersoonDaoHibernateSpringTest {
	
	@Autowired
	// via @ContextConfiguration wordt deze testklasse aangemeld bij de
	// ApplicationContext
	private PersoonDaoHibernate pDao;
	
	private Persoon testPersoonThomas;
	private Persoon testPersoonLeroy;
	private Persoon testPersoonMark;
	
	@Before
	public void setUp() {
		testPersoonThomas = maakTestPersoonZonderId("Thomas", "", "Slippens",
				new GregorianCalendar());
		testPersoonLeroy = maakTestPersoonZonderId("Leroy", "van den",
				"Hoogen", new GregorianCalendar());
		testPersoonMark = maakTestPersoonZonderId("Mark", "van", "Meerten",
				new GregorianCalendar(1920, 03, 29));
	}
	
	private Persoon maakTestPersoonZonderId(String voornaam,
			String tussenvoegsels, String achternaam, Calendar geboortedatum) {
		Persoon p = new Persoon();
		p.setVoornaam(voornaam);
		p.setTussenVoegsels(tussenvoegsels);
		p.setAchternaam(achternaam);
		p.setGeboorteDatum(geboortedatum);
		return p;
	}
	
	@Test
	@Transactional
	public void testSaveEnGetPersoon() {
		pDao.savePersoon(testPersoonThomas);
		assertNotNull(testPersoonThomas.getId());
		Persoon testPersoonTest = pDao
				.getPersoonById(testPersoonThomas.getId());
		assertTrue(
				"attributen vanuit database zijn gelijk aan die van het persoon voor save",
				testPersoonTest.equals(testPersoonThomas));
	}
	
	@Test
	@Transactional
	public void testGetAllPersonen() {
		pDao.savePersoon(testPersoonThomas);
		pDao.savePersoon(testPersoonLeroy);
		pDao.savePersoon(testPersoonMark);
		List<Persoon> personenlijst = pDao.getAllPersonen();
		assertTrue("Zijn er inderdaad 3 objecten geladen uit de database?",
				personenlijst.size() == 3);
		assertTrue(
				"eerste opgeslagen persoon en eerste adres uit de opgehaalde lijst zijn gelijk",
				personenlijst.get(0).equals(testPersoonThomas));
		assertTrue(
				"tweede opgeslagen persoon en tweede adres uit de opgehaalde lijst zijn gelijk",
				personenlijst.get(1).equals(testPersoonLeroy));
		assertTrue(
				"tweede opgeslagen persoon en tweede adres uit de opgehaalde lijst zijn gelijk",
				personenlijst.get(2).equals(testPersoonMark));
	}
	
	@Test(expected = HibernateObjectRetrievalFailureException.class)
	@Transactional
	public void testDeletePersoon() {
		pDao.savePersoon(testPersoonThomas);
		pDao.deletePersoon(testPersoonThomas);
		testPersoonLeroy.setId(2);
		pDao.deletePersoon(testPersoonLeroy); // het deleten van een niet
												// bestaand adres geeft geen
												// exception
		testPersoonLeroy = pDao.getPersoonById(testPersoonThomas.getId());
	}
	
	@Test
	@Transactional
	public void testUpdatePersoon() {
		pDao.savePersoon(testPersoonThomas);
		testPersoonThomas.setAchternaam(testPersoonLeroy.getAchternaam());
		pDao.updatePersoon(testPersoonThomas);
		Persoon testPersoonTest = pDao.getPersoonById(testPersoonThomas.getId());
		assertTrue("attributen geupdate achternaam is gelijk aan attributen ingeladen adres met dezelfde id", testPersoonThomas.equals(testPersoonTest));
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
