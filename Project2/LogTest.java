package project6011;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LogTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	/**
	 * Mylog() is to calculate ln(x)
	 */
	public void testMylog() {

		assertEquals(1.6094379124, Log.Mylog(5), 0.1);
	}

	@Test
	public void testnotMylog() {

		assertNotEquals(1.702819763, Log.Mylog(4), 0.1);
	}

}
