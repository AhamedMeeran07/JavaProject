package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class DiferentSetClasses {

	public static void main(String[] args) {

		Random obj=new Random();
		
		//Set<Integer> set=new HashSet<>(); //it deon't maintain any order.
		//Set<Integer> set=new LinkedHashSet<>(); //it  maintain insertion order.
		Set<Integer> set=new TreeSet<>(); //it  maintain ascending order.


		
		for(int i=1;i<=5;i++) {
			int number=obj.nextInt(100);
			set.add(number);
			System.out.println(number);
		}
		//System.out.println("The HashSet value are: "+set); 
		//System.out.println("The LinkedHashSet value are: "+set); 
		System.out.println("The TreeSet value are: "+set); 


	}

}
