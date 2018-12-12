package com.nhs.bsa.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

/**
 * 
 * @author suleyman.yildirim
 *
 */
public class RegularAmount {
	@NotNull()
	private Frequency frequency;
	
	@Size(min = 1, message = "Amount should be at least 1 pound")
	private String amount; // income

	public RegularAmount() {

	}

	public RegularAmount(Frequency frequency, String amount) {
		this.frequency = frequency;
		this.amount = amount;
	}

	@NotNull
	public Frequency getFrequency() {
		return frequency;
	}

	public void setFrequency(Frequency frequency) {
		this.frequency = frequency;
	}

	@NotNull
	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}
}
