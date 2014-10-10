package nl.rsvier.icaras.dao.relatiebeheer;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import nl.rsvier.icaras.core.relatiebeheer.Kandidaat;
import nl.rsvier.icaras.core.relatiebeheer.Persoon;
import nl.rsvier.icaras.core.relatiebeheer.PersoonsRol;
import nl.rsvier.icaras.core.relatiebeheer.Werknemer;
import nl.rsvier.icaras.dao.relatiebeheer.PersoonDaoHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersoonDaoHibernateTest {

	private static ClassPathXmlApplicationContext springContext;
	private PersoonDaoHibernate pDao = springContext.getBean(PersoonDaoHibernate.class);

	@BeforeClass
	public static void startUp() {
		springContext = new ClassPathXmlApplicationContext("icarasdb-context.xml");
	}
	
	@AfterClass
	public static void tearDown() {
		springContext.close();
	}
	
	@Test
	public void testSavePersonen() {
		
		// Set session up
		SessionFactory factory = (SessionFactory) springContext.getBean("sessionFactory");
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		
		// Set data
		Persoon p1 = new Persoon();
		Persoon p2 = new Persoon();
		Persoon p3 = new Persoon();
		Persoon p4 = new Persoon();
		
		
		List<PersoonsRol> rolset1 = new ArrayList<PersoonsRol>();
		List<PersoonsRol> rolset2 = new ArrayList<PersoonsRol>();
		List<PersoonsRol> rolset3 = new ArrayList<PersoonsRol>();
		List<PersoonsRol> rolset4 = new ArrayList<PersoonsRol>();
		
		Kandidaat rol1 = new Kandidaat();
		Kandidaat rol2 = new Kandidaat();
		Kandidaat rol3 = new Kandidaat();
		Kandidaat rol4 = new Kandidaat();
		
		Werknemer wrol1 = new Werknemer();
		Werknemer wrol2 = new Werknemer();
		Werknemer wrol3 = new Werknemer();
		Werknemer wrol4 = new Werknemer();

		Date geboortedatum1 = new Date(88, 0, 21);
		Date geboortedatum2 = new Date(88, 0, 21);
		
		p1.setVoornaam("Leroy");
		p1.setAchternaam("Hoogen");
		p1.setTussenVoegsels("van den");
		p1.setGeboortedatum(geboortedatum1);
		
		p2.setVoornaam("Thomas");
		p2.setAchternaam("Slippens");
		p2.setGeboortedatum(geboortedatum2);
		
		p3.setVoornaam("Sjaak");
		p3.setAchternaam("Trekhaak");
		p3.setGeboortedatum(geboortedatum1);
		
		p4.setVoornaam("Crius");
		p4.setAchternaam("Destroyer");
		p4.setTussenVoegsels("the");
		p4.setGeboortedatum(geboortedatum1);
		
		rolset1.add(rol1);
		rolset1.add(wrol1);
		rolset2.add(rol2);
		rolset2.add(wrol2);
		rolset3.add(rol3);
		rolset3.add(wrol3);
		rolset4.add(rol4);
		rolset4.add(wrol4);
		
		try {
			p1.setPersoonsRollen(rolset1);
		} catch (Exception e) {
			System.out.println("WOOPS");
		}

		try {
			p2.setPersoonsRollen(rolset2);
		} catch (Exception e) {
			System.out.println("WOOPS");
		}
		
		try {
			p3.setPersoonsRollen(rolset3);
		} catch (Exception e) {
			System.out.println("WOOPS");
		}
		
		try {
			p4.setPersoonsRollen(rolset4);
		} catch (Exception e) {
			System.out.println("WOOPS");
		}
		
		pDao.savePersonen(p1);
		pDao.savePersonen(p2);
		pDao.savePersonen(p3);
		pDao.savePersonen(p4);
		
		// Persist Entity / Write data
		session.getTransaction().commit();
		
		// Test output
		// Todo
	}

		@Test
		public void testGetPersonen(){
			SessionFactory factory = (SessionFactory) springContext.getBean("sessionFactory");
			Session session = factory.getCurrentSession();
			session.beginTransaction();
			
			List <Persoon> persoonlijst = pDao.getPersonen();
			
			persoonlijst.get(0).setVoornaam("Jenkins");

			session.delete(persoonlijst.get(1));
			persoonlijst.remove(1);
			
			session.getTransaction().commit();
			
			Date geboortedatum = persoonlijst.get(0).getGeboortedatum();
			Date expected = new Date(88, 0, 21);
			
			assertEquals(expected, geboortedatum);
			assertEquals("Jenkins", persoonlijst.get(0).getVoornaam());
			
			System.out.println("Voornaam: " + persoonlijst.get(0).getVoornaam());
			System.out.println("Tussenvoegsels: " + persoonlijst.get(0).getTussenVoegsels());
			System.out.println("Achternaam: " + persoonlijst.get(0).getAchternaam());
			

			for(int j = 0; j  < persoonlijst.size(); j++){
			List <PersoonsRol> rollijstp1 = persoonlijst.get(j).getPersoonsRollen();
			for(int i = 0; i < rollijstp1.size(); i++) {
				if(rollijstp1.get(i) instanceof Kandidaat){
					System.out.println("Rol van " + persoonlijst.get(j).getVoornaam() + "= kandidaat");
				}
				if(rollijstp1.get(i) instanceof Werknemer){
					System.out.println("Rol van " + persoonlijst.get(j).getVoornaam() + "= Werknemer");
				}
			}	
		}
			assertEquals("Sjaak", persoonlijst.get(1).getVoornaam());
	}
		
}
	

