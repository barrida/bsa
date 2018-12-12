package com.nhs.bsa.validator;

import static org.junit.Assert.*;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.nhs.bsa.entity.Frequency;
import com.nhs.bsa.entity.RegularAmount;

@RunWith(SpringRunner.class)
@SpringBootTest
@ComponentScan({"com.nhs.bsa","com.nhs.bsa.controller","com.nhs.bsa.entity","com.nhs.bsa.repository", "com.nhs.bsa.validator" })

public class AmountConstraintValidatorTest {

	private static Validator validator;
	private RegularAmount regularAmount;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		validator = factory.getValidator();
	}

	@Before
	  public void setUp() {
		regularAmount = new RegularAmount(Frequency.WEEK, "25.000");
		
	  }
	
	@Test
	public void testAmountConstraintValidator() throws Exception {

		Set<ConstraintViolation<RegularAmount>> constraintViolations = validator.validate(regularAmount);
		assertEquals(1, constraintViolations.size());
		assertEquals("may not be null", constraintViolations.iterator().next().getMessage());

	}
}
