package nl.rsvier.icaras.dao;

import java.util.List;

import nl.rsvier.icaras.core.Persoon;

import org.springframework.dao.DataAccessException;

public interface IPersoonDao {
	
	public List<Persoon> getPersonen() throws DataAccessException;
	
	public void savePersoon(Persoon persoon) throws DataAccessException;
	
	public void deletePersoon(Persoon persoon) throws DataAccessException;

}
