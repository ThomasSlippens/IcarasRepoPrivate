package nl.rsvier.icaras.dao.relatiebeheer;

import java.util.List;

import nl.rsvier.icaras.core.relatiebeheer.Adres;
import nl.rsvier.icaras.core.relatiebeheer.Kandidaat;
import nl.rsvier.icaras.core.relatiebeheer.Persoon;
import nl.rsvier.icaras.core.relatiebeheer.PersoonsRol;
import nl.rsvier.icaras.core.relatiebeheer.Werknemer;

import org.springframework.dao.DataAccessException;

public interface IPersoonDao {
	
	// Create
	public void savePersoon(Persoon p);
	
	// Read
	public List<Persoon> getAllPersonen();
	public Persoon getPersoonById(int id);
	
	// Update
	public void updatePersoon(Persoon p);
	
	// Delete
	public void deletePersoon(Persoon p);
	
}