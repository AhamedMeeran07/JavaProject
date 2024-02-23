package interview_programs_array;

public class ArrayDemo {

	public static void main(String[] args) {

		//int a[]=new int[5];
		//int a1[]= {10,20,30};   //single dim
		//int matrix[][]= new int[3][3];    //double dim
//		int m[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
//		a[0]=10;
//		a[1]=new Integer(30);   //autoboxing
//		a[2]=40;
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
		
//	for(int i=0;i<m.length;i++) {
//		for(int j=0;j<m.length;j++) {
//			System.out.print(m[i][j]);
//		}
//		System.out.println();
//	}
		
		//if next of 3 is 4 then 4=0 
		
//	int arr[]= {3,4,5,3,4,5,7};
//	
//	for(int i=0; i < arr.length;i++) {
//		if(arr[i]==3 && arr[i+1]==4) {
//			arr[i+1]=0;
//		}
//	}
//	
//	for(int i:arr) {
//		System.out.println(i);
//	}
		
		//sum of element in an array
	
	int a[]= {1,2,3,4,5};
	int sum=0;
//	
//	for(int i=0;i<a.length;i++) {
//		sum +=a[i];
//	}
		for(int i :a) {
			sum +=i;
		}
//		}
	System.out.println(sum);
			
	//
	
	char c[]= {'a','b','c','a'};

	

		if(c[0] == c[c.length-1]) {
			System.out.println("The charater are same");
		}else
		{
			System.out.println("They are different");
		}
	
	
		
		
		
	}

}
