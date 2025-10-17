package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class SBAccountTest {

	SBAccount sb = new SBAccount();

	@Test
	public void testCalculateInterest() {
		sb.setAmount(40000);
		assertEquals(1600.00, sb.calculateInterest(), 0.9);
	}

}
