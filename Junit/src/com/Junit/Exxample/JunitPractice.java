package com.Junit.Exxample;

public class JunitPractice {
	
	public String truncateFirst2Positions(String str) {
		if(str.length() <= 2) 
			System.out.println(str.replace("A",""));
			
		String first2Char = str.substring(0, 2);
		String stringMinusFirst2Char = str.substring(2);
		return first2Char.replaceAll("A","")+stringMinusFirst2Char;
		
		
	}
	
	public boolean checkFirstLastTwoChar(String str) {
		if(str.length() <= 1) 
			return false;
		if(str.length() ==2)
			return true;
		
		String first2Chars = str.substring(0, 2);
		
		String last2Chars = str.substring(str.length()-2);
		
		return first2Chars.equals(last2Chars); 
		
		
	}

}
