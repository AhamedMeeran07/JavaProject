package interview_programs;

public class CheckPalindromeString {

	public static void main(String[] args) {

		String str="ababa";
		String org=str;
		System.out.println("Before reversing: "+str);

		int len=str.length();
		String rev="";
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("After reversing: "+rev);
		
		if(rev.equals(org)) {
			System.out.println(rev+" is a Palindrome String");
		}else {
			System.out.println(rev+" is not a Palindrome String");

		}
	}

}
