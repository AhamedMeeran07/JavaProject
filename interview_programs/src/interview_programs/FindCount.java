package interview_programs;

public class FindCount {

	public static void main(String[] args) {

		int a=12345;
		int count=0;
		
		while (a>0) {
			int rev=a/10;
			count++;
		}
		System.out.println(count);
	}

}
