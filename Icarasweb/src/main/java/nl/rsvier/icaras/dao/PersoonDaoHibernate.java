package nl.rsvier.icaras.dao;

import java.util.List;

import nl.rsvier.icaras.core.Persoon;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository("persoonDao")
public class PersoonDaoHibernate implements IPersoonDao {
	
	private SessionFactory sessionFactory;
	private HibernateTemplate hibernateTemplate;

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public List<Persoon> getPersonen() throws DataAccessException {
		 Session session = sessionFactory.getCurrentSession();
		 //added transaction for easy testing, MUST BE REMOVED!!
		 session.beginTransaction();
	        List<Persoon> personenlijst = session.createQuery("from Persoon").list();
	        session.getTransaction().commit();
	        return personenlijst;
	}

	public void savePersoon(Persoon persoon) throws DataAccessException {
		 //added transaction for easy testing, MUST BE REMOVED!!
		Session session = sessionFactory.getCurrentSession();
		 session.beginTransaction();

		hibernateTemplate.saveOrUpdate(persoon);
		
        session.getTransaction().commit();
//remove all but 		hibernateTemplate.saveOrUpdate(persoon);
	}

	public void deletePersoon(Persoon persoon) throws DataAccessException {
		 //added transaction for easy testing, MUST BE REMOVED!!
		Session session = sessionFactory.getCurrentSession();
		 session.beginTransaction();

		hibernateTemplate.delete(persoon);
		
        session.getTransaction().commit();

	}

}
