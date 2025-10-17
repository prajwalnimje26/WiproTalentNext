package test;


public class SBAccount extends Account {

	@Override
	double calculateInterest() {
		String accountType = "Normal";

		if (accountType.equalsIgnoreCase("Normal")) {
			setInterestRate(4);
		} else if (accountType.equalsIgnoreCase("NRI")) {
			setInterestRate(6);
		}

		double amount = getAmount();
		double interestRate = getInterestRate();
		double interest = amount * interestRate / 100.0;

		return interest;
	}

}
