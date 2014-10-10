
package nl.rsvier.icaras.dao.relatiebeheer;

import java.util.List;

import nl.rsvier.icaras.core.relatiebeheer.Persoon;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository("organisatieDao")
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
	
	@SuppressWarnings("unchecked")
	//@Override
	public List<Persoon> getPersonen() throws DataAccessException {
		Session session = this.sessionFactory.getCurrentSession();
		List<Persoon> lijst = session.createQuery("from Persoon")
				.list();
		return lijst;
	}
	
	//@Override
	public void savePersonen(Persoon p) throws DataAccessException {
		this.hibernateTemplate.saveOrUpdate(p);
	}
}
