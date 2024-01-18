package com.tns.day3;

public class TaxCalculation {
	// function to calculate tax
	public void calculateTax(Person obj) {
		if (obj.getAge() > 65 || obj.getGender().equalsIgnoreCase("female")) {
			obj.setTax(0);
			System.out.println("Tax not applicable");
		} else {
			if (obj.getIncome() <= 160000) {
				obj.setTax(0);
			} else if (obj.getIncome() > 160000 && obj.getIncome() <= 500000) {
				obj.setTax((obj.getIncome() - 160000) * 10 / 100);
			} else if (obj.getIncome() >= 500000 && obj.getIncome() <= 800000) {
				obj.setTax((obj.getIncome() - 500000) * 20 / 100 + 34000);
			} else {
				obj.setTax((obj.getIncome() - 800000) * 30 / 100 + 94000);
			}
		}
	}
}