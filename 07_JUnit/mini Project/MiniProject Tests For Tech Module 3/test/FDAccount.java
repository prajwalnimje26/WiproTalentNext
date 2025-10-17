package test;


public class FDAccount extends Account {

	int noOfDays;
	int ageOfAccountHolder;

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public int getAgeOfAccountHolder() {
		return ageOfAccountHolder;
	}

	public void setAgeOfAccountHolder(int ageOfAccountHolder) {
		this.ageOfAccountHolder = ageOfAccountHolder;
	}

	@Override
	double calculateInterest() {
		double rateOfInterest = 0;
		double interest = 0;

		if (amount < 10000000) {
			if (noOfDays >= 7 && noOfDays <= 14) {
				rateOfInterest = 4.5;
			} else if (noOfDays > 15 && noOfDays <= 29) {
				rateOfInterest = 4.75;
			} else if (noOfDays >= 30 && noOfDays <= 45) {
				rateOfInterest = 5.5;
			} else if (noOfDays >= 46 && noOfDays <= 60) {
				rateOfInterest = 7;
			} else if (noOfDays >= 61 && noOfDays <= 184) {
				rateOfInterest = 7.5;
			} else if (noOfDays >= 185 && noOfDays <= 365) {
				rateOfInterest = 8;
			}

			if (ageOfAccountHolder >= 65)
				rateOfInterest += 0.5;
		} else {
			if (noOfDays >= 7 && noOfDays <= 14) {
				rateOfInterest = 6.5;
			} else if (noOfDays >= 15 && noOfDays <= 29) {
				rateOfInterest = 6.75;
			} else if (noOfDays >= 30 && noOfDays <= 45) {
				rateOfInterest = 6.75;
			} else if (noOfDays >= 46 && noOfDays <= 60) {
				rateOfInterest = 8;
			} else if (noOfDays >= 61 && noOfDays <= 184) {
				rateOfInterest = 8.5;
			} else if (noOfDays >= 185 && noOfDays <= 365) {
				rateOfInterest = 10;
			}
		}

		interest = amount * rateOfInterest / 100;

		return interest;
	}
	
}
