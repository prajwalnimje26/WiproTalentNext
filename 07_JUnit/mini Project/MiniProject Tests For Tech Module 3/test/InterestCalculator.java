package test;

import java.util.*;

import exception.InvalidAge;
import exception.InvalidAmount;
import exception.InvalidNoOfDays;

public class InterestCalculator {
	public static void main(String[] args) throws InvalidAmount, InvalidAge, InvalidNoOfDays {
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.print("\n1. Interest Calculator – SB: ");
			System.out.print("\n2. Interest Calculator – FD: ");
			System.out.print("\n3. Interest Calculator – RD: ");
			System.out.print("\n4. Exit");
			System.out.print("\nEnter your option (1..4): ");
			choice = scan.nextInt();
			switch (choice) {
			case 1:
				SBAccount sb = new SBAccount();
				System.out.println("Enter the amount in the account: ");
				double input = scan.nextDouble();
				try {
					if (input < 0) {
						throw new InvalidAmount();
					} else {
						sb.setAmount(input);
						System.out.println("Your interest will be: " + sb.calculateInterest());
					}
				} catch (InvalidAmount e) {
					System.out.println(e);
				}
				break;
			case 2:
				FDAccount fd = new FDAccount();
				System.out.println("Enter the amount in FD: ");
				double finput = scan.nextDouble();
				System.out.println("Enter the time (in days): ");
				int noOfDays = scan.nextInt();
				System.out.println("Enter the age: ");
				int age = scan.nextInt();

				try {
					if (finput < 0) {
						throw new InvalidAmount();
					} else if (noOfDays < 0) {
						throw new InvalidNoOfDays();
					} else if (age < 0) {
						throw new InvalidAge();
					} else {
						fd.setAmount(finput);
						fd.setNoOfDays(noOfDays);
						fd.setAgeOfAccountHolder(age);
						System.out.println("Your interest will be: " + fd.calculateInterest());
					}
				} catch (InvalidAmount e) {
					System.out.println(e);
				} catch (InvalidAge e) {
					System.out.println(e);
				} catch (InvalidNoOfDays e) {
					System.out.println(e);
				}
				break;
			case 3:
				RDAccount rdAccount = new RDAccount();

				System.out.print("\nEnter the RD ammount: ");
				double input3 = scan.nextDouble();

				System.out.print("\nEnter number of months: ");
				int noOfMonths = scan.nextInt();

				System.out.print("\nEnter your age: ");
				age = scan.nextInt();

				try {
					if (input3 < 0) {
						throw new InvalidAmount();
					} else if (noOfMonths < 0) {
						throw new InvalidNoOfDays();
					} else if (age < 0) {
						throw new InvalidAge();
					} else {
						rdAccount.setAmount(input3);
						rdAccount.setNoOfMonth(noOfMonths);
						rdAccount.setAgeOfACHolder(age);
						System.out.println("Interest gained: Rs. " + rdAccount.calculateInterest());
					}
				} catch (InvalidAmount e) {
					System.out.println(e);
				} catch (InvalidNoOfDays e) {
					System.out.println(e);
				} catch (InvalidAge e) {
					System.out.println(e);
				}
				break;

			case 4:
				System.out.println("Thanks for using Interest Calculator.");
				break;

			default:
				break;
			}

		} while (choice != 4);
		scan.close();
	}
}
