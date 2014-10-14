
package nl.rsvier.icaras.dao.relatiebeheer;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	PersoonDaoHibernateSpringTest.class,
	AdresDaoHibernateSpringTest.class,
})
public class RelatieDaoTestSuite {
	
	public static ClassPathXmlApplicationContext springContext;
	
	@BeforeClass
	public static void setUp() {
		springContext = new ClassPathXmlApplicationContext(
				"icarasdb-context.xml");
	}
	
	@AfterClass
	public static void tearDown() {
		springContext.close();
	}
	
}
