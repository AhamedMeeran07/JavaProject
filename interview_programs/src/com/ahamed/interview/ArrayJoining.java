package com.ahamed.interview;

public class ArrayJoining {

	public static void main(String[] args) {

		int[] a= {10,20,30};
		int[] b= {40,50};
		int len= a.length+b.length;
		int[] c= new int[len];
		
//		for(int i=0;i<a.length;i++) {
//			c[i]=a[i];
//		}
	
		for(int i=a.length+1,j=0;i<b.length;i++,j++) {
			a[i]=b[j];
		
		}
		for(int i:a) {
			System.out.println(i);
		}
		
	}

}
