package com.nhs.bsa.entity;
/**
 * 
 */


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author suleyman.yildirim
 *
 */
public class RegularAmountTest {

	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link dto.RegularAmount#getFrequency()}.
	 */
	@Test
	public void testGetFrequency() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link dto.RegularAmount#setFrequency(dto.Frequency)}.
	 */
	@Test
	public void testSetFrequency() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link dto.RegularAmount#getAmount()}.
	 */
	@Test
	public void testGetAmount() {
		RegularAmount amount = new RegularAmount(Frequency.WEEK, "25000");
		assertEquals(true, amount!=null);
	}

	/**
	 * Test method for {@link dto.RegularAmount#setAmount(java.lang.String)}.
	 */
	@Test
	public void testSetAmount() {
		fail("Not yet implemented");
	}

}
