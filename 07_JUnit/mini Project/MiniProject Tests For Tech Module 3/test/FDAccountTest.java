package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class FDAccountTest {

	FDAccount fd = new FDAccount();

	@Test
	public void testCalculateInterest() {
		fd.setAmount(40000);
		fd.setNoOfDays(30);
		fd.setAgeOfAccountHolder(18);
		assertEquals(2200.00, fd.calculateInterest(), 0.5);
	}

}
