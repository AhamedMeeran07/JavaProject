package com.Junit.Exxample;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class) // mention this class as parameterized
public class ParamterizedTest {
	JunitPractice obj = new JunitPractice();

	private String input;
	private String output;

	public ParamterizedTest(String input, String output) {
		this.input = input;
		this.output = output;
	}

	@Parameters
	public static Collection<String[]> testConditions() { // Method should be static
		String expectedOutput[][] = { { "AACD","CD" }, { "ACD","CD" } };
		return Arrays.asList(expectedOutput);
	}

	@Test
	public void testTruncateFirst2Positions() {
		// String actual = obj.truncateFirst2Positions("AACD"); //using variable
		// String expected= "CD";
		assertEquals(output, obj.truncateFirst2Positions(input)); // directly put inside the parameter
	}


}
