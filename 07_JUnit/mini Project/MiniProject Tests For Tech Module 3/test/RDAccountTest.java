package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class RDAccountTest {

	RDAccount rd = new RDAccount();

	@Test
	public void testCalculateInterest() {
		rd.setAmount(40000);
		rd.setNoOfMonth(30);
		rd.setAgeOfACHolder(18);
		assertEquals(3500.00, rd.calculateInterest(), 0.9);
	}

}
