package interview_programs;

public class CheckPalindrome {
	public static void main(String[] args) {
		
		int num1=13421;
		int org=num1;
		System.out.println("Before reverese: "+num1);

		int rev=0;
		while(num1!=0) {
			rev=rev*10+num1%10;
			num1=num1/10;
		}
System.out.println("After reverese: "+rev);

if(rev==org) {
	System.out.println("The given no is palindrome");
}else {
	System.out.println("The given no is not a palindrome");

}
	}
}
