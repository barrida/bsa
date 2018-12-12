package com.nhs.bsa.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.nhs.bsa.entity.Frequency;
import com.nhs.bsa.entity.RegularAmount;

public class AmountConstraintValidator implements ConstraintValidator<RegularAmountConstraint, RegularAmount> {

	@Override
	public void initialize(RegularAmountConstraint constraint) {
	}

	@Override
	public boolean isValid(RegularAmount amount, ConstraintValidatorContext context) {

		if (amount == null) {
			return false;
		}
		double income = this.parseIncomeString(amount);
		return amount.getFrequency().equals(Frequency.WEEK) && income % 52 == 0
				|| amount.getFrequency().equals(Frequency.TWO_WEEK) && income % 26 == 0
				|| amount.getFrequency().equals(Frequency.FOUR_WEEK) && income % 13 == 0
				|| amount.getFrequency().equals(Frequency.MONTH) && income % 12 == 0
				|| amount.getFrequency().equals(Frequency.QUARTER) && income % 4 == 0;
	}

	/**
	 * Check if string amount has decimal value
	 * @param amount
	 * @return
	 */
	public double parseIncomeString(RegularAmount amount) {
		String value = amount.getAmount();
		if (value.contains(".")) {
			return Math.pow(10, value.substring(value.indexOf(".")).length());
		} else {
			return Double.parseDouble(value);
		}
	}
}
