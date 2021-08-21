package com.blz.user_registration.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.blz.user_registration.UserRegistration;

@RunWith(Parameterized.class)
public class UserRegistrationTest {
	
	private String userEmail;
	private boolean expectedResult;
	UserRegistration emailId;
	public UserRegistrationTest(String userEmail, boolean expectedResult) {
		super();
		this.userEmail = userEmail;
		this.expectedResult = expectedResult;
		
	}
	
	@Parameterized.Parameters
	public static Collection data() {
		
		return Arrays.asList(new Object[][] {
			{"abc@yahoo.com",true},
			{"abc-100@yahoo.com",true},
			{"abc-100@yahoo.com",true},
			{"abc111@abc.com",true},
			{"abc-100@abc.net",true},
			{"abc.100@abc.com.au",true},
			{"abc@1.com",true},
			{"abc@gmail.com.com",true},
			{"abc+100@gmail.com",true},
			
			{"abc",false},
			{"abc@.com.my",false},
			{"abc123@gmail.a",false},
			{"abc123@.com",false},
			{"abc123@.com.com",false},
			{".abc@abc.com",false},
			{"abc()*@gmail.com",false},
			{"abc@%*.com",false},
			{"abc..2002@gmail.com",false},
			{"abc.@gmail.com",false},
			{"abc@abc@gmail.com",false},
			{"abc@gmail.com.1a",false},
			{"abc@gmail.com.aa.au",false}});
	}
	
	@Before
	public void initialize() {
		emailId = new UserRegistration();
	}
	
	@Test
	public void emailValid_success() {
		boolean actual = emailId.userEmailID(userEmail);
		boolean expected = expectedResult;
		assertEquals(expected, actual);
	}

}
