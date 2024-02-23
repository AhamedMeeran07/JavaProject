package interview_programs;

public class StringReverse {

	public static void main(String[] args) {

		String str="abcd";
		
		//Contact method
//		String rev="";
//		
//		int len=str.length();
//		
//		for(int i=len-1;i>=0;i--) {
//			rev=rev+str.charAt(i);   //concatination
//		}
//		System.out.println("Reverse String: "+rev);
		
		//Charater Array
		
		String rev="";
		
		char a[]=str.toCharArray();
		int len=a.length;
		
		for(int i=len-1;i>=0;i--) {
		rev=rev+a[i];	
		}
		System.out.println("Reverse String: "+rev);
		
		StringBuffer st=new StringBuffer(str);
		System.out.println("Reverse String: "+st.reverse());
	}

}
