package com.cerner.validateuser;

import static org.junit.Assert.*

import org.junit.BeforeClass
import org.junit.Test

class ValidateUserTest {
private static ValidateUser validateUser
	@BeforeClass
	public static void setUp(){
		validateUser=new ValidateUser()
	}
	@Test
	public void testValidUser() {
		def status = validateUser.validUser("IB04135")
		assertNotNull("Response is null",status)
		assertEquals("User is not valid",200,status)
	}

}
