package com.Junit.Exxample;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class) // mention this class as parameterized
public class ParameterizedBooleanTest {
	JunitPractice obj = new JunitPractice();

	private String input;

	public ParameterizedBooleanTest(String input) {
		this.input = input;
	}

	@Parameters
	public static String testConditions() { // Method should be static
		String[] inputData= {"ABAB","ABCD"};
		return inputData.toString();
	}

	@Test
	public void CheckBooleanParameterizedTest() {
		
		assertTrue(obj.checkFirstLastTwoChar(input));  

	}


}
