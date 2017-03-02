package com.example.emailchecker;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidatorTest {

	@Test
	public void testBasicFailure() {
		assertEquals(Validator.validateEmail("failurecase"), false);
	}
	@Test
	public void testFailureAt() {
		assertEquals(Validator.validateEmail("failurecase@"), false);
	}
	@Test
	public void testFailurePeriod() {
		assertEquals(Validator.validateEmail("failurecase."), false);
	}
	@Test
	public void testBasicSuccess() {
		assertEquals(Validator.validateEmail("sucesscase@."), true);
	}

}
