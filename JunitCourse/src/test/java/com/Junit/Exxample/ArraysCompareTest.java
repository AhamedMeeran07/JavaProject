package com.Junit.Exxample;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArraysCompareTest {
//Compare array in Junit Test
	@Test
	public void test() {
		int[] numbers = {12,3,5,7};
		int[] expected = {3,5,7,12};
		Arrays.sort(numbers);
		assertArrayEquals(expected,numbers);  //assertArrayEquals method
	}
	
	//Exception Handling
	@Test(expected=NullPointerException.class)  //Junit type handling exception
	public void testException() {
		int[] numbers = null; //if we passing an empty array{} instead of null it wil throw eception
		Arrays.sort(numbers);
		/*try {
		Arrays.sort(numbers);
		}catch(NullPointerException e) {   //its one method to handle exception
			//success
		}
		*/
	}

	//Testing Array sort Performance
	@Test(timeout=100)
	public void testSortPerformance() {
		int array[] = {12,3,6};
		for(int i=1;i<=1000000;i++)
		{
			array[0]=i;
			Arrays.sort(array);
		}
	
		
	}
}
