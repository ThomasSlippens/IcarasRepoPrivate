package nl.rsvier.icaras.dao.relatiebeheer;

import java.util.List;

import nl.rsvier.icaras.core.relatiebeheer.Persoon;

import org.springframework.dao.DataAccessException;

public interface IPersoonDao {
	
	public List<Persoon> getPersonen() throws DataAccessException;
	public void savePersonen(Persoon p) throws DataAccessException;

}