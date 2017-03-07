package cours.hibernate.utils;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class AbstractHibernateTests {

	@BeforeClass
	public static void setUpClass() throws Exception{
		HibernateUtils.buildSessionFactory();		
	}
	
	@AfterClass
	public static void tearDownClass(){
		HibernateUtils.closeSessionFactory();
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

}
