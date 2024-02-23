package interview_programs;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		try (Scanner inp = new Scanner(System.in)) {
			System.out.println("Enter a number");
			int value = inp.nextInt();
			
			
			//Using algorithm
//		int rev=0;
//		while(value!=0) {
//			rev=rev*10;
//			rev=rev+value%10;
//			
//			value=value/10;
//		}
//		
//		System.out.println("Reverse number is: "+rev);
			
			
			//StringBuffer Class method
//		StringBuffer rev;
//		StringBuffer sf=new StringBuffer(String.valueOf(value));
//		 rev = sf.reverse();
//		 System.out.println("Reverse number is: "+rev);
			 
			 //StringBuilder Class Method
			StringBuilder rev;
			StringBuilder sb=new StringBuilder();
			 sb.append(value);
			  rev = sb.reverse();
			 System.out.println("Reverse number is: "+rev);
		}
		 
		
	}

}
