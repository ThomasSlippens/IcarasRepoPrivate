
package nl.rsvier.icaras.dao.relatiebeheer;

import java.util.List;

import nl.rsvier.icaras.core.relatiebeheer.Persoon;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

@Repository("IPersoonDao")
public class PersoonDaoHibernate extends SessionUtil implements IPersoonDao {
	
	public List<Persoon> getAllPersonen() {
		List<Persoon> personenlijst = (List<Persoon>) hibernateTemplate.loadAll(Persoon.class);
		return personenlijst;
	}
	
	public Persoon getPersoonById(int id) {
		return this.hibernateTemplate.load(Persoon.class, id);
	}
	
	public void savePersoon(Persoon p) {
		this.hibernateTemplate.saveOrUpdate(p);
	}
	
	public void updatePersoon(Persoon p) {
		this.hibernateTemplate.saveOrUpdate(p);
	}
	
	public void deletePersoon(Persoon p) {
		this.hibernateTemplate.delete(p);
	}
	
}
