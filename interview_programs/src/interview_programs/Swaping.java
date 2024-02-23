package interview_programs;

public class Swaping {

	public static void main(String[] args) {

		int a=20;
		int b=10;
		System.out.println("Before swapping "+a+" "+b);
		//Logic 1 - Third variable
//		int temp=0;
//		System.out.println("Before swapping "+a+" "+b);
//
//		temp=a;
//		a=b;
//		b=temp;
//		System.out.println("After swapping "+a+" "+b);
		
		
		//Logic 2- '+' operator
		
//		a=a+b; //20+10=30
//		b=a-b;  //30-10=20
//		a=a-b;  //30-20=10
//		System.out.println("After swapping "+a+" "+b);
		
		//Logic 2- '*' operator
		
//		a=a*b; //20*10=200
//		b=a/b; //200/10=20;
//		a=a/b; //200/20=10;
//		System.out.println("After swapping "+a+" "+b);

		//logic 4-single statement
		
		b=a+b-(a=b);
		System.out.println("After swapping "+a+" "+b);

		
		
		
	}

}
