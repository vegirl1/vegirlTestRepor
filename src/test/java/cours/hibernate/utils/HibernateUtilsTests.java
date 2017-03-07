package cours.hibernate.utils;

import org.junit.Assert;
import org.junit.Test;

public class HibernateUtilsTests extends AbstractHibernateTests{
	
	@Test
	public void testGetSessionFactoryDoesNotReturnNull() {
		Assert.assertNotNull("session factory is null?", HibernateUtils.getSessionFactory());
	}

}
